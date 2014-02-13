package com.tag;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/*
* Jerarquia : JspTag < SimpleTag < SimpleTagSupport < SimpleBodyTagHandler
* Tag que muestra body interno 
*/
public class SimpleBodyTagHandler extends SimpleTagSupport{

private String user;

/*
*Metodo llamado para asignar valor al atributo
*/
public void setUser(String user){
 this.user = user;
}

/*
*El contenedor llama a doTag() cuando el JSP invoca
*el tag usando el nombre declarado en tLD.
*/
public void doTag() throws JspException,IOException{
// obtengo el stream para escribir
JspWriter out = getJspContext().getOut();
out.write("<b>Escribiendo en doTag() before de getJspBody().invoke(null)<br/></b>");
// obtengo el JspBody, este metodo se hereda de SimpleTag
getJspBody().invoke(null);
out.write("<br/><b>Escribiendo en doTag() despues de getJspBody().invoke(null)</b>");
			
}

}  