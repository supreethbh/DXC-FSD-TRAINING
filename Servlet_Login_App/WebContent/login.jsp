<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
</head>

<body>
	
	<form action="LoginServlet" method="POST">
	
		<p style="color: blue; font: bolder; font-family: sans-serif;">Login Page of DXC.technology</p>
	
		UserName : <input type="text" name="userName"> <br> <br>
	
		Password : <input type="password" name="password"> <br> <br>
		
		<input type="submit" value="Login">
		
	</form>	
	
</body>

</html>