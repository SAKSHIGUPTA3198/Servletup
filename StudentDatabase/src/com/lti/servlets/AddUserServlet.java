package com.lti.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.model.Users;
import com.lti.service.UserService;

public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rollno = request.getParameter("rollno");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String course = request.getParameter("course");
		String result = request.getParameter("result");
		
		Users user = new Users(rollno,fname , lname, course,result );
		UserService service = new UserService();
		boolean result1 = service.addUser(user);
		
		RequestDispatcher rd = request.getRequestDispatcher("showUsers.view");
		rd.forward(request, response);
	}

}
