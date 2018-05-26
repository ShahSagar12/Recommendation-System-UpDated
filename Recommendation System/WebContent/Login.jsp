<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="Assets/css/new.css" type="text/css" />
<link rel="stylesheet" href="Assets/css/bootstrap.min.css"
	type="text/css" />
<script src="Assets/js/bootstrap.min.js" /></script>
<script src="Assets/js/jquery-2.2.4.min.js" /></script>
</head>
<body>
	<div class="container">
		<jsp:include page="header.jsp" />
	</div>
	<hr>
	<div>

		<div class="container py-5">
			<div class="row">
				<div class="col-md-12">
					<h2 class="text-center text-white mb-4">Login Form</h2>
					<div class="row">
						<div class="col-md-6 mx-auto">

							<!-- form card login -->
							<div class="card rounded-0">
								<div class="card-header">
									<h3 class="mb-0">Login</h3>
								</div>
								<div class="card-body">
									<form class="form" id="formLogin" method="POST" action="Login">
										<div class="form-group">
											<label for="uname1">Email</label> <input type="text"
												class="form-control form-control-lg rounded-0" name="uname1"
												id="uname1" class="required">
											<div class="invalid-feedback">Oops, you missed this
												one.</div>
										</div>
										<div class="form-group">
											<label>Password</label> <input type="password"
												class="form-control form-control-lg rounded-0" id="pwd1"
												class="required">
											<div class="invalid-feedback">Enter your password too!</div>
										</div>
										<div>
											<label class="custom-control custom-checkbox"> <input
												type="checkbox" class="custom-control-input"> <span
												class="custom-control-indicator"></span> <span
												class="custom-control-description small text-dark">Remember
													me on this computer</span>
											</label>
										</div>
										<button type="submit"
											class="btn btn-success btn-lg float-right" id="btnLogin" onclick="form.action='loginUser'">Login User</button>
										<button type="submit"
											class="btn btn-success btn-lg float-left" id="btnLogin" onclick="form.action='LoginAdmin'">Login Admin</button>
									</form>
								</div>
								<!--/card-block-->
							</div>
							<!-- /form card login -->

						</div>


					</div>
					<!--/row-->

				</div>
				<!--/col-->
			</div>
			<!--/row-->
		</div>
		<!--/container-->
	</div>
	<hr>
	<div class="container">
		<jsp:include page="footer.jsp" />
	</div>

</body>
</html>