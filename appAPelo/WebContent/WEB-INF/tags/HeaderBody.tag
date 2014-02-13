<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="f_color" required="false" rtexprvalue="false"%>
<img src="images/jejeje.png"/>
<em><strong>
<c:if test="${not empty f_color}">
<font color="${f_color}" >
</c:if>
<jsp:doBody/>
<c:if test="${not empty f_color}">
</font>
</c:if>
</strong></em> <br>