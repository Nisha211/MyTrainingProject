<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Registration</title>
<style>
Body {
	font-family: Calibri, Helvetica, sans-serif;
	background-image:
		url("https://www.sentinelassam.com/wp-content/uploads/2017/11/Pakistan.jpg");
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
	<h2>Policy Registration</h2>
	<form action="${pageContext.request.contextPath}/policycreation"
		method="post">
		<label>policyId </label> <input type="text"
			placeholder="Enter policyId" name="policyId" required><br>
		<label>policyName </label> <input type="text"
			placeholder="Enter policyName" name="policyName" required><br>
		<label>typeOfPolicy </label> <input type="text"
			placeholder="Enter typeOfPolicy" name="typeOfPolicy" required><br>
		<label>policyOwner </label> <input type="text"
			placeholder="Enter policyOwner" name="policyOwner" required><br>
		<br> <label>policyProvider</label> <input type="text"
			placeholder="Enter policyProvider" name="policyProvider" required><br>
		<label>policyTime</label> <input type="text"
			placeholder="Enter policyTime" name="policyTime" required><br>
		<label>policyAmount</label> <input type="text"
			placeholder="Enter policyAmount" name="policyAmount" required><br>
		<label>Password: </label> <input type="password"
			placeholder="Enter Password" name="password" required><br>
		<label>policyDate</label> <input type="date"
			placeholder="Enter policyDate" name="policyDate" required>
		<button type="submit">Create Policy</button>
	</form>


</body>
</html>