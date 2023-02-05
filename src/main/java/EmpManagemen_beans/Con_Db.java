package EmpManagemen_beans;
import java.sql.*;

public class Con_Db {

	private String db="jdbc:mysql://localhost:3306/empmanagement";
	private String username="root";
	private String password="!@#$ZT277359ab";
	private Connection con=null;
 
	
	public Connection getCon()
{
	    String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
		
		
	    try {
			 con = DriverManager.getConnection(db,username, password);
		    }
		
		catch(Exception e)
        {
        System.out.print(e);
        e.printStackTrace();
        }
		
     return con;
}
	
	
			
}
