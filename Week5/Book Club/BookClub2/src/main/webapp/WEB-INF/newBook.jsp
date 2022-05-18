<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<h1>Add a Book to Your Shelf</h1>
<a href="/dashboard">back to the shelves</a>


<form:form action="/books/create" method="POST" modelAttribute="newBook">

	<div>
	<form:label path="title">Title</form:label>
	<form:errors path="title"/>
	<form:input path="title"/>
	</div>
	
	<div>
	<form:label path="author">Author</form:label>
	<form:errors path="author"/>
	<form:input path="author"/>
	</div>
	
	<div>
	<form:label path="bookDescription">My Thoughts</form:label>
	<form:errors path="bookDescription"/>
	<form:input path="bookDescription"/>
	</div>
	
	<form:input type="hidden" value="${loggedInUser.id}" path="user"/>
	
	
	<input type="submit" value="Submit" class="btn btn-primary"/>
	
</form:form>

</body>
</html>