import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class playerData 
{
	public void setData(String name,String age,String playerRole,String battingHand,String bowlingHand,String wKeeper ) throws Exception 
	{  
		try
		{ 
			int k=Integer.parseInt(age);
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","Abhilash@213");
			Statement stmt=con.createStatement();
			stmt.execute("insert into player(name,age,role,bowl_style,bat_hand,wk,matches_played) values('"+name+"',"+k+",'"+playerRole+"','"+bowlingHand+"','"+battingHand+"','"+wKeeper+"',1);"); 
			System.out.println("Inserted into DB");
			con.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
			throw e;
		}  
	}  
}
