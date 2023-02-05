package EmpManagement_servlet;

import jakarta.servlet.ServletException;
import java.util.*;
import EmpManagemen_beans.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Paginate
 */
public class Paginate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  
		 String spageid=request.getParameter("page");  
		 int pageid=Integer.parseInt(spageid);  
		 int total=5;  
		 if(pageid==1){}  
		 else{ 
		     pageid=pageid-1;  
		     pageid=pageid*total+1;  
		 }  
		 List<Emp> list=EmpDao.pagination(pageid,total); 
		 request.setAttribute("emp", list);
		 request.getRequestDispatcher("listEmpPagination.jsp").forward(request, response);
		 
	}
	
}

	
