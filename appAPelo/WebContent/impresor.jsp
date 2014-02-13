<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.util.*" %>
<%@ taglib prefix="fnltc" uri="DiceFunctions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="flaquis" uri="fluantoc"%>
<%@ taglib prefix="myTags" tagdir="/WEB-INF/tags" %>
<html>
<body>
	<H1><%=request.getAttribute("nombre")%></H1>
	<H1><%=request.getParameter("user")%></H1>
	<H1><%=request.getAttribute("sesion")%></H1>
	<H1><%=session.getCreationTime()%></H1>
	<H1><%=""+session.getMaxInactiveInterval()/60 + "min"%></H1>
	
	<H1><%=UtilApp.getContador()%></H1>
	<H1><%=application.getAttribute("pctx")%></H1>
	<H1><% application.setAttribute("pctx","desddeJSP");%></H1>
	
	<jsp:useBean id="person" class="com.bean.Persona" scope="request"/>
	<h1><jsp:getProperty name="person" property="age"/></h1>
	
	<jsp:useBean id="personApp" class="com.bean.Persona" scope="application"/>
	<h1><jsp:getProperty name="personApp" property="age"/></h1>
	
	${requestScope.person.name}<br/>
	${applicationScope.personApp.name}<br/>
	${pageContext.request.method}<br/>
	${personApp.name}<br/>
	${cookie.apodo.value}<br/>
	${initParam.mainEmail}<br/>
	
	
	${fnltc:saludar()}
	Hola <c:out value="${param.user}" default="guest"/>
	<table>
	<c:forEach var="movie" items="${movieList}" varStatus="cont">
		<tr>
			<td>${cont.count}</td>
			<td>${movie}</td>
		</tr>
	</c:forEach>
	</table>
	<c:if test="${param.user eq 'luis'}">	
		<jsp:include page="inicio.jsp"/>
	</c:if>
	
	<c:choose>
		<c:when test="${param.user eq 'luantoc'}">
			luantoc
		</c:when>
		
		<c:when test="${param.user eq 'luantoc1'}">
			luantoc1
		</c:when>
		
		<c:otherwise>
			lucho1
		</c:otherwise>
	</c:choose>
	
	${sessionScope.pelicula}<br/>
	<c:set var="pelicula" value="codigo sombra"/>
	${pageScope.pelicula}<br/>
	
	<!--Tags Handler Simple sin Body _ Inicio-->
	<!--With EL expression-->
	<flaquis:advice user="${personApp.name}"/>
	
	<!--With Scriptlet expression-->
	<flaquis:advice user='<%=request.getAttribute("nombre").toString()%>'/>
	
	<!--With Standard Action-->
	<flaquis:advice>
		<jsp:attribute name="user">${personApp.name}</jsp:attribute>
	</flaquis:advice>
	
	<flaquis:tableList lista="${movieList}"/>
	<!--Tags Handler Simple sin Body _ Fin-->
	
	<!--Tags Files Inicio-->
	<myTags:Header subTitle="Subtitulo enviado como atributo a Header.tag"/>
	
	<myTags:HeaderBody f_color="#660099">
		We take the sting out of SOAP. OK, so it’s not Jini,<br>
		but we’ll help you get through it with the least<br>
		frustration and hair loss.
	</myTags:HeaderBody>
	
	<myTags:HeaderBody>
		We take the sting out of SOAP. OK, so it’s not Jini,<br>
		but we’ll help you get through it with the least<br>
		frustration and hair loss.
	</myTags:HeaderBody>
	<!--Tags Files Fin -->
	
	<!--Tags Handler Simple con Body _ Inicio-->
	
	
	<!--Tags Handler Simple con Body _ Fin-->
</body>
</html>