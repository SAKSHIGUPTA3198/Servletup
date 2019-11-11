<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int count = 0;
public int getNumber(){
	return ++count;
}
public void jspInit(){
	System.out.println("jsp init called");
}
public void jspDestroy(){
	System.out.println("jsp init jspdestroy");
}
%>
<%
String str = request.getParameter("txtNumber");
if(str!=null)
{out.println("Parameter Value:"+str);

}
%>
<p>
This is html p tag.
</p>
Parameter Value using expression:<%= str  %><br>

<% int c=getNumber();
out.println("calling method using scriptlet:"+c); 
%>
<br>
calling method using expression:<%=getNumber() %>

</body>
</html>