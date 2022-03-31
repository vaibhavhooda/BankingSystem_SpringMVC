<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<h2>Banking Online System with Spring</h2>
		<form action="loginProcess" method="post">
		
			Username: <input type="text" name="username" /><br /> 
			Password:&nbsp <input type="password" name="password" /><br />
			<input type="submit" value="login" />
				
		</form>
		<table align="left">
			<tr>
				<td style="font-style: italic; color: red;">${message}</td>
			</tr>
		</table>
	</body>
</html>