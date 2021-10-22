<%@page import="com.entity.Class_Subject"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>REPORT</title>
</head>
<body>
	<table border="1" >
		<tr>
			<th>Class Name</th>
			<th>Teacher Name</th>
			<th>Subject Name</th>
		</tr>
		<%
		Object obj = request.getAttribute("obj");
		List<Object[]> resList = (List<Object[]>)obj;
		Object obj1 = request.getAttribute("obj1");
		List<Object[]> stuList = (List<Object[]>)obj1;
		for(Object[] o : resList){
			String className = (String) o[0];
			String teacherName = (String) o[1];
			String subjectName = (String) o[2];
			
		%>
			<tr>
				<td><%=className %></td>
				<td><%=subjectName %></td>
				<td><ul>
		<% for(Object[] j : stuList){
			String cname = (String) j[1];
			if(className.equals(cname)){
				String stuName = (String) j[0];
		%>
			<li><%=stuName %></li>	
		<%}
		}
		%>
		</ul></td>
			</tr>
			<%
		}
		 %>
	</table>
	<a href="Home.jsp">HOME</a>
</body>
</html>