package com.tag;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/*
* Jerarquia : JspTag < Tag < IterationTag < TagSupport
* Tag que muestra body interno 
*/
public class ClassicTagHandler extends TagSupport{


/*
*El contenedor llama a doStartTag() cuando el JSP invoca
*el tag usando el nombre declarado en tLD.
El metodo devuelve un entero para definir el comportamiento del tag, luego de leido el tag
*/
public int doStartTag() throws JspException{
// obtengo el stream para escribir
try{
JspWriter out = pageContext.getOut();//diferente al simple ya que pageContext es un atributo heredado de la clase TagSupport
out.write("<br/><b>Escribiendo en doStartTag() <br/></b>");
}catch(IOException e){
	e.printStackTrace();
}
return SKIP_BODY;//SKIP_BODY significa que se saltara la evaluacion del body del tag,
//en este caso es valido ya que el tag no posee body
//return EVAL_BODY_INCLUDE; si EVAL_BODY_INCLUDE y esta configurada como empty body no pasa nada
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
out.write("<br/><b>Escribiendo en doEndTag() <br/></b>");
}catch(IOException e){
	e.printStackTrace();
}
return EVAL_PAGE;//EVAL_PAGE significa que le da el paso a que se evalue el resto de HTML de la pagina.
//return SKIP_PAGE;//si SKIP_PAGE significa que no se evaluara el resto de codigo HTML.
}

}  