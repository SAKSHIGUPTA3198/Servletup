package com.lti;

import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/date2")
public class date2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		  Date today = new Date();
		  pw.println("<html>"+"<body><h1>Today Date is</h1>");
		  pw.println("<b>"+ today+"</b></body>"+ "</html>");
		  }
		
	

	}
	
