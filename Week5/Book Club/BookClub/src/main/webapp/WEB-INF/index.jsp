<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title></title>
</head>
<body>

<h1>Book Club</h1>
<p>A place for friends to share thoughts on books.</p>

	<h2>Register</h2>

	<div>
		<form:form action="/register" modelAttribute="newUser">
		
			<div>
			 	<form:errors path="userName"/>
				<form:label for="userName" path="userName">User Name:</form:label>
				<form:input type="text" path="userName"/>
			</div>
			
			<div>
				<form:errors path="email"/>
				<form:label for="email" path="email">Email:</form:label>
				<form:input type="text" path="email"/>
			</div>
			
			<div>
				<form:errors path="password"/>
				<form:label for="password" path="password">Password:</form:label>
				<form:input type="text" path="password"/>
			</div>
			
			<div>
				<form:errors path="confirm"/>
				<form:label for="" path="confirm">Confirm:</form:label>
				<form:input type="text" path="confirm"/>
			</div>
			
			<div class="form-row">
				<input type="submit" value="Submit"/>
			</div>
			
		</form:form>
	</div>

<div>
		<form:form action="/login" modelAttribute="newLogin">
			<div>
				<form:errors path="email"/>
				<form:label for="email" path="email">Email:</form:label>
				<form:input type="text" path="email"/>
			</div>
			
			<div>
				<form:errors path="password"/>
				<form:label for="password" path="password">Password:</form:label>
				<form:input type="text" path="password"/>
			</div>
			
			<div class="form-row">
				<input type="submit" value="Submit"/>
			</div>
		
		</form:form>
	</div>

</body>
</html>