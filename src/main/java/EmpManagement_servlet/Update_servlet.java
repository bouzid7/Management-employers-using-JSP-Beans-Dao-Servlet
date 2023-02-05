package EmpManagement_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import EmpManagemen_beans.*;

/**
 * Servlet implementation class Update_servlet
 */
public class Update_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
	{
		// TODO Auto-generated method stub
		
		String id1=request.getParameter("id");
		int id=Integer.parseInt(id1); 
		Emp e=new Emp();
		e=EmpDao.getEmployeeById(id);
	    request.setAttribute("emp", e);
	    request.getRequestDispatcher("updateEmp.jsp").forward(request, response);
	    
	}
	
	
}
