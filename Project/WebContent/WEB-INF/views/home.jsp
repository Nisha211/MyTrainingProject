<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration and Login details</title>
<style>
body, html {
	height: 100%;
}

h1 {
	background-color: blue;
}

body {
	background-image:
		url("https://interworks.com/wp-content/uploads/sites/default/files/blog/u34/BLOG---Login-Screen-SS3.png");
	background-color: #cccccc;
	height: 100%;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}

a:link {
	color: blue;
	background-color: transparent;
	text-decoration: none;
	
}

a:visited {
	color: yellow;
	background-color: transparent;
	text-decoration: none;
}

a:hover {
	color: red;
	background-color: transparent;
	text-decoration: underline;
}

a:active {
	color: blue;
	background-color: transparent;
	text-decoration: underline;
}
</style>
</head>
<body>
	<center>
		<h1>Welcome to policy Management</h1>
		<a href="${pageContext.request.contextPath}/userRegistration/">User Page
		</a> <br> <a
			href="${pageContext.request.contextPath}/adminRegistration/">Admin Page
		</a>

	</center>
</body>
</html>