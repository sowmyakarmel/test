<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Jaguar</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
  
  <a class="navbar-brand" href="index.jsp" style="padding:0px;">
  <img src="resources/images/logo2.png" style="height:100%;">
</a>
</a>
			</div>
			
			<ul class="nav navbar-nav">
				<li class="active"><a href="home">Home</a></li>
				<li><a href="contactus">ContactUs</a></li>
				<li><a href="aboutus">AboutUs</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="product">Product <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="jaguarxf">Jaguar XF</a></li>
						<li><a href="jaguarxe">Jaguar XE</a></li>
						<li><a href="jaguarfpace">Jaguar F-Pace</a></li>
						<li><a href="jaguarxjl">Jaguar XJ L</a></li>
						<li><a href="jaguarftype">Jaguar F-type</a></li>
					</ul></li>

			</ul>
			<form class="navbar-form navbar-left">
				<div class="input-group">
					<input type="text" class="form-control" placeholder="Search">
					<div class="input-group-btn">
						<button class="btn btn-default" type="submit">
							<i class="glyphicon glyphicon-search"></i>
						</button>
					</div>
				</div>

				<button class="btn btn-default" type="submit">
					<i class="glyphicon glyphicon-shopping-cart"> </i>
				</button>
				<ul class="nav navbar-nav navbar-right">
      <li><a href="reg"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
		</div>
		
		</div>
		</form>
		</div>
	</nav>