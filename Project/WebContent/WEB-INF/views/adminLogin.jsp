<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1{
color:#3366ff;
}
Body {
	font-family: Calibri, Helvetica, sans-serif;
	background-image:url("https://image.shutterstock.com/image-vector/policies-procedures-flat-vector-icon-600w-741218269.jpg");
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
	<h1>Admin Login page</h1><br>
	<form action="./adminForm" method="POST">
		<label>FirstName </label> <input type="text"
			placeholder="Enter FirstName" name="firstName" required><br>
		<label>LastName </label><br> <input type="text"
			placeholder="Enter LastName" name="lastName" required><br>
		<label>Age </label> <input type="text" placeholder="Enter Age"
			name="age" required> <label>Gender </label> <input
			type="text" placeholder="Enter gender" name="gender" required><br>
		<label>Contact no</label> <input type="text"
			placeholder="Enter contactNo" name="contactno" required> <br>
		<label>vendorId</label> <input type="text"
			placeholder="Enter vendorId" name="vendorId" required><br>
		<label>Password: </label> <input type="password"
			placeholder="Enter Password" name="password" required><br>
		<button type="submit">Register</button>
	</form>

</body>
</html>