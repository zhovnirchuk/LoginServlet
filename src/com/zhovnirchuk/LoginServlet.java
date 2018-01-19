package com.zhovnirchuk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
public class LoginServlet extends HttpServlet {
    
   private static final long serialVersionUID = 1L;
 
    
   public LoginServlet() {
   }
 
   protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
	
		PrintWriter out = response.getWriter();
		
		String message = (request.getParameter("login").equals("admin") && request.getParameter("password").equals("admin"))?"Hello there...":"Incorrect login or password!";

		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Login</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h3>" + message +"</h3>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		processRequest(request, response);

	} 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		processRequest(request, response);

	}
   
	
 
}