<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>My Bookstore</h1>
	<font color="green" size="6">${ADDED}</font>
	<%
	Object obj = request.getAttribute("MSG");
	if (obj != null) {
	%>
	<%=obj%>

	<a href="home.jsp">Go to Search Page</a>
	<%
	} else {
	obj = session.getAttribute("BOOKS");
	ArrayList<String> list = (ArrayList<String>) obj;
	for (String bname : list) {
	%>
	<form action="addtocart.do" method="post">
		<input type="hidden" name="bookName" value="<%=bname%>" /> <font
			size="5"><%=bname%><input type="submit" value="Add To Cart" /></font>
	</form>
	<%
	}
	%>
	<br />
	<form action="showcart.do">
		<input type="submit" value="Show Cart" />
	</form>
	<%
	}
	%>

</body>
</html>