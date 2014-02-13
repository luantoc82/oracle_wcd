package com.tag;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

public class AdvisorTagHandler extends SimpleTagSupport{

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
out.write("Hello --> " + user);
			
}

}  