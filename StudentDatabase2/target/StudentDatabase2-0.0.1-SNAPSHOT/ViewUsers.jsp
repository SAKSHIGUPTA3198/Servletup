<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page import="com.lti.model.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#E6E6FA">

<center>
	<h3><a href='RegisterStudent.jsp'>Add User</a> | <a href='Home.jsp'>Home</a></h3>
	<table>
		<tr>
			<th>Rollno</th>
			<th>First Name</th>
			<th>Last Name </th>
				<th> Course </th>
					<th> Result </th>
			<th>Delete</th>
		</tr>
		<c:forEach var="user" items="${ requestScope.UsersList }">
			<c:url var="deleteUrl" value="delete.do">
				<c:param name="rollno" value="${ user.rollno }"></c:param>
			</c:url>
		
			<tr>
				<td> <c:out value="${ user.rollno }"></c:out> </td>
				<td> <c:out value="${ user.fname }"></c:out> </td>
				<td> <c:out value="${ user.lname }"></c:out> </td>
				<td> <c:out value="${ user.course }"></c:out> </td>
				<td> <c:out value="${ user.result }"></c:out> </td>
				
				<td><a href='<c:out value="${ deleteUrl }"></c:out>'>Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	</center>
</body>
</html>