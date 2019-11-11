package com.lti.servlets;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/first.view")
public class FirstServlet implements Servlet {

    public FirstServlet() {
    	
    	System.out.println("---FirstServletCalled---");
    	
       
    }

	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("---init Called...---");
	}

	public void destroy() {
		System.out.println("---destroyed Called---");
		
	}

	public ServletConfig getServletConfig() {
		
		System.out.println("---getServletConfig---");
		return null;
	}

	public String getServletInfo() {
		
		System.out.println("---getServletInfo---");
		return null; 
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		System.out.println("---Servlet called---");
	}

}
