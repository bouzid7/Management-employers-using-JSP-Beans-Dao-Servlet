package EmpManagement_servlet;

import java.io.IOException;  
import java.io.PrintWriter;
import EmpManagemen_beans.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;  
 
public class Insert_servlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {   
          
        String nom=request.getParameter("nom");  
        String prenom=request.getParameter("prenom");  
        String gender=request.getParameter("gender");  
        String statut=request.getParameter("statut");  
        String matricule=request.getParameter("matricule");
        String email=request.getParameter("email");
        String dateN=request.getParameter("dateN");
        String service=request.getParameter("service");
        String ville=request.getParameter("ville");
        int matr=Integer.parseInt(matricule);  
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
          
        int status=EmpDao.insert(e);  
        if(status>0)
        {  
        	  
            String message="Record saved successfully!"; 
            request.setAttribute("message", message);
            request.getRequestDispatcher("addEmp.jsp").forward(request, response);  
            
        }
        else
        {
        	
        	String message="Sorry! unable to save record"; 
        	request.setAttribute("message", message);
            request.getRequestDispatcher("addEmp.jsp").include(request, response);
            
        }  
          
       
    }
  
}
	