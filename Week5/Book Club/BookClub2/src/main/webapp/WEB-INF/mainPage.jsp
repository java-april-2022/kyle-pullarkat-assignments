<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<h1>Welcome, <c:out value="${loggedInUser.userName}"/></h1>

<p>Books from everyone's shelves </p>

<a href="/logout">Logout</a>
<a href="/new">+ Add a to my shelf!</a>

<table border="1">

	<thead>

	<tr>
		<th>ID</th>
		<th>Title</th>
		<th>Author Name</th>
		<th>Posted By</th>
	</tr>

	</thead>

	<tbody>
	<c:forEach items="${books}" var="bookz">
		<tr>
			<td><c:out value="${bookz.id}"/></td>
			<td><a href="/books/bookDetails/${bookz.id}">"${bookz.title}"</a></td>
			<td><c:out value="${bookz.author}"/></td>
			<td><c:out value="${bookz.user.userName}"/></td>
		</tr>
	</c:forEach>
	</tbody>

</table>


</body>
</html>