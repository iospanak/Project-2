package com.Project2.web;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class GetReport extends HttpServlet {
    
       public void doGet (HttpServletRequest request,               HttpServletResponse response) throws IOException, ServletException {
    
            
            String url = new String();
            url = (String) getServletContext().getAttribute("report");
            response.sendRedirect(url);
 
     }
}
