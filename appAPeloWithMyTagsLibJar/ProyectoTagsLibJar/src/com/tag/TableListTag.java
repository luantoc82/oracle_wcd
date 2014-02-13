package com.tag;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

public class TableListTag extends SimpleTagSupport{

private String[] lista;

/*
*Metodo llamado para asignar valor al atributo
*/
public void setLista(String[] lista){
 this.lista = lista;
}

/*
*El contenedor llama a doTag() cuando el JSP invoca
*el tag usando el nombre declarado en tLD.
*/
public void doTag() throws JspException,IOException{
// obtengo el stream para escribir
JspWriter out = getJspContext().getOut();
out.write("<table border='1'> width='50%'");
for(String s : lista){
	out.write("<tr>");
	out.write("<td> " + s + "</td>");
	out.write("</tr>");
}
out.write("</table>");	
}

}  