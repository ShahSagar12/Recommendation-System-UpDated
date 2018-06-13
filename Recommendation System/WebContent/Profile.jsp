<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.event.model.Admin"%>
<%@page import="com.event.serviceImpl.AdminServiceImpl"%>
<%@page import="com.event.service.AdminService"%>
<%
	if (session.getAttribute("id") == null) {
		response.sendRedirect("default.jsp");
	}
%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
<link rel="stylesheet" href="Assets/css/bootstrap.min.css"
	type="text/css" />
	<script src="Assets/js/jquery-2.2.4.min.js"/></script>
<script src="Assets/js/bootstrap.min.js" /></script>
</head>
<body><div class="container">
<jsp:include page="header1.jsp"/>
</div>
<%
String id=session.getAttribute("id").toString();
AdminService adminService=new AdminServiceImpl();
int ida=Integer.parseInt(id);
String username=adminService.getuserName(ida);
String useraddress=adminService.getuserAddress(ida);



%>
<div class="container">
<div class="form-group">
      <label class="control-label col-sm-2" >Name:</label>
      <div class="col-sm-6"><%=username %>
        
      </div>
      <br>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Address:</label>
      <div class="col-sm-6"><%=useraddress %>       
        
      </div>
    </div>
    </div>
    <div class="container">
    
    <jsp:include page="footer.jsp"/>
</div>

</body>
</html>