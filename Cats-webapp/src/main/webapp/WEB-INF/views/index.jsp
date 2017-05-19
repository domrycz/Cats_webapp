<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Cat's database</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-1" ariaexpanded="false">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="index" title="main_page">Main</a></li>
					<li><a href="add" title="add_cat">Add cat</a></li>
					<li><a href="showAll" title="show_cats">Show cats</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<section class="jumbotron">
		<div class="container">
			<h2>Welcome in my first app!</h2>
			<p>
			This is my first web application. I made it thanks to tutorial on very nice website: kobietydokodu.pl.
			</p>
			<p>I was using: </p>
			<ul class="list-group" style="width: 30%">
				<li class="list-group-item">Java</li>
				<li class="list-group-item">Spring</li>
				<li class="list-group-item">Bootstrap</li>
				<li class="list-group-item">IntelliJ</li>
				<li class="list-group-item">Maven</li>
			</ul>
		</div>
	</section>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>