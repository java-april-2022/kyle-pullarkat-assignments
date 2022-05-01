<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<body>
<h1>Edit Expense</h1><a href="/expenses/">Go back</a>
<br>
<div>
<h1>Expense</h1>
<form:form action="/edit/${expense.id}" method="post" modelAttribute="expense">
	<input type="hidden" name="_method" value="put">

	<div>
		<form:label path="name">Expense Name: </form:label>
		<form:errors path="name"/>
		<form:input style="width:250px;" path="name"/>
	</div>

	<div>
		<form:label path="vendor">Vendor: </form:label>
		<form:errors path="vendor"/>
		<form:input style="width:250px;" path="vendor"/>
	</div>
	
	<div>
		<form:label path="amount">Amount: </form:label>
		<form:errors path="amount"/>
		<form:input style="width:250px;" type="double" path="amount"/>
	</div>
	
	<div>
		<form:label path="description">Description: </form:label>
		<form:errors path="description"/>
		<form:textarea style="width:250px;" rows="3" path="description"/>
	</div>
	
	<div>
		<input type="submit" value="Submit"/>
	</div>
	
	

</form:form>
</div>

</body>
</html>