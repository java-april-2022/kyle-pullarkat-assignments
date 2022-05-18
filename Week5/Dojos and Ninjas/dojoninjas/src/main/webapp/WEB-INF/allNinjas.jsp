<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body>


<h1><c:out value="${dojo.name}"/> Location Ninjas </h1>
<table border="1" class="table">

<thead>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Age</th>
	<tr>
</thead>

<tbody>
	<c:forEach items="${dojo.ninjas}" var="ninjaz">
	<tr>
		<td><c:out value="${ninjaz.firstName}"/></td>
		<td><c:out value="${ninjaz.lastName}"/></td>
		<td><c:out value="${ninjaz.age}"/></td>
	</tr>
	</c:forEach>
</tbody>
</table>

</body>
</html>