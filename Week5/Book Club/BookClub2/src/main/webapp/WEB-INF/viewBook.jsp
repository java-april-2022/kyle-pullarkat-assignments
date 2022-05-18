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

<h1><c:out value="${book.title}"/></h1>

<a href="/dashboard">back to the shelves</a>



<h3><c:out value="${book.user.userName}"/> read <c:out value="${book.title}"/> by <c:out value="${book.author}"/></h3>
<div>
<p>Here are <c:out value="${book.user.userName}"/>'s thoughts:</p>
</div>


	<div>
<p>-------------------------------------------------------</p>
	</div>

<p><c:out value="${book.bookDescription}"/></p>

	<div>
<p>-------------------------------------------------------</p>
	</div>


</body>
</html>