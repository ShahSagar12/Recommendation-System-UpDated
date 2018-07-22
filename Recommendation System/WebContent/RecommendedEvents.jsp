<%@page import="com.event.controller.EventController"%>
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
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Event</title>
<!--  <link rel="stylesheet" href="Assets/css/new.css" type="text/css" />-->
<link rel="stylesheet" href="Assets/css/bootstrap.min.css"
	type="text/css" />
	<link rel="stylesheet" href="Assets/css/Event.css"
	type="text/css" />
<script src="Assets/js/jquery-2.2.4.min.js" /></script>
<script src="Assets/fonts/fontawesome-all.js" /></script>
<script src="Assets/js/bootstrap.min.js" /></script>
<style>

</style>

</head>
<body>
	<div class="container">
		<jsp:include page="header1.jsp" />

		<%
			String id = session.getAttribute("id").toString();
			
			AdminService userService = new AdminServiceImpl();
			EventService eventService = new EventServiceImpl();
			
			List<Event> recommendedList = eventService.recommendedList();
			for (Event event : recommendedList) {
			
			
		%>
		<section id="contact">
			<div class="section-content">
				<h1 class="section-header">
					<!-- fontawesome face -->
					<span class="content-header wow fadeIn " data-wow-delay="0.2s"
						data-wow-duration="2s"> <%=event.getEventName()%></span>
				</h1>
				<h3><%=event.getEventNotice()%></h3>
			</div>
			<div class="contact-section">
				<div class="container">
					<form>
						<div class="col-md-6 form-line">
							<div class="form-group">
								<label for="exampleInputUsername">Venue:<%=event.getEventAddress()%></label>
							</div>
							<div class="form-group">
								<label for="exampleInputEmail">Date:<%=event.getProposedDate()%>
							</div>
								<div class="form-group">
								<label for="telephone">Time<%=event.getProposedTime()%></label>
							</div>
							<div class="form-group">
								<label for="description">Posted By:<%=userService.getuserName(event.getUserId())%></label>
								</div>	
							</div>
							<div class="col-md-6">	
						
						
							<button type="button" class="btn btn-default submit" >
					<i class="fa fa-paper-plane" aria-hidden="true" ></i><a href="Eventviewer.jsp?id=<%=event.getId()%>">View Event Details</a>
				</button>
	
				
								
									
										</div>
										</div>		

				
				
				
				
			
	
	</form>
	
	<%} %>
	</div>
	

	
	
	
	<script>
	

						$('li').on('click', function() {
							$(this).removeClass('active');
							$(this).removeClass('secondary-active');
							$(this).addClass('active');
							$(this).prevAll().addClass('secondary-active');
						})
					</script>
					</section>
</div>
<!-- <div>
<jsp:include page="footer.jsp" />
</div> -->
</body>
</html>