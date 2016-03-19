<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<html>
<body>
	<h2>Jsp test</h2>
	<%
		String[] persons = { "John", "Michael" };
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat();
		if (persons != null) {
	%>
	<h3>You have selected author(s):</h3>
	<ul>
		<%
			for (int i = 0; i < persons.length; ++i) {
		%>
		<li><%=persons[i]%></li>
		<%
			}
		%>
	</ul>
	<%=format.format(date)%>
	<br><a href="index.jsp">BACK</a>
	<%
		}
	%>
</body>
</html>
