<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> Book Club</h1>
	<p>A place for friends to share thoughts o books.</p>

<div>
	<h2> Register</h2>
	
	<form:form method="POST" action="/registration" modelAttribute="newUser">
	
	<div>
	<form:label path="userName">name</form:label>
	<form:errors path="userName"/>
	<form:input path="userName"/>
	</div>
	
	<div>
	<form:label path="email">Email:</form:label>
	<form:errors path="email"/>
	<form:input path="email"/>
	</div>
	
	<div>
	<form:label path="password">Password:</form:label>
	<form:password path="password"/>
	<form:errors path="password"/>
	</div>
	
	<div>
	<form:label path="confirm">Confirm PW:</form:label>
	<form:password path="confirm"/>
	<form:errors path="confirm"/>
	</div>
	
	<button>Register</button>

	</form:form>
	
</div>


<div>
	<!-- User Login Form -->
	<h3> Log in</h3>
	<form:form action="/login" modelAttribute="newLogin">

	<div>
	<form:label path="email">Email:</form:label>
	<form:errors path="email"/>
	<form:input path="email"/>
	</div>

	<div>
	<form:label path="password">Password:</form:label>
	<form:errors path="password"/>
	<form:password path="password"/>
	</div>



		<button>Submit</button>
	</form:form>
</div>

</body>
</html>