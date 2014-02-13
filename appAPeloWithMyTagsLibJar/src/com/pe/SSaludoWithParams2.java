package com.pe;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
import java.io.PrintWriter;
import com.bean.Persona;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class SSaludoWithParams2 extends HttpServlet{

public void init(ServletConfig config) throws ServletException {
	super.init(config);
	System.out.println("inicio servlet");
}

public void doGet(HttpServletRequest request,HttpServletResponse response){
try{
	HttpSession session = request.getSession();
	String param = request.getParameter("user");
	request.setAttribute("nombre","LUIS ANGEL --> " + param);
	request.setAttribute("sesion",(session.isNew())?"sesion nueva":"sesion antigua");
	
	//Probando ServletContext
	System.out.println(">> " + getServletContext().getAttribute("pctx"));
	getServletContext().setAttribute("pctx","context1");
	
	//agregando un objeto como atributo del request
	request.setAttribute("person",new Persona("LUANTOC",25));
	
	String[] movieList = {"Amelie", "Return of the King", "Mean Girls"};
	request.setAttribute("movieList", movieList);
	
	getServletContext().setAttribute("personApp",new Persona("LUANTOC1pp",26));
	
	//agregando atributo a sesion
	session.setAttribute("pelicula", "el hobbit 2");
	
	//Probando Cookies
	Cookie ck = new Cookie("apodo","LUANTOC");
	response.addCookie(ck);
	RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/impresor.jsp");
	rd.forward(request,response);
}
catch(Exception e){
 e.printStackTrace();
}
	
}

}