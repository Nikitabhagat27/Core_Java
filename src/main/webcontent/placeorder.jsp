<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bookstore</h1>
<h1>Your order has been placed successfully</h1>
<%
session.invalidate();
%>
<br/>
<a href="home.jsp">Go To Search Page</a>
</body>
</html>