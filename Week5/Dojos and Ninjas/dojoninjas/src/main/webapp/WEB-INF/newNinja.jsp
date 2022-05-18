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

<h1>New Ninja</h1>
<form:form action="/ninjas" method="post" modelAttribute="ninja">



	<p>
	<%-- path name needs to match with model name --%>
        <form:label path="dojo">Dojo:</form:label>     
        <form:select path="dojo">
        
        	<c:forEach var="Dojoz" items="${dojos}">
	        	<option value="${Dojoz.id}"><c:out value="${Dojoz.name}"/></option>
        	</c:forEach>
        </form:select>
    </p>


    <div class="form-group">
        <form:label path="firstName">First Name:</form:label>
        <form:errors class="text-danger" path="firstName"/>
        <form:input path="firstName" class="form-control"/>
    </div>
    
    <p>
        <form:label path="lastName">Last Name:</form:label>
        <form:errors class="text-danger" path="lastName"/>
        <form:input path="lastName" class="form-control"/>
    </p>
    <p>
        <form:label path="age">Age:</form:label>
        <form:errors class="text-danger" path="age"/>
        <form:input path="age" class="form-control"/>
    </p>
    
    
    <input type="submit" value="Create" class="btn btn-primary"/>
    
</form:form>  
	
</body>
</html>