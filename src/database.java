import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
	public class database
	{
		public void setData(String pname,String runs,String balls,String four,String six) throws Exception 
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","Abhilash@213");
				Statement stmt=con.createStatement();
				stmt.execute("insert into cricket.bat(batname,runs,balls,four,six) values('"+pname+"','"+runs+"','"+balls+"','"+four+"','"+six+"');"); 
				con.close();
			}
			catch(Exception e)
			{ 
				System.out.println(e);
			}  
		}  
	}
