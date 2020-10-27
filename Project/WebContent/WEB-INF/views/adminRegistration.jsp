<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<h2>Admin Login Page</h2>
<br>
<style>

h1 {
	color: #33cccc;
}

Body {
	font-family: Calibri, Helvetica, sans-serif;
	background-image:
		url("https://image.shutterstock.com/image-photo/policies-business-concept-file-on-260nw-349597007.jpg");
	height: 100%;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}

button {
	background-color: #4CAF50;
	width: 100%;
	color: blue;
	padding: 15px;
	margin: 10px 0px;
	border: none;
	cursor: pointer;
}

form {
	border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
	width: 100%;
	margin: 8px 0;
	padding: 12px 20px;
	display: inline-block;
	border: 2px solid red;
	box-sizing: border-box;
}

button:hover {
	opacity: 0.7;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	margin: 10px 5px;
}

.container {
	padding: 25px;
	background-color: lightblue;
}
</style>
</head>
<body>
	<center>
		<h1>Admin Login Form</h1>
	</center>
	<form action="${pageContext.request.contextPath}/adminsubmit"
		method="post">
		<div class="container">
			<label>vendorId: </label> <input type="text"
				placeholder="Enter vendorId" name="vendorId" required><br>
			<label>Password : </label> <input type="password"
				placeholder="Enter Password" name="password" required><br>
			<button type="submit">Login</button>
			New admin Registration<a
				href="${pageContext.request.contextPath}/adminLogin">clickhere </a>
		</div>
	</form>
</body>
</html>