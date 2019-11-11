<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

 <c:choose>
<c:when test="${sessionScope.username != null }">

<h2>Welcome<c:out value ="${sessionScope.username}"> to Home Page.</c:out></h2>
<h3><a href='showUserservlet'>Find All Users</a></h3>
<a href ='logout.do'>Log Out</a>
</c:when>
<c:otherwise>
 <c:redirect url="login.html"></c:redirect>

</c:otherwise>
</c:choose>


<%-- 
       <%
        String user = (String)session.getAttribute("username");
       if(user != null)
       {
		out.println("<h2>Welcome "+user+" to home page.</h2>");
		out.println("<h3><a href='showUserservlet'>Find All Users</a></h3>");
		out.println("<a href ='logout.do'>Log Out</a>");
       }else
       {
    	   response.sendRedirect("login.html");
       }
		%> --%>
</body>
</html>