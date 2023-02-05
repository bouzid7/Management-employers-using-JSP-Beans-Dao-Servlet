package EmpManagement_servlet;

import jakarta.servlet.ServletException;
import java.util.*;
import  EmpManagemen_beans.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class getAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		// TODO Auto-generated method stub
		
		 List<Emp> listEmp=new ArrayList<Emp>();
		listEmp=EmpDao.getAllEmployees(); 
		request.setAttribute("emp", listEmp);
		 request.getRequestDispatcher("listEmp.jsp").forward(request, response);
		
	}

}
