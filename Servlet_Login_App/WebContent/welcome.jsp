<%@ page language="java"  isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Welcome</title>
</head>

<body>

	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		
		if(session.getAttribute("userName") == null) {
			
			response.sendRedirect("login.jsp");
		} 
	%>
	
	<p style="color: blue; font: bolder; font-family: sans-serif;"> Welcome to ${userName} </p>
	
	<a href="videos.jsp">Videos of ${userName}</a>
	
	<br> <br>

	<form action="LogoutServlet">
		<input type="submit" value="Logout">
	</form>
	
</body>
</html>