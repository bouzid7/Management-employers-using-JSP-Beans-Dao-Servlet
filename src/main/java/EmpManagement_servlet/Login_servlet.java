package EmpManagement_servlet;
import EmpManagemen_beans.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Login_servlet
 */
public class Login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	   
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		    String username=request.getParameter("username");  
		    String password=request.getParameter("pass");  
		          
		    if(LoginDao.validate(username, password))
		    {  
		        RequestDispatcher rd=request.getRequestDispatcher("home.jsp");  
		        rd.forward(request,response);
	         }  
		   
		   else
		    {
		       // out.print("Sorry username or password error");  
		        RequestDispatcher rd=request.getRequestDispatcher("index.html");  
		       // rd.include(request,response);  
		        rd.forward(request,response);
		    }  
	     
	}

}
