package com.pe;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class SSaludo extends HttpServlet{

public void doGet(HttpServletRequest request,HttpServletResponse response){


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