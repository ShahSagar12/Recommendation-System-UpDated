<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%
	if (session.getAttribute("id") == null) {
		response.sendRedirect("default.jsp");
	}
%>


<%@page import="com.event.model.Admin"%>
<%@page import="com.event.service.AdminService"%>
<%@page import="com.event.serviceImpl.AdminServiceImpl"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>headerhome</title>
<link href="Assets/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<script src="Assets/js/jquery-2.2.4.min.js" /></script>
<script src="Assets/js/bootstrap.min.js" /></script>

</head>
<body>
<%
String id=session.getAttribute("id").toString();

Admin admin=new Admin();

AdminService adminService=new AdminServiceImpl();
%>
	<div class="container">
		<div class="row">





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
							data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand">Welcome</a>
					</div>

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<div class="col-md-9">
							<ul class="nav navbar-nav">
								<li class="active"><a href="ViewEvent.jsp">Event<span
										class="sr-only">(current)</span></a></li>
								<li><a href="Home.jsp">Home</a></li>
								<li><a href="Profile.jsp">Profile</a></li>
								<li><a href="RecommendedEvents.jsp">Recommended events</a></li>


							</ul>
						</div>
						<div class="col-md-2">
							<button class="btn btn-primary" type="button">
								Notification<span class="badge">4</span>
							</button>
						</div>

						<div class="col-md-1">
							<button class="btn btn-default" type="button" type="submit"
								class="form-control">
								<a href="Logout">SignOut</a></button>
						</div>
					</div>

				</div>

			


				<!-- /.container-fluid -->

			</nav>
		</div>
	</div>




</body>
</html>