<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	if (session.getAttribute("id") == null) {
		response.sendRedirect("default.jsp");
	}
%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CreateEvent</title>

<link rel="stylesheet" href="Assets/css/new.css" type="text/css" />
<link rel="stylesheet" href="Assets/css/bootstrap.min.css"
	type="text/css" />
<script src="Assets/js/bootstrap.min.js" /></script>
<script src="Assets/js/jquery-2.2.4.min.js" /></script>
</head>
<body>
	<div class="container">
		<jsp:include page="header1.jsp" />
	</div>
	<div class="container">

		<div class="row centered-form">

			<div
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">

						<h3 class="panel-title">Add Your Event</h3>
					</div>
					<div class="panel-body">
						<form role="form" method="post">

							<div class="form-group">
								Event Name:<input type="text" name="eventName" id="eventName"
									class="form-control input-sm" placeholder="Name of Event">
							</div>

							<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-7">
			    					<div class="form-group">
			    					Event Date:<input type="date" name="eventDate" id="eventDate" class="form-control input-sm" placeholder="Date of Event">
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-5">
			    					<div class="form-group">
			    					Event Time:<input type="time" name="eventTime" id="eventTime" class="form-control input-sm" placeholder="Time of Event">
			    					</div>
			    				</div>
			    			</div> 
			    			<div class="form-group">

								Event Address:<input type="text" name="eventAddress" id="eventAddress"
									class="form-control input-sm" placeholder="Address of Event"
									row="5" />
							</div>  
							<div class="form-group">

								Event Notice:<textarea name="eventNotice" id="eventNotice"
									class="form-control input-sm" placeholder="Notices:" row="10"></textarea>
							</div>
							


							<input type="submit" value="Save Event" class=btn btn-info
								btn-block" onclick="form.action='addEvent'">

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<jsp:include page="footer.jsp" />
	</div>

</body>
</html>