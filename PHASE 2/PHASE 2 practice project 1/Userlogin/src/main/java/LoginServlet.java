

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String UserName = request.getParameter("email");
	        String password = request.getParameter("password");

	        // Hard-coded correct values for login
	        String correctUserName = "admin@example.com";
	        String correctPassword = "admin123";

	        if (UserName.equals(correctUserName) && password.equals(correctPassword)) {
	            HttpSession session = request.getSession();
	            session.setAttribute("user", UserName);
	            response.sendRedirect("dashboard");
	        } else {
	            request.setAttribute("error", "Invalid email or password");
	            request.getRequestDispatcher("error.jsp").forward(request, response);
	        }
	    }
	
		
	}


