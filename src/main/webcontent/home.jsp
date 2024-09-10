<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Book Library</h1>
<form action="searchbook.do" method="post">
<select name="category">
<option value="Select">Select</option>
<option value="Java">Java</option>
<option value="Testing">Testing</option>
<option value=".Net">Dot Net</option>
<option value="Python">Python</option>
</select>
<input type="submit" value="SearchBook"/>
</form>
</center>
</body>
</html>