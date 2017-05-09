﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
		<title>Add another cat</title>
	</head>
	<body>
		<a href="showAll">Back to cats list</a><br />
		<form:form modelAttribute="catDTO" method="POST">
			<table border="1">
				<tbody>
					<tr>
						<th>Name:</th>
						<td>
						<form:input path="name" id="name"></form:input>
						<c:if test="${pageContext.request.method=='POST'}"><form:errors path="name" /></c:if>
						</td>
					</tr>
					<tr>
						<th>Birth date</th>
						<td>
						<form:input path="date" id="date"></form:input>
						<c:if test="${pageContext.request.method=='POST'}"><form:errors path="date" /></c:if>
						</td>
					</tr>
					<tr>
						<th>Weight</th>
						<td>
						<form:input path="weight" id="weight"></form:input>
						<c:if test="${pageContext.request.method=='POST'}"><form:errors path="weight" /></c:if>
						</td>
					</tr>
					<tr>
						<th>Keeper</th>
						<td>
						<form:input path="keeper" id="keeper"></form:input>
						<c:if test="${pageContext.request.method=='POST'}"><form:errors path="keeper" /></c:if>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="right"><input type="submit" value="Add cat!" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		<br />
		<hr />
	</body>
</html>