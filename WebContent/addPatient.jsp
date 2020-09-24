<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<div class="container">
		<div class="row">
			<form role="form" class="col-md-9 go-right" action="addPatientes">
				<h2>Add a New Patient</h2>

				<div class="form-group">
					<label for="name">AadhaarId</label> <input id="AadhaarId" name="AadhaarId"
						type="text" class="form-control" required>
				</div>
				<div class="form-group">
					<label for="name">Name</label> <input id="name" name="Name"
						type="text" class="form-control" required>
				</div>
				<div class="form-group">
					<label for="name">State</label> <input id="State" name="State"
						type="text" class="form-control" required>
				</div>
				<div class="form-group">
					<label for="name">City</label> <input id="City" name="City"
						type="text" class="form-control" required>
				</div>
				<div class="form-group">
					<label for="name">PinCode</label> <input id="PinCode" name="PinCode"
						type="text" class="form-control" required>
				</div>
				<div class="form-group">
					<label for="name">Status</label> <input id="Status" name="Status"
						type="text" class="form-control" required>
				</div>
		</div>
		<br>
		<div class="form-group">
			<div align="left">
				<button type="submit" class="btn btn-primary">Add or Update</button></div>
			</div>
			</form>
		</div>
		
	</div>

</body>
</html>