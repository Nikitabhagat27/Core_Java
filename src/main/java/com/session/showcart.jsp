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
<h1>Show Cart</h1>
<%
	Object obj = request.getAttribute("MSG");
	if (obj != null) {
	%>
	<%=obj%>

	<a href="home.jsp">Go to Search Page</a>
	<%
	} else {
	obj = request.getAttribute("CART");
	ArrayList<String> list = (ArrayList<String>) obj;
	for (String bname : list) {
	%>
	<form action="removefromcart.do" method="post">
		<input type="hidden" name="bookName" value="<%=bname%>" /> <font
			size="5"><%=bname%><input type="submit" value="Remove From Cart" /></font>
	</form>
	<%
	}
	%>
	<br />
	<% if(list.size()>0){
		%>
		<a href="placeorder.jsp">PLACE ORDER</a>
	<% }%>

	<%
	}
	%>
	<br/>
	<a href="showbooks.jsp">ADD TO CART</a>
</body>
</html>