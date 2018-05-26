<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>subtitles</title>
<link href="Assets/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">	
<script src="Assets/js/bootstrap.min.js" /></script>
<script src="Assets/js/jquery-2.2.4.min.js" /></script>
</head>
<body>
<div class="row" height="13em" class="form-control">
<hr>
<div class="col-md-10"><%out.print("Welcome"); %></div>
<div class="col-md-1"><button class="btn btn-primary" type="button">
  Notification<span class="badge">4</span>
</button></div>
<div class="col-md-1"><button class="btn btn-danger" type="button" onclick="form.action='logout'">
  LOGOUT
</button></div></div>
<hr>
</div>
</body>
</html>