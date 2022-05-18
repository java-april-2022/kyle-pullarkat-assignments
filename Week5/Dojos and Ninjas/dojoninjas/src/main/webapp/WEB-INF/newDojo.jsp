<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body>

<h1>New Dojo</h1>
<form:form action="/dojos" method="post" modelAttribute="dojo">

    <div>
    	<%-- path name needs to match with model name --%>
        <form:label path="name">Name:</form:label>
        <form:errors class="text-danger" path="name"/>
        <form:input path="name" class="form-control"/>
    </div>
    
    <input type="submit" value="Create" class="btn btn-primary"/>
    
</form:form>    
	
</body>
</html>