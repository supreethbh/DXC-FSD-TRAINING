<%@ page language="java" isELIgnored="false"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Videos</title>
</head>

<body>

	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
		if(session.getAttribute("userName") == null) {
			
			response.sendRedirect("login.jsp");
		} 
	%>
	
	<p style="color: blue; font: bolder; font-family: sans-serif;"> Videos Of DXC.technology </p>
	
	<br>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/mpfxsvBPWEs" 
		frameborder="0" 
		allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" 
		allowfullscreen>
	</iframe>

</body>
</html>