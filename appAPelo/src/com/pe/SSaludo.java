package com.pe;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class SSaludo extends HttpServlet{

public void init(ServletConfig config) throws ServletException{
	super.init(config);
	System.out.println(String.format("%s --> %s","Init Saludo",config.getInitParameter("nick")));
}

public void doGet(HttpServletRequest request,HttpServletResponse response){

System.out.println(String.format("%s --> %s",Thread.currentThread().getId(),getServletConfig().getInitParameter("nick")));
try{
PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<body>");
out.println("SERVLET SALUDO");
out.println("</body>");
out.println("</html>");
out.flush();
}
catch(Exception e){
e.printStackTrace();
}

}

}