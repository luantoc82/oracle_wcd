package com.tag;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/*
* Jerarquia : JspTag < Tag < IterationTag < TagSupport
* Tag que muestra body interno con LOOP
*/
public class ClassicInner extends TagSupport{

private static final String FORMATO_TEXTO = "<br/><font color='%s'>%s</font><br/>";
/*
*El contenedor llama a doStartTag() cuando el JSP invoca
*el tag usando el nombre declarado en tLD.
El metodo devuelve un entero para definir el comportamiento del tag, luego de leido el tag
*/
public int doStartTag() throws JspException{

// obtengo el stream para escribir
try{
ClassicParent cp = (ClassicParent)getParent();
JspWriter out = pageContext.getOut();//diferente al simple ya que pageContext es un atributo heredado de la clase TagSupport
out.write(String.format(FORMATO_TEXTO,(cp.getColor() == null)?"#000":cp.getColor(),"Escribiendo en doStartTag() de Inner"));

}catch(IOException e){
	e.printStackTrace();
}
return SKIP_BODY;// si EVAL_BODY_INCLUDE significa que evalua el cuerpo de la etiqueta
}



/*
*El contenedor llama a doEndTag() cuando el JSP invoca
*el fin del tag usando el nombre declarado en tLD.
El metodo devuelve un entero para definir el comportamiento del tag, luego de leido el tag de final
*/
public int doEndTag() throws JspException{
// obtengo el stream para escribir
try{
JspWriter out = pageContext.getOut();//diferente al simple ya que pageContext es un atributo heredado de la clase TagSupport
out.write("<br/>Escribiendo en doEndTag() de Inner <br/>");
}catch(IOException e){
	e.printStackTrace();
}
//return EVAL_PAGE;//EVAL_PAGE significa que le da el paso a que se evalue el resto de HTML de la pagina.
return EVAL_PAGE;//si SKIP_PAGE significa que no se evaluara el resto de codigo HTML.
}

}  