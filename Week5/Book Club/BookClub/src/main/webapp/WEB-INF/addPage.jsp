<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
</head>
<body>
<div>

	<h1>Add to Your Book Shelf</h1>

	<a href="/welcome">Back to Shelves</a>

	<div>
		<form:form action="/books" modelAttribute="book" method="post">
			<%--Title--%>
			<div>
			 	<form:errors path="title"/>
				<form:label for="title" path="title">Title:</form:label>
				<form:input type="text" path="title"/>
			</div>
			<%--Author--%>
			<div>
				<form:errors path="author"/>
				<form:label for="author" path="author">Author:</form:label>
				<form:input type="text" path="author"/>
			</div>
			<%--Thoughts--%>
			<div>
				<form:errors path="thoughts"/>
				<form:label for="thoughts" path="thoughts">Thoughts:</form:label>
				<form:textarea path="thoughts"/>
			</div>
			<%--UserId--%>
			<div>
				<form:errors path="user"/>
				<form:input type="hidden" path="user" value="${user.id}"/>
			</div>
			<%--Submit Button--%>
			<div>
				<input type="submit" value="Submit"/>
			</div>
			
		</form:form>
	</div>



</div>

</body>
</html>