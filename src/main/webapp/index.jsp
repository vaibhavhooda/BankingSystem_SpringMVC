<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Banking</title>
	</head>
	<body>
		
		<h2> Banking Management System 'Implemented BY Spring FrameWork' </h2>
		<table align="center">
			<tr>
				<td style="font-style: italic; color: blue;">UserId: ${userId}</td>
			</tr>
		</table>
		
		<a href="customerform">Add new customer</a>
		<br/>
		<br/>
		<a href="viewcustomer/${userId}">View CustomerInfo</a>		
		<hr/>
		<a href="memberform">Add Members</a>
		<br/>
		<br/>
		<a href="viewmember">View Members</a>		
		<hr/>
		<a href="pubform">Add Publisher</a>
		<br/>
		<br/>
		<a href="viewpub">View Publishers</a>		
		
		
		
	</body>
</html>