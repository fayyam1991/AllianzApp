<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
	<form action="addEmployee.html" method="POST">
		<table>
			<tr>
				<td>Employee Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>

			<tr>
				<td>Phone No:</td>
				<td><input type="number" name="phone"></td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><input type="email" name="email"></td>
			</tr>

			<tr>
				<td>Date:</td>
				<td><input type="date" name="date"></td>
			</tr>

			<tr>
				<td>Attachment:</td>
				<td><input type="file" name="attachment"></td>
			</tr>

		</table>
		<input type="submit" value="submit">
	</form>
</body>
</html>