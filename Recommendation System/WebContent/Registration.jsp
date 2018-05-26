<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="Assets/css/new.css" type="text/css" />
<link rel="stylesheet" href="Assets/css/bootstrap.min.css"
	type="text/css" />
<script src="Assets/js/bootstrap.min.js" /></script>
<link rel="stylesheet" href="Assets/css/registration.css"
	type="text/css" />

<script src="Assets/js/registration.js"></script>
</head>
<body>
	<div class="container">
		<jsp:include page="header.jsp" />
	</div>
	<div class="container">

		<form class="well form-horizontal" method="post" id="contact_form">
			<fieldset>

				<!-- Form Name -->
				<legend align="center">Register Today!</legend>

				<!-- Text input-->

				<div class="form-group">
					<label class="col-md-4 control-label">First Name</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input type="text"
								name="firstName" id="firstName" placeholder="First Name"
								class="form-control" class="responsive">
						</div>
					</div>
				</div>

				<!-- Text input-->

				<div class="form-group">
					<label class="col-md-4 control-label">Last Name</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input type="text"
								name="lastName" id="lastName" class="responsive"
								placeholder="Last Name" class="form-control" />
						</div>
					</div>
				</div>
				<!-- Text input-->

				<div class="form-group">
					<label class="col-md-4 control-label">Sex</label>
					<div class="col-md-4 selectContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-book"></i></span> <select name="sex"
								id="sex" class="form-control selectpicker">
								<option value=" ">Please select Gender</option>
								<option>Male</option>
								<option>Female</option>
								<option>Others</option>
								</select>
						</div>
					</div>
				</div>
				<hr>

				<!-- Text input-->

				<div class="form-group">
					<label class="col-md-4 control-label">Faculty</label>
					<div class="col-md-4 selectContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-book"></i></span> <select name="faculty"
								id="faculty" class="form-control selectpicker">
								<option value=" ">Please select your Faculty</option>
								<option>BSC CSIT</option>
								<option>BIM</option>
								<option>BBA</option>
								<option>BBS</option>


							</select>
						</div>
					</div>
				</div>
				<!-- Text input-->

				<!-- Select Basic -->

				<div class="form-group">
					<label class="col-md-4 control-label">Semester</label>
					<div class="col-md-4 selectContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-book"></i></span> <select name="semester"
								id="semester" class="form-control selectpicker">
								<option value=" ">Please select your semester</option>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
								<option>6</option>
								<option>7</option>
								<option>8</option>

							</select>
						</div>
					</div>
				</div>

				<!-- Text input-->

				<div class="form-group">
					<label class="col-md-4 control-label">Rollno.</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input type="number"
								name="rollNo" id="rollNo" class="responsive"
								placeholder="Roll Number" class="form-control" />
						</div>
					</div>
				</div>
				<h6 align="center">
					<u><strong>Note:</strong>This block Must be filled by User
						Only.If you register as Admin you dont need to fill
						Faculty,Semester,Rollno.</u>
				</h6>


				<!-- Text input-->
				<hr>

				<div class="form-group">
					<label class="col-md-4 control-label">Address</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-home"></i></span> <input name="address"
								placeholder="Address" class="form-control" type="text">
						</div>
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label">DOB</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-calendar"></i></span> <input type="date"
								name="dob" id="dob" class="responsive" placeholder="Jan12,2012"
								class="form-control" type="text">
						</div>
					</div>
				</div>
				
				<hr>
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label">E-Mail</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-envelope"></i></span> <input type="email"
								name="emailAddress" id="emailAddress" class="responsive"
								class="form-control">
						</div>
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label">Password</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-lock"></i></span> <input type="password"
								name="password" id="password" class="responsive"
								class="form-control">
						</div>
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label">Confirm Password</label>
					<div class="col-md-4 inputGroupContainer">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-lock"></i></span> <input type="password"
								name="confirmPassword" id="confirmPassword" class="responsive"
								class="form-control">
						</div>
					</div>
				</div>
				<!-- Success message -->
				<div class="alert alert-success" role="alert" id="success_message">
					Success <i class="glyphicon glyphicon-thumbs-up"></i> You
					Registered Successfully!
				</div>

				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label"></label>
					<div class="col-md-4">
						<button type="submit" class="btn btn-warning"
							onclick="form.action='inputAdmin'" 
							class="form-control">
							Register Admin <span
								class="glyphicon glyphicon-registration-mark"></span>
						</button>
					</div>
					<div class="col-md-4">
						<button type="submit" class="btn btn-warning"
							onclick="form.action='inputUser'" class="pullleft"
							 class="form-control">
							Register User <span class="glyphicon glyphicon-registration-mark"></span>
						</button>
					</div>
				</div>

			</fieldset>
		</form>
	</div>
	</div>
	<!-- /.container -->
	<div class="container">
		<jsp:include page="footer.jsp" />
	</div>

</body>
</html>