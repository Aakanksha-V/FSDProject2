<%@page import="org.hibernate.dialect.function.VarArgsSQLFunction"%>
<%@page import="java.util.Iterator"%>
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
	<input type="hidden" name="AssignTtoCforS" value="AssignTtoCforS" />
	<label for="Classes">Choose a class:</label>
	<select name="Classes" id="ClassesId">
	<%
	Object obj = request.getAttribute("obj");
	List<Classes> c = (List<Classes>)obj;
	for(Classes var : c){
	%>
	  <option value=""><%=var.getClassId()%></option>
	</select>
	<% } %>
</body>
</html>