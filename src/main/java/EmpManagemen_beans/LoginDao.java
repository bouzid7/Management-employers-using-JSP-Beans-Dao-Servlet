package EmpManagemen_beans;
import java.sql.*;
import EmpManagemen_beans.*; 

public class LoginDao {

	public static boolean validate(String username,String password){  
		boolean status=false;  
		try{
		Con_Db con=new Con_Db();
		PreparedStatement ps=con.getCon().prepareStatement("select * from users where username=? and password=?");  
		ps.setString(1,username);
		ps.setString(2,password);
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();
		con.getCon().close();
		}catch(Exception e){
			
			System.out.println(e);
			
			                }
	
		return status;  
		
		}

}
