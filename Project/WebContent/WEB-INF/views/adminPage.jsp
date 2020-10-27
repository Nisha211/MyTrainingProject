<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
<style>
h1 {
	color: #00cccc;
}

Body {
	background-image:
		url("https://www.sirius-migrationeducation.org/wp-content/uploads/2018/10/policy-briefs-e1540457914389.jpg");
	height: 100%;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body>
	<center>
		<h1>Welcome User</h1>
		<a href="${pageContext.request.contextPath}/policyRegistration">Create
			Policy</a><br> <a href="${pageContext.request.contextPath}/policy">Edit
			Policy</a>
	</center>

</body>
</html>