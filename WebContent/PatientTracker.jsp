<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>Status Page</title>
</head>
<body>

<h3 align ="center" style="color:black"> PatientTracker  </h3><br><br><br>


<a class="btn btn-secondary btn-lg btn-block" href="addPatient">Add Patient</a><br><br><br>

<table class="table table-sm table-dark"  border="1" padding="10">
 
          	<th>AadhaarId</th>
		<th>Name</th>
		<th>State</th>
		<th>City</th>
		<th>PinCode</th>
		<th>Status</th>
		
		<c:forEach var="patient" items="${patientes}">
			<tr>
				<td>${patient.AadhaarId}</td>
				<td>${patient.Name}</td>
				<td>${patient.State}</td>
				<td>${patient.City}</td>
				<td>${patient.PinCode}</td>
				<td>${patient.Status}</td>
				
                    <td><a href="editPatient?id=${patient.id}">Edit</a> / <a href="deletePatient?id=${patient.id}">Delete</a></td>
             
                </tr>
            </c:forEach>
        </table>
</body>
</html>