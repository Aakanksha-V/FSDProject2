<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>TEACHER</title>
</head>
<body>
	<form action="TeacherController" method="post">
		<label>Teacher ID: </label>
		<input type="text" name="teacherId"/><br>
		<label>Teacher Name: </label>
		<input type="text" name="teacherName"><br/>
		<input type="submit" value="Store"/>
		<input type="reset" value="reset"/>
	</form>
	<br>
	<a href="Home.jsp">HOME</a>
</body>
</html>