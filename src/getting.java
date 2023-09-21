import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class getting 
{
	void SqlGet(String a)
	{
		try {					
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","Abhilash@213");
			String query = "SELECT * FROM cricket.player where player.name='"+a+"'";
			Statement stk=con.createStatement();
			ResultSet rs = stk.executeQuery(query);
			int k=0;
			while (rs.next() && k<1)
		      {
		        stk.execute("update cricket.player set matches_played=matches_played+1 where player.name='"+a+"';"); 
		        k++;			        
		      }
			if(k==0)
			{
				stk.execute("insert into player(name,matches_played) values('"+a+"',1);"); 
				System.out.println("Inserted into DB");
			}
		}
		catch (Exception e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
