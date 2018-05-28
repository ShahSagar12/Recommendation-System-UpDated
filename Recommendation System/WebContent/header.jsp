<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>header</title>
<link href="Assets/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<script src="Assets/js/jquery-2.2.4.min.js" /></script>
<script src="Assets/js/bootstrap.min.js" /></script>

</head>
<body>
	<div class="container">
		<div class="row"></div>



		<div class="col-md-9" class="responsive">
			<img src="Assets/image/3.jpg" width="100%" />

		</div>
		<div class="col-md-3" class="responsive" style="color: grey;"
			class="box">
			<img src="Assets/image/Untitled design (2).jpg" width="100%"
				height="100%" />


		</div>
	</div>
	<div class="container" class="row">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="aboutus.jsp">About Us</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<div class="col-md-9">
						<ul class="nav navbar-nav">
							<li class="active"><a href="Home.jsp">
									<button type="button" class="btn btn-info">Event</button><span
									class="sr-only">(current)</span>
							</a></li>
							<li><a href="Home.jsp" >Home</a></li>
							<li><a href="Profile.jsp">Profile</a></li>
							<li><a href="Message.jsp">Message</a></li>

						</ul>
					</div>

					<div class="col-md-1" class="container-fluid">

						<button type="button" class="btn btn-info " data-toggle="modal"
							data-target="#myModal">Login</button>



					</div>
					<div class="col-md-1">
						<button class="btn btn-default" type="button" class="form-control">
							<a href="Registration.jsp">Signup</a>
						</button>
					</div>
				</div>

			</div>




			<!-- /.container-fluid -->

		</nav>
	</div>

	<!-- Modal -->
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Login</h4>
				</div>
				<div class="modal-body">
					<div class="container py-5">
						<div class="row">
							<div class="col-md-12">

								<div class="row">
									<div class="col-md-6 mx-auto">

										<!-- form card login -->
										<div class="card rounded-0">

											<div class="card-body">
												<jsp:include page="Login.jsp" />

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
			</div>

		</div>

	</div>

	<!-- Modal Message -->
	<div class="modal fade" id="myModal1" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title" class="alert alert-warning">
						<strong>Warning!</strong> PLZ,Login First
					</h4>
				</div>

			</div>

		</div>

	</div>


</body>
</html>