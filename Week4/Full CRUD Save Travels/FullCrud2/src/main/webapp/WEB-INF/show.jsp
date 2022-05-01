<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">

</head>
<body>

	<div>
	
		<h1>Expense Details</h1>
		<a href="/">Go back</a>
		
		<table>
			<tr>
				<th>Expense Details:</th>
				<td><c:out value="${expense.name}"/></td>
			</tr>
			<tr>
				<th>Expense Description:</th>
				<td><c:out value="${expense.description}"/></td>
			</tr>
			<tr>
				<th>Vendor:</th>
				<td><c:out value="${expense.vendor}"/></td>
			</tr>
			<tr>
				<th>Amount Spent:</th>
				<td><c:out value="${expense.amount}"/></td>
			</tr>
		</table>
	</div>

</body>
</html>