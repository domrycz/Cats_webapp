<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
		<title>Cat's details</title>
	</head>
	<body>
		<a href="showAll">Back to cats list</a><br />
		<table border="1">
			<tbody>
				<tr>
					<th>Name</th>
					<td>${cat.name}</td>
				</tr>
				<tr>
					<th>Birth date</th>
					<td>${cat.date}</td>
				</tr>
				<tr>
					<th>Weight</th>
					<td>${cat.weight} kg</td>
				</tr>
				<tr>
					<th>Keeper</th>
					<td>${cat.keeper}</td>
				</tr>
			</tbody>
		</table>
		<br />
	</body>
</html>