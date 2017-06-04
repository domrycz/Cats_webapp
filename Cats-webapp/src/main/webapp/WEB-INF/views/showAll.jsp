<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
		<title>Cats list</title>
	</head>
	<body>
		<a href="index">Back to Main page</a><br />
		<a href="add">Add another cat</a><br />
		<table border="1">
			<thead>
				<tr>
					<th>Cat id</th>
					<th>Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="cat" items="${catsList}" varStatus="status">
				<tr>
					<td>${cat.id}</td>
					<td><a href="cat-${cat.id}" />${cat.name}</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<br />
		<hr />
	</body>
</html>