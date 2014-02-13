package com.tag;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/*
* Jerarquia : JspTag < SimpleTag < SimpleTagSupport < SimpleBodyTagHandler
* Tag que muestra body interno con un LOOP
*/
public class SimpleBodyIterTagHandler extends SimpleTagSupport{

private String[] pelis = {"Monsoon Wedding", "Saved!", "Fahrenheit 9/11","El Señor de los Anillos","Monsoon Wedding", "Saved!", "Fahrenheit 9/11","El Señor de los Anillos","Monsoon Wedding", "Saved!", "Fahrenheit 9/11","El Señor de los Anillos","Monsoon Wedding", "Saved!", "Fahrenheit 9/11","El Señor de los Anillos"};

/*
*El contenedor llama a doTag() cuando el JSP invoca
*el tag usando el nombre declarado en tLD.
*/
public void doTag() throws JspException,IOException{
// obtengo el stream para escribir
int i=1;
JspWriter out = getJspContext().getOut();
out.write("<br/><b>Escribiendo en doTag() before de getJspBody().invoke(null)<br/></b>");
// obtengo el JspBody, este metodo se hereda de SimpleTag
for(String p : pelis){
	getJspContext().setAttribute("movie",p);
	i++;
	getJspBody().invoke(null);
}
out.write("<br/><b>Escribiendo en doTag() despues de getJspBody().invoke(null) " + i + "</b>");
			
}

}  