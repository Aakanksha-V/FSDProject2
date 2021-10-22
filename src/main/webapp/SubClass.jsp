<%@page import="com.entity.Class_Subject"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Class </th>
			<th>Subject List</th>
		</tr>
		<%
		Object obj = request.getAttribute("obj");
		List<Object[]> resList = (List<Object[]>)obj;
		Iterator<Object[]> li = resList.iterator();
		for(Object[] o : resList){
			String className = (String) o[0];
			String subjectName = (String) o[1];
		%>
			<tr>
				<td><%=className %></td>
				<td><%=subjectName %></td>
			</tr>
			<%
		}
		 %>
	</table>
	<a href="Home.jsp">HOME</a>
</body>
</html>