<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
	<div align="center">
		<h1>New/Edit </h1>
		<form:form action="updatePatient" method="post" modelAttribute="patient">
			<table>
				<tr>

					<td><form:hidden path="id" /></td>
				</tr>
				<tr>
					<td>AadhaarId:</td>
					<td><form:input path="AadhaarId" id="AadhaarId" /></td>
				</tr>

				<tr>
					<td>Name:</td>
					<td><form:input path="Name" id="Name" /></td>
				</tr>
				<tr>
					<td>State:</td>
					<td><form:input path="State" id="State" /></td>
				</tr>

				<tr>
					<td>City:</td>
					<td><form:input path="City" id="City" /></td>
				</tr>
				<tr>
					<td>PinCode:</td>
					<td><form:input path="PinCode" id="PinCode" /></td>
				</tr>
				<tr>
					<td>Status:</td>
					<td><form:input path="Status" id="Status" /></td>
				</tr>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Update"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>