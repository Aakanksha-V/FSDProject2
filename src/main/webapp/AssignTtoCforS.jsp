<%@page import="org.hibernate.dialect.function.VarArgsSQLFunction"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.entity.Classes"%>
<%@page import="com.entity.Subject"%>
<%@page import="com.entity.Teacher"%>
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
	<form action="ClassSubTeachController" method="post">
		<label>Class Name</label>
		<select name="class" id="class_id">
		<% Object obj = request.getAttribute("obj");
		List<Classes> c = (List<Classes>)obj;
		for(Classes var : c){
		%>
		  <option value="<%=var.getClassId()%>"><%=var.getClassName()%></option>
		<% } %>
		</select>
		<br>
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
		<label>Teacher Name</label>
		<select name="teacher" id="teacher_id">
		<% Object obj2 = request.getAttribute("obj2");
		List<Teacher> t = (List<Teacher>)obj2;
		for(Teacher v : t){
		%>
		  <option value="<%=v.getTeacherId()%>"><%=v.getTeacherName()%></option>
		<% } %>
		</select>
		<br>
		<input type="submit" value="SUBMIT">
		<br>
		<a href="Home.jsp">HOME</a>
	</form>
</body>
</html>