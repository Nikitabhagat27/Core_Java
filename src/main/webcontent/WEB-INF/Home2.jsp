<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>welcome to ${requestScope.username}</h1></center>
<h1>My surname is ${requestScope.sname}</h1>
<h1>The list  is ${requestScope.sname}</h1>
<center><a href="menu.do">back to login</a></center>
</body>
</html>