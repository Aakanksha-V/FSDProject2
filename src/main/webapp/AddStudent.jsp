<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Student</title>
</head>
<body>
	<form action="StudentController" method="post">
		<label>Student ID</label>
		<input type="text" name="studentId"><br/>
		<label>Student name</label>
		<input type="text" name="studentName"><br/>
		<label>Class ID</label>
		<input type="text" name="class_id"><br/>
		<input type="submit" value="Store Record">
		<input type="reset" name="reset">
	</form>
</body>
</html>