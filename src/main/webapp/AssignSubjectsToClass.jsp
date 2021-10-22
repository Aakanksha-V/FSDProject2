<%@page import="com.entity.Subject"%>
<%@page import="com.entity.Classes"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Class_SubjectController" method="post">
		<label>Class Name</label>
		<select name="class" id="class_id">
		<% Object obj = request.getAttribute("obj");
		List<Classes> c = (List<Classes>)obj;
		for(Classes var : c){
		%>
		  <option value="<%=var.getClassId()%>"><%=var.getClassName()%></option>
		<% } %>
		</select>
		<label>Subject Name</label>
		<select name="subject" id="subject_id">
		<% Object obj1 = request.getAttribute("obj1");
		List<Subject> s = (List<Subject>)obj1;
		for(Subject var : s){
		%>
		  <option value="<%=var.getSubjectId()%>"><%=var.getSubjectName()%></option>
		<% } %>
		</select>
		<br>
		<input type="submit" value="SUBMIT">
	</form>
	<br>
	<a href="Home.jsp">Home</a>
</body>
</html>