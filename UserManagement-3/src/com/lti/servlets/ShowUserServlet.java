package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.model.Users;
import com.lti.service.UserService;

public class ShowUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService service = new UserService();
		List <Users> users = service.findAllUsers();
		
		request.setAttribute("UsersList", users);
		
		RequestDispatcher rd = request.getRequestDispatcher("ViewUsers.jsp");
		rd.forward(request,response);                            
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<html>");
//		out.println("<table>");
//
//		for(Users user: users){
//			out.println("<tr>");
//			out.println("<td>"+user.getFirstname()+"</td>");
//			out.println("<td>"+user.getLastname()+"</td>");
//			out.println("<td>"+user.getMobilenumber()+"</td>");
//
//			out.println("</tr>");
//
//
//		}
//		out.println("<table>");
//
//		out.println("</body>");
//		out.println("</html>");
}

}
