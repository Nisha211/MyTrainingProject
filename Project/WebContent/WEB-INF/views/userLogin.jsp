<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<style>
h1 {
	background-color: #77b300;
}

Body {
	font-family: Calibri, Helvetica, sans-serif;
	background-image:
		url("https://www.hireright.com/blog/wp-content/uploads/2014/07/background-check-policies-procedures-1000x800.jpg");
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
	<h2>User Registration page</h2>
	<br>
	<form action="./userform" method="POST">
		<label>FirstName </label> <input type="text"
			placeholder="Enter FirstName" name="firstName" required><br>
		<label>LastName </label> <input type="text"
			placeholder="Enter LastName" name="lastName" required> <br>
		<label>Age </label> <input type="text" placeholder="Enter Age"
			name="age" required> <label>Gender </label> <input
			type="text" placeholder="Enter gender" name="gender" required>
		<br> <label>Contact no</label> <input type="text"
			placeholder="Enter contactNo" name="contactno" required><br>
		<label>UserId</label> <input type="text" placeholder="Enter userId"
			name="userId" required><br> <label>Password: </label> <input
			type="password" placeholder="Enter Password" name="password" required><br>
		<button type="submit">Register</button>
	</form>
</body>
</html>