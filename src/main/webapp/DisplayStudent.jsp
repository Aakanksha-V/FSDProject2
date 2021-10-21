<%@page import="java.util.Iterator"%>
<%@page import="com.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Student</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
			<th>Class ID</th>
		</tr>
		<c:forEach items="${obj}" var="student">
			<tr>
				<td>${student.getStudentId()}</td>
				<td>${student.getStudentName()}</td>
				<td>${student.getClass_id()}</td>
			</tr>
		 </c:forEach>
	</table>
</body>
</html>