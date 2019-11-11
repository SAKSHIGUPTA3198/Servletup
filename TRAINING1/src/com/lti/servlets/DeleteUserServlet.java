package com.lti.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.service.Read;



public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String trainingid = request.getParameter("trainingid");
		 Read service = new Read();
		  boolean result = service.removeUser(trainingid);
		  //if (result){
			 //  List<Users> users = service.findAllUsers();
			  // request.setAttribute("UsersList", users);
			  
		 // }
	RequestDispatcher rd = request.getRequestDispatcher("show.view");
	rd.forward(request,response);
	
	
	
	
	

}
		
		
	}


