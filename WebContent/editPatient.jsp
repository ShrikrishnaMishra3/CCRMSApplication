<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Edit Patient</title>
</head>
<body>


<form action="updatePatient">
<c:set var="patient" value="${patient }" />
<h3 align=center>Patient App Management System </h2>
<table class="table table-striped">
<tr>  <td>AadhaarId </td><td><input type="text" name="AadhaarId"  value= "${patient.AadhaarId }" /></td></tr>
<tr><td>Name</td><td> <input type="text" name="Name" value= "${patient.Name}"   /></td></tr>
<tr><td>State</td><td> <input type="text" name="State"  value="${patient.State}" /><br></td></tr>
<tr><td>City</td><td> <input type="text" name="City"  value="${patient.City}" /><br></td></tr>
<tr><td>PinCode</td><td> <input type="text" name="PinCode"  value="${patient.PinCode}" /><br></td></tr>
<tr><td>Status</td><td> <input type="text" name="Status"  value="${patient.Status}" /><br></td></tr>
<div align="center"></div><tr colspan=2><td><input type="submit" value="Update" /></td></tr></div>
</table>
</form>
</body>
</html>