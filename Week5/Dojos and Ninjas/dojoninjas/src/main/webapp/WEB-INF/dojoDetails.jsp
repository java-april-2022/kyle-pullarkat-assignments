<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>dojoDetailz</title>
</head>
<body>


<h1><c:out value='${dojo.name}'/> Location Ninjas </h1>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
<tr>
<c:forEach items="${dojo.ninjas}" var="ninja">
<td><c:out value="${ninja.firstName}"/></td>
<td><c:out value="${ninja.lastName}"/></td>
<td><c:out value="${ninja.age}"/></td>
</c:forEach>
</tr>
</table>

</body>
</html>