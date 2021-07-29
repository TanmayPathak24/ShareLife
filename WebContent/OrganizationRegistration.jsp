<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShareLife/Registration</title>
<script src = 'assest/jquery-2.2.1.min.js'></script>
<script src = 'assest/organizationjsp.js'></script>
</head>
<body>
	<form action=organization_view method='post' enctype='multipart/form-data'>
		<table>
		<caption><h1>Organization Registration</h1></caption>
		<tr><td>
		<table>
			<tr>
				<td><h2>Organization Details:</h2></td>
			</tr>
			<tr>
				<td>Organization Name:</td>
				<td><input type=text size=30 name=organization_name></td>
			</tr>
			<tr>
				<td>Organization Logo:</td>
				<td><input type=file size=30 name=organization_logo></td>
			</tr>
			<tr>
				<td>Central Office Address:</td>
				<td><input type=text size=30 name=central_office_address></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type=text size=30 name=email></td>
			</tr>
			<tr>
				<td>Website:</td>
				<td><input type=text size=30 name=website></td>
			</tr>
			<tr>
				<td>Type:</td>
				<td><input type=text size=30 name=type></td>
			</tr>
			
			
			<tr><td><h2>Administrative Details:</h2></td></tr>
			
			<tr>
				<td><h4>Administrative Head:</h4></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><input type=text size=30 name=administrative_head_first_name></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type=text size=30 name=administrative_head_last_name></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type=text size=30 name=administrative_address></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type=text size=30 name=administrative_email></td>
			</tr>
			<tr>
				<td>Contact No:</td>
				<td><input type=text size=30 name=administrative_phoneno></td>
			</tr>
			<tr>
				<td>Fax No:</td>
				<td><input type=text size=30 name=administrative_fax></td>
			</tr>
		</table>
		</td>
		<td valign=top>
		<table valign=top>
			<tr>
				<td><h2>Certification:</h2></td>
			</tr>
			<tr>
				<td><h4>Add Certificates:</h4></td>
				<td><input type="button" id=add_certificate size=30 value="Add"></td>
			</tr>
			<input type="hidden" id=certificatecount value=0 name=certificateno>
			<tr><td>
				<div id=certificate></div>
			</td></tr>
			<tr>
				<td>Password:</td>
				<td><input type=password size=30 name=password></td>
			</tr>
			<tr>
				<td>Conform Password:</td>
				<td><input type=password size=30 name=con_password></td>
			</tr>
			
			
			<tr><td><div id=password_notify></div></td></tr>
			<tr><td><br><input type=submit value="Submit Details"></td></tr>
		</table>
		</td></tr></table>
	</form>
</body>
</html>