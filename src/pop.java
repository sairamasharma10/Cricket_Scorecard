import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class pop 
{
	void SqlGet(int score,boolean wkt,boolean extra,String bat1,String bowler)
	{
		try {					
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","Abhilash@213");
			int wicket=0;
			int ext=0;
			if(wkt==true)
				wicket=1;
			if(extra==true)
				ext=1;
			String query = "insert into match_(matchid,score,isout,extra,batterid,bowlerid,innings) values(1,"+score+","+wicket+","+ext+",'"+bat1+"','"+bowler+"',1)";
			Statement stk=con.createStatement();
			stk.execute(query);
			System.out.println("SuccessFully Entered into Database");
		}
		catch (Exception e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
