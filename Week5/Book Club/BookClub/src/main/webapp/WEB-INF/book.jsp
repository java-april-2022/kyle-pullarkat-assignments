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
		<h1>Welcome, <c:out value="${user.userName}"/></h1>
		
		<h3>Books from everyone shelves:</h3>
		<a href="/logout">logout</a>
		<a href="/addPage">+ Add to my shelf</a>
		<a href="/welcome">Home</a>
		
		<div>
			<h3>
			<span><c:out value="${book.user.userName}"/></span> read 
			<span><c:out value="${book.title}"/></span> by 
			<span><c:out value="${book.author}"/></span></h3>
		</div>
		
		<div>
			<h4>Here are their thoughts:</h4>
			<hr/>
			
			<p><c:out value="${book.thoughts}"/></p>
			<hr/>
		
		</div>
		<a href="/books/${book.id}/edit">edit</a>
	</div>

</body>
</html>