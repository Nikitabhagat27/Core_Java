<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<table class="table table-dark table-striped">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Courses</th>
      <th scope="col">Timing</th>
      <th scope="col">Gender</th>
      <th scope="col">Remark</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="rd" items="${requestScope.RD}" varStatus="loop">
    <tr>
      <th scope="row">${loop.index+1}</th>
      <td>${rd.name}</td>
      <td>${rd.course}</td>
      <td>${rd.gender}</td>
      <td>${rd.timing}</td>
      <td>${rd.remark}</td>
      <td>${rd.email}</td> 
    </tr>
    </c:forEach>
  </tbody>
</table>
</body>
</html>