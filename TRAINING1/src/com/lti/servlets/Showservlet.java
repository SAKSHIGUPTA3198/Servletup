package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.model.training;
import com.lti.service.Read;


public class Showservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Read service = new Read();
		List <training> users = service.readAllUsers();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<html>");
		out.println("<table>");

		for(training user: users){
			out.println("<tr>");
			out.println("<td>"+user.getTrainingid()+"</td>");
			out.println("<td>"+user.getTrainingname()+"</td>");
			out.println("<td>"+user.getAvailableseats()+"</td>");
			//out.println("<td><a href=''>Delete</a></td>");
			out.println("<td><a href=''>Update</a></td>");
			out.println("<td><a href ='delete.do?trainingid="+user.getTrainingid()+"'>Delete</a></td>");
			out.println("</tr>");
		}
		out.println("</table>");

		out.println("</body>");
		out.println("</html>");
		
		
	}

}
