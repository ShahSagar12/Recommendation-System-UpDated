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
<title></title>
<meta charset="UTF-8">
<meta name="description" content="">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Home</title>
<script src="Assets/js/jquery-2.2.4.min.js" /></script>
<link rel="stylesheet" href="Assets/css/new.css" type="text/css" />
<link rel="stylesheet" href="Assets/css/bootstrap.min.css"
	type="text/css" />
	<link rel="stylesheet" href="Assets/css/Event.css" type="text/css" />
<script src="Assets/js/bootstrap.min.js" /></script>

</head>
<body>
	
	
	<hr>
	<div>
	<div class="container">
		<jsp:include page="header1.jsp" />

		<%
			String id = session.getAttribute("id").toString();
			AdminService userService = new AdminServiceImpl();
			EventService eventService = new EventServiceImpl();
			List<Event> allEvent = eventService.list();
			for (Event event : allEvent) {
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
								<label for="exampleInputEmail">Posted Date:<%=event.getEventdate()%>
							</div>
								<div class="form-group">
								<label for="telephone">Posted On:<%=event.getEventTime()%></label>
							</div>
							</div>
							<div class="col-md-6">	
						
						
							<div class="form-group">
								<label for="description">Posted By:<%=userService.getuserName(event.getUserId())%></label>
								</div>				
								
									
										<ul>
										 <div class="form-group ">
								<label for="description">Rate Us</label>
								</div>
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
										</div>		

				
				
				
				
			
	
	</form>
	
	
	</div>
	<button type="button" class="btn btn-default submit" >
					<i class="fa fa-paper-plane" aria-hidden="true" ></i><a href="rating.jsp?id=<%=event.getId()%>"> Submit</a>
				</button>
	</section>
	

	<%
			}
		%>
	<jsp:include page="footer.jsp" />
	
	<script>

						$('li').on('click', function() {
							$('li').removeClass('active');
							$('li').removeClass('secondary-active');
							$(this).addClass('active');
							$(this).prevAll().addClass('secondary-active');
						})
					</script>
</div>
	
	</div>
	<hr>
	
	
</body>
</html>