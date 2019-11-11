package com.lti.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class MyApplicationListener implements ServletContextListener {

    
    public MyApplicationListener() {
     
    }

	
    public void contextDestroyed(ServletContextEvent arg0)  { 
        
    	System.out.println("-----contextdestroyed");
    }

	
    public void contextInitialized(ServletContextEvent arg0)  { 
    	System.out.println("-----contextinitialized");
       
    }
	
}
