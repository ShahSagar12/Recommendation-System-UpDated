<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.event.daoImpl.EventDAOImpl"%>
<%@page import="com.event.model.Event"%>
<%@page import="com.event.serviceImpl.EventServiceImpl"%>
<%@page import="com.event.serviceImpl.AdminServiceImpl"%>
<%@page import="com.event.service.AdminService"%>
<%@page import="com.event.service.EventService"%>
<%@page import="java.util.List"%>
<%
	if (session.getAttribute("id") == null) {

		response.sendRedirect("default.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>viewing events</title>
<link rel="stylesheet" href="Assets/css/bootstrap.min.css"
	type="text/css" />
<script src="Assets/js/jquery-2.2.4.min.js"></script>
<script src="Assets/fonts/fontawesome-all.js"></script>
<script src="Assets/js/bootstrap.min.js" /></script>
<style>
form {width =70%;margin =auto;
	
}

label {
	display: block;
	width: 100%;
}

ul {
	padding: 0;
	margin: 0;
}

ul li {
	list-style-type: none;
	display: inline-block;
	margin: 5px;
	color: black;
	text-shadow: 2px 2px 7px grey;
	font-size: 25px !important;
}

ul li:hover {
	color: yellow;
}

ul li.active, ul li.secondary-active {
	color: yellow;
}

input[type="radio"] {
	display: none;
}
</style>
</head>
<body>
	<%
		String id=session.getAttribute("id").toString();
		String iid=request.getParameter("id").toString();
		AdminService userService = new AdminServiceImpl();
		EventService eventService = new EventServiceImpl();
		Event event = new Event();
	%>
	<h2 align="center"><%=eventService.getEventName(Integer.parseInt(iid))%></h2>

	<form method="post">
		<div class="row">
			<div class="col-sm-1"></div>
			<div class="col-sm-3" style="background-color: lavender;">
				Event Information
				<div class="list-group">
					<button type="button" class="list-group-item">
						Date:<%=eventService.proposedDate(Integer.parseInt(iid))%></button>
					<button type="button" class="list-group-item">
						Time:<%=eventService.proposedTime(Integer.parseInt(iid))%></button>
					<button type="button" class="list-group-item">
						Posted By:<%=userService.getuserName(Integer.parseInt(id))%></button>
					<button type="button" class="list-group-item">
						Posted Date:<%=eventService.getEventDate(Integer.parseInt(iid))%></button>
					<button type="button" class="list-group-item">
						Posted Time:<%=eventService.getEventTime(Integer.parseInt(iid))%></button>
					
				</div>
			</div>
			<div class="col-sm-4" style="background-color: lavenderblush;">
				<div class="list-group">
					<button type="button" class="list-group-item">Notice</button>
					<button type="button" class="list-group-item"><%=eventService.getEventNotice(Integer.parseInt(iid))%></button>

				</div>
			</div>
			<div class="col-sm-3" style="background-color: lavender;">
				Rate us
				<ul>
					<li><label for="rating_1"><i class="fas fa-star"
							aria-hidden="true"></i></label><input type="radio" name="rating"
						id="rating_1" value="1" /></li>
					<li><label for="rating_2"><i class="fas fa-star"
							aria-hidden="true"></i></label><input type="radio" name="rating"
						id="rating_2" value="2" /></li>
					<li><label for="rating_3"><i class="fas fa-star"
							aria-hidden="true"></i></label><input type="radio" name="rating"
						id="rating_3" value="3" /></li>
					<li><label for="rating_4"><i class="fas fa-star"
							aria-hidden="true"></i></label><input type="radio" name="rating"
						id="rating_4" value="4" /></li>
					<li><label for="rating_5"><i class="fas fa-star"
							aria-hidden="true"></i></label><input type="radio" name="rating"
						id="rating_5" value="5" /></li>
				</ul>
			</div>
			<div class="col-sm-1"></div>
		</div>
		<input type="submit" value="submit"
			onclick="form.action='rating.jsp?id=<%=eventService.get(Integer.parseInt(iid))%>'"
			style="align: center;" />











	</form>




	<script>
	$('li').on('click',function(){
		$('li').removeClass('active');
		$('li').removeClass('secondary-active');
		$(this).addClass('active');
		$(this).prevAll().addClass('secondary-active');
	})
	
	</script>

</body>
</html>