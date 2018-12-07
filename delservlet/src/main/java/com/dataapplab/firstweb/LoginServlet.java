package com.dataapplab.firstweb;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	//private LoginService authentication = new LoginService ();
	private AuthService authentication = new DBloginService();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		String name = request.getParameter("name");
		String password = request.getParameter("password");
      boolean isValid = authentication.validateUser(name, password);
			//request.getSession().setAttribute("name", name);
		if(isValid) {    
		    request.getSession().setAttribute("name", name);
		    response.sendRedirect("/welcome");
		} else {
			request.setAttribute("errorMessage", "Invalid Credentials!!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
	}
	