<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html  >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signup</title>
<link href="assets/css/bootstrap.min.css" type="text/css"
	rel="stylesheet" />
</head>
<body>
<h2>Sign Up</h2>
<form method="post">
<table class="responsive" class="container">
<tr>
<td>
First Name</td>
<td> <input type="text" name="firstName" id="firstName" class="responsive"/></td>
</tr>
<tr>
<td>
Last Name</td>
<td> <input type="text" name="lastName" id="lastName" class="responsive"/></td>
</tr>
<tr>
<td>
Address</td>
<td> <input type="text"  name="address" id="address" class="responsive"/></td>
</tr>
<tr>
<td>
Date Of Birth</td>
<td> <input type="date"  name="dob" id="dob" class="responsive" placeholder="Jan12,2012"/></td>
</tr>
<tr>
<td>
Sex</td>
 <td><div class="form-group"  id="Sex" class="responsive">
  <label for="sel1"></label>
  <select class="form-control" id="sel1" name="sex">
    <option>Male</option>
    <option>Female</option>
    <option>Others</option>
    
  </select>
</div> </td>
</tr>
<tr>
<td>
Faculty</td>
<td> <input type="text"  name="faculty" id="faculty" class="responsive"/></td>
</tr>

<tr>
<td>
Semester</td>
<td><div class="form-group"  id="semester" class="responsive">
  <label for="sel1">Semester</label>
  <select class="form-control" id="sel1" name="semester">
    <option>1</option>
    <option>2</option>
    <option>3</option>
    <option>4</option>
    <option>5</option>
    <option>6</option>
    <option>7</option>
    <option>8</option>
  </select>
</div> </td>
</tr>
<tr>
<td>
Rollno:</td>
<td> <input type="text"   name="rollNo" id="rollNo" class="responsive"/></td>
</tr>
<tr>
<td>
E-mail Address</td>
<td> <input type="email"   name="emailAddress" id="emailAddress" class="responsive"/></td>
</tr>
<tr>
<td>
Password</td>
<td> <input type="password"   name="password" id="password" class="responsive"/></td>
</tr>
<tr>
<td>
Confirm Password</td>
<td> <input type="password"   name="confirmPassword" id="confirmPassword" class="responsive"/></td>
</tr>
<tr>
<td>
<input type="submit" value="Register As User" name="userRegister" id="userRegister" onclick="form.action='UserController'" class="responsive"/></td>
<td><input type="submit" value="Register As Admin" name="adminRegister" id="adminRegister" onclick="form.action='inputAdmin'" class="responsive"/></td>
</tr>

</table>
</form>
</body>
</html>