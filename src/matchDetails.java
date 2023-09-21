import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class matchDetails
{
	public void setData(String Team1,String Team2,String overs,boolean t1toss,boolean optbat) throws Exception 
	{
		try
		{ 
			int k=Integer.parseInt(overs);
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","Abhilash@213");
			Statement stmt=con.createStatement();
			String toss;
			toss=Team1;
			if(!t1toss)
				toss=Team2;
			String opt="bat";
			if(!optbat)
				opt="bowl";
			stmt.execute("insert into cricket.match(team1,team2,toss,opt,overs) values('"+Team1+"','"+Team2+"','"+toss+"','"+opt+"',"+k+");"); 
			con.close();
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}  
}
