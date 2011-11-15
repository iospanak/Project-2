package com.Project2.web;


import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CurrencyConv extends HttpServlet {
         public void doPost(HttpServletRequest request,
                              HttpServletResponse response)
                              throws IOException, ServletException {

            //Load attributes from index form
              String c = request.getParameter("From");
              String b = request.getParameter("To");
              String a = request.getParameter("amount");

            //Ask Google and save the result of the GET method
              URL aURL = new URL("http://www.google.com/ig/calculator?hl=en&q="+a+c+"=?"+b);
              URLConnection conv = aURL.openConnection();
              BufferedReader in =new BufferedReader(new    InputStreamReader(conv.getInputStream()));
              String res=new String();
              String temp;
             while ((temp = in.readLine()) != null){
                  res = res + temp;
               }; 
              in.close();

            //Manipulate the JSON formatted result with Java String 
            //methods 
              String [] tokens = null;
              tokens = res.split("\"");

            //Format and print the result
              response.setContentType("text/html");
              PrintWriter out = response.getWriter();
              out.println(tokens[1].replaceAll("�",","));
              out.println("<=>");
              out.println(tokens[3].replaceAll("�",","));
           
         
  }     
         
}
 


