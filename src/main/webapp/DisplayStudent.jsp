<%@page import="java.util.Iterator"%>
<%@page import="com.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Add new Student</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
			<th>Class ID</th>
		</tr>
		<%
		Object obj = request.getAttribute("obj");
		List<Student> listOfStd = (List<Student>)obj;
		Iterator<Student> li = listOfStd.iterator();
		while(li.hasNext()){
			Student ss = li.next();
		%>
			<tr>
				<td><%=ss.getStudentId() %></td>
				<td><%=ss.getStudentName() %></td>
				<td><%=ss.getClass_id() %></td>
			</tr>
			<%
		}
		 %>
	</table>
	<a href="Home.jsp">HOME</a>
</body>
</html>