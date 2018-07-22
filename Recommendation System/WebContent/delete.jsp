<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	if (session.getAttribute("id") == null) {
		response.sendRedirect("default.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>delete</title>
<link rel="stylesheet" href="Assets/css/new.css" type="text/css" />
<link rel="stylesheet" href="Assets/css/bootstrap.min.css"
	type="text/css" />
<script src="Assets/js/jquery-2.2.4.min.js" /></script>
<script src="Assets/js/bootstrap.min.js" /></script>

</head>
<body>
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
						<div class="col-md-6">
							<ul class="nav navbar-nav">
								<li class="active"><a href="default.jsp">Event<span
										class="sr-only">(current)</span></a></li>
								<li><a href="AdminHome.jsp">Home</a></li>
								<li><a href="CreateEvent.jsp">Create Event</a></li>
								<li><a href="ViewEvent.jsp">View Event</a></li>

							</ul>
						</div>
						<div class="col-md-2">
							<button class="btn btn-primary" type="button">
								Notification<span class="badge">4</span>
							</button>
						</div>
						<div class="col-md-1">
							<button class="btn btn-default" type="button"
								class="form-control"><a href="Logout">SignOut</a></button>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</nav>
		</div>
	<hr>
	<div class="col-md-12">
			<h3>Are you sure you want to delete this Event?</h3>
			<% String id = request.getParameter("id").toString();
			 %>
			<form method="post" action="delete">
			<input type="hidden" name="txtId" value="<%=id %>" />
			<a href="Eventviewer.jsp" class="btn  btn-default" style="margin-top: 20px;">No</a>
					
				<input type="submit" name="btnevent" value="YES"
					class="btn  btn-danger" style="margin-top: 20px;" />
			</form>
		</div>
	<hr>
	<div class="container">
		<jsp:include page="footer.jsp" />
	</div>

</body>
</html>