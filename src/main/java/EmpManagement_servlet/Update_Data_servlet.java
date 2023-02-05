package EmpManagement_servlet;
import EmpManagemen_beans.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;  
/**
 * Servlet implementation class AllEmp
 */
public class Update_Data_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		// TODO Auto-generated method stub
	    
        String nom=request.getParameter("nom");  
        String prenom=request.getParameter("prenom");  
        String gender=request.getParameter("gender");  
        String statut=request.getParameter("statut");  
        String matricule=request.getParameter("matricule");
        String email=request.getParameter("email");
        String dateN=request.getParameter("dateN");
        String service=request.getParameter("service");
        String ville=request.getParameter("ville");
        String idU=request.getParameter("idU");
        int matr=Integer.parseInt(matricule); 
        int id=Integer.parseInt(idU); 
        Emp e=new Emp();  
        e.setNom(nom);  
        e.setPrenom(prenom);  
        e.setGender(gender);  
        e.setStatut(statut);  
        e.setMatricule(matr);
        e.setEmail(email);
        e.setDateN(dateN);
        e.setService(service);
        e.setVille(ville);
        e.setId(id);
        
        int status=EmpDao.update(e);  
        if(status>0)
        {  
        	  
            String message="Record updated successfully!"; 
            request.setAttribute("message", message);
            request.getRequestDispatcher("listEmp.jsp").forward(request, response);  
            
        }
        
        else
        	
        {
        	
        	String message="Sorry! unable to update record"; 
        	request.setAttribute("message", message);
            request.getRequestDispatcher("updateEmp.jsp").include(request, response);
            
        }
        
        
        
         
	}

	
}
