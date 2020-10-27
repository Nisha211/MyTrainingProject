<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Id</title>
<style>
h1{
color:#3366ff;
}
Body {
	font-family: Calibri, Helvetica, sans-serif;
	background-image:
		url("https://resize.indiatvnews.com/en/resize/newbucket/715_-/2020/02/lic-policy-1580531413.jpg");
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
	<h1>policy Page</h1>
	<br>
	<form action="./policyEdit" method="post">

		<label>policyId</label> <input type="text" placeholder="policyId"
			name="policyId" required><br>
		<button type="submit">submit</button>

	</form>

</body>
</html>