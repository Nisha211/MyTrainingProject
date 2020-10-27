<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
<br>
<style>
h1 {
	color: #cc0000;
}

Body {
	font-family: Calibri, Helvetica, sans-serif;
	background-color: pink;
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
	color: orange;
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
	border: 2px solid green;
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
		<h1>User Login Form</h1>
	</center>
	<form action="${pageContext.request.contextPath}/usersubmit"
		method="post">
		<div class="container">
			<label>userId: </label> <input type="text" placeholder="Enter userId"
				name="userId" required> <br> <label>Password :
			</label> <input type="password" placeholder="Enter Password" name="password"
				required><br>
			<button type="submit">Login</button>
			New user Registration<a
				href="${pageContext.request.contextPath}/userLogin">clickhere </a>
		</div>
	</form>


</body>
</html>