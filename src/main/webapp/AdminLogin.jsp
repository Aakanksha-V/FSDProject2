<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h2>Student Academy</h2>
	<form action="AdminController" method="post">
		<label>Email Id: </label>
		<input type="email" name="email"><br/>
		<label>Password: </label>
		<input type="password" name="pass"><br/>
		<input type="submit" value="SingIn!"/>
		<input type="reset" value="reset"/>
	</form>
</body>
</html>