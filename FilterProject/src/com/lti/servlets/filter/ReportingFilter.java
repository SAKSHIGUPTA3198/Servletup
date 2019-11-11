package com.lti.servlets.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ReportingFilter implements Filter {

    
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req =(HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		 String txtBox = req.getParameter("txtBox");
		 System.out.println("-->"+txtBox);
		 if(txtBox == null || txtBox.trim().equals("")){
			 res.sendRedirect("index.jsp");
			  
		 }else{
			 
		String host = request.getRemoteHost();
		String uri = req.getRequestURI();
		System.out.println("The Host"+host+"access this"+uri+"at"+new Date());
		chain.doFilter(request, response);
	}
}
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
