<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
</head>
<body>

	<div>

		<h1>Save Travels</h1>
	
		<table>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
			</tr>
			
			<c:forEach var="eachExpense" items="${expenses}">
			
				<tr>
					<td><a href="/expenses/${eachExpense.id}"><c:out value="${eachExpense.name}"/></a></td>
					<td><c:out value="${eachExpense.vendor}"/></td>
					<td>$<c:out value="${eachExpense.amount}"/></td>
					<td><a href="/edit/<c:out value="${eachExpense.id}"/>">edit</a> 
					<form action="/expenses/${eachExpense.id}" method="post">
					    <input type="hidden" name="_method" value="delete">
					    <input type="submit" value="Delete">
					</form>
					</td>
				</tr>
			
			</c:forEach>
		
		</table>
		
		<h2>Add an Expense:</h2>
		
		<form:form action="/expenses" method="post" modelAttribute="expense">
		
			<div>
				<form:label path="name">Name of Product(s):</form:label>
				<form:errors path="name"/>
				<form:input path="name" type="text"/>
			</div>
			
			<div>
				<form:label path="description">Description:</form:label>
				<form:errors path="description"/>
				<form:input path="description" type="text"/>
			</div>
			
			<div>
				<form:label path="vendor">Vendor:</form:label>
				<form:errors path="vendor"/>
				<form:input path="vendor" type="text"/>
			</div>
			
			<div>
				<form:label path="amount">Amount:</form:label>
				<form:errors path="amount"/>
				<form:input path="amount" type="double"/>
			</div>
			
			<input type="submit" value="Add Expense"/>
		
		</form:form>
		
	</div>
</body>
</html>
