<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Student</title>
<link href="css/Student.css" rel="stylesheet" />
<script src="js/RegisterForm.js"></script>
</head>
<body bgcolor="#E6E6FA">


<center>


	<form action="add.do" id="frm" method="post">
	<h2>REGISTER STUDENT</h2>
		<table>
			<tr>
				<td>RollNo</td>
				<td><input type="text" name="rollno" id="rollno"></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" id="fname"></td>
			</tr>
			
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname" id="lname"></td>
			</tr>
			<tr>
				<td>Course</td>
				<td><input type="text" name="course" id="course"></td>
			</tr>
			<tr>
				<td>Result</td>
				<td><input type="text" name="result" id="result"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="Register" onclick="validateUser();"></td>
			</tr>
		</table>
	</form>
	</center>
</body>
</html>