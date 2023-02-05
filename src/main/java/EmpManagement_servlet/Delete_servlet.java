package EmpManagement_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import EmpManagemen_beans.Emp;
import EmpManagemen_beans.EmpDao;

/**
 * Servlet implementation class Delete_servlet
 */
public class Delete_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		
	     
        String id1=request.getParameter("id");  
      
        int id=Integer.parseInt(id1);  
       
          
        int status=EmpDao.delete(id);  
        if(status>0)
        {  
        	  
            String message="Record deleted successfully!"; 
        	HttpSession session = request.getSession();
             session.setAttribute("message",message);
            request.getRequestDispatcher("getAll").forward(request, response);  
            
        }
        else
        {

        	String message="Sorry! unable to delete record";
        	HttpSession session = request.getSession();
   
             session.setAttribute("message",message);
        
            request.getRequestDispatcher("getAll").forward(request, response);
            
        }
          
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
