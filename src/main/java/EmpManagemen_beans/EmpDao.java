package EmpManagemen_beans;
import java.util.*;  
import java.sql.*;
import EmpManagemen_beans.Con_Db;
import EmpManagemen_beans.Emp;

public class EmpDao { 
  
/*---------------------Insert -------------------------------*/
	
    public static int insert(Emp e){  
        int status=0;  
        try{  
        	  Con_Db con=new Con_Db();
PreparedStatement ps=con.getCon().prepareStatement("insert into emp(nom,prenom,gender,statut,matricule,email,dateN,service,ville) values (?,?,?,?,?,?,?,?,?)"); 

            ps.setString(1,e.getNom());  
            ps.setString(2,e.getPrenom());  
            ps.setString(3,e.getGender());  
            ps.setString(4,e.getStatut());
            ps.setInt(5,e.getMatricule());
            ps.setString(6,e.getEmail());
            ps.setString(7,e.getDateN());
            ps.setString(8,e.getService());
            ps.setString(9,e.getVille());
            
            status=ps.executeUpdate();  
              
            con.getCon().close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
    
 /*---------------------update-------------------------------*/
    
    public static int update(Emp e){  
        int status=0;  
        try{  
        	 Con_Db con=new Con_Db();  
            PreparedStatement ps=con.getCon().prepareStatement(  
                         "update emp set nom=?,prenom=?,gender=?,statut=?,matricule=?,email=?,dateN=?,service=?,ville=? where id=?");  
            ps.setString(1,e.getNom());  
            ps.setString(2,e.getPrenom());  
            ps.setString(3,e.getGender());  
            ps.setString(4,e.getStatut());
            ps.setInt(5,e.getMatricule());
            ps.setString(6,e.getEmail());
            ps.setString(7,e.getDateN());
            ps.setString(8,e.getService());
            ps.setString(9,e.getVille());
            ps.setInt(10,e.getId());
              
            status=ps.executeUpdate();  
              
            con.getCon().close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    
 /*---------------------delete-------------------------------*/
    
    public static int delete(int id){  
        int status=0;  
        try{  
        	 Con_Db con=new Con_Db();  
            PreparedStatement ps=con.getCon().prepareStatement("delete from emp where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.getCon().close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    
/*--------------------- (Retrieve)get one employee-------------------------------*/
    
    public static Emp getEmployeeById(int id){  
        Emp e=new Emp();  
          
        try{  
        	 Con_Db con=new Con_Db();   
            PreparedStatement ps=con.getCon().prepareStatement("select * from emp where id=?");  
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){
                e.setId(rs.getInt(1));  
                e.setNom(rs.getString(2));  
                e.setPrenom(rs.getString(3));  
                e.setGender(rs.getString(4));
                e.setStatut(rs.getString(5)); 
                e.setMatricule(rs.getInt(6));
                e.setEmail(rs.getString(7));
                e.setDateN(rs.getString(8));
                e.setService(rs.getString(9));
                e.setVille(rs.getString(10));  
            }  
            con.getCon().close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    
/*--------------------- (Retrieve)get all employees-------------------------------*/
    
    public static List <Emp> getAllEmployees(){  
    	
        List<Emp> list=new ArrayList<Emp>(); 
          
        try{
        	 Con_Db con=new Con_Db();    
            PreparedStatement ps=con.getCon().prepareStatement("select * from emp");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setId(rs.getInt(1));  
                e.setNom(rs.getString(2));  
                e.setPrenom(rs.getString(3));  
                e.setGender(rs.getString(4));
                e.setStatut(rs.getString(5)); 
                e.setMatricule(rs.getInt(6));
                e.setEmail(rs.getString(7));
                e.setDateN(rs.getString(8));
                e.setService(rs.getString(9));
                e.setVille(rs.getString(10));  
                list.add(e);
            }
            con.getCon().close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }
    
    
    public static List<Emp> pagination(int start,int total){  
        List<Emp> list=new ArrayList<Emp>();  
        try{
        	 Con_Db con=new Con_Db();;  
            PreparedStatement ps=con.getCon().prepareStatement("select * from emp limit "+(start-1)+","+total);  
            ResultSet rs=ps.executeQuery(); 
            while(rs.next()){
            	 Emp e=new Emp();  
                 e.setId(rs.getInt(1));  
                 e.setNom(rs.getString(2));  
                 e.setPrenom(rs.getString(3));  
                 e.setGender(rs.getString(4));
                 e.setStatut(rs.getString(5)); 
                 e.setMatricule(rs.getInt(6));
                 e.setEmail(rs.getString(7));
                 e.setDateN(rs.getString(8));
                 e.setService(rs.getString(9));
                 e.setVille(rs.getString(10));  
                 list.add(e);
            }  
            con.getCon().close();  
        }catch(Exception e){
        	
        	System.out.println(e);
        	
        	} 
        
        return list;  
    }
    
}  
