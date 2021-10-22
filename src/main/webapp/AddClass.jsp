<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ClassesController" method="post">
		<label>Class ID: </label>
		<input type="text" name="classId"/><br>
		<label>Teacher Name: </label>
		<input type="text" name="className"><br/>
		<input type="submit" value="Store"/>
		<input type="reset" value="reset"/>
	</form>
	<br>
	<form action="ClassesController" method="get">
		<input type="submit" value="HOME"/>
	</form>
</body>
</html>