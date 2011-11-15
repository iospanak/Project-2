package com.Project2.web;

import javax.servlet.*;

public class ContextListener implements ServletContextListener{

     public void contextInitialized(ServletContextEvent event){
       
             ServletContext sc = event.getServletContext();
             String report = "http://iospanak.wordpress.com/2011/11/15/project-2-report";
             sc.setAttribute("report",report);
     }  
  
     public void contextDestroyed(ServletContextEvent event) {}

}
