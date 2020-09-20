<%@ page language="java" isELIgnored="false"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="#D5D8DC">

	<p style="color: navy; font-family: sans-serif; font-size: x-large;">Login Page</p>
	
	${SPRING_SECURITY_LAST_EXCEPTION.message}
	
	<form action="login" method="POST">
	
		Username : <input type="text" name = "username"> <br> <br>
		Password : <input type="password" name = "password"> <br> <br>
		
		<button type="submit">Login</button> <br> <br>
		
	</form>

</body>
</html>