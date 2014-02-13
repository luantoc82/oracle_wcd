<%@ page contentType="text/html; charset=iso-8859-1" %>
<%@ taglib prefix="fnltc" uri="DiceFunctions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="flaquis" uri="fluantoc"%> <!--Tag Handler Simple -->
<%@ taglib prefix="myTags" tagdir="/WEB-INF/tags" %> <!--Tag Files -->
<html>
<body>
	<% pageContext.setAttribute("pctx","desddeJSP");%>
	<h1>Probando Tags Simple con Body111</h1>
	<!--Tags Handler Simple con Body _ Inicio-->
	<flaquis:sbody>
		We take the sting out of SOAP. OK, so it’s not Jini,<br>
		but we’ll help you get through it with the least<br>
		frustration and hair loss ${pctx} . ${pageScope.pctx}.
	</flaquis:sbody>
	
	<!--Tags Handler Simple con Body _ Fin-->
	
	<!--Tags Handler Simple con Body con Iteracion _ Inicio-->
	<table>
	<flaquis:sbodyIter>
		<tr>
			<td>${movie}</td>
		</tr>	
	</flaquis:sbodyIter>
	</table>
	<!--Tags Handler Simple con Body con Iteracion _ Fin-->
	
	<flaquis:sclasic />
	<p>
		We take the sting out of SOAP. OK, so it’s not Jini,<br>
		but we’ll help you get through it with the least<br>
		frustration and hair loss ${pctx} . ${pageScope.pctx}.
	</p>

	<flaquis:sclasicb>
		Este es el body
	</flaquis:sclasicb>	
	
	<table border="1">
	<flaquis:sclasicbIter>
		<tr>
			<td>${movie1}</td>
		</tr>	
	</flaquis:sclasicbIter>
	</table>
	
	<flaquis:cParent color="#3366FF">
		<flaquis:cInner/>
		<flaquis:cInner/>
		<flaquis:cInner/>
	</flaquis:cParent>
</body>
</html>