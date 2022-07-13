<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recharge Planner</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>

	<div id="container">
		<div id="content">
			<h1 id="plan-list">List Of Available Packages</h1>
			<!-- Don't make any changes to template -->
			<!-- use below template to display details -->
			<table>
				<tr>
					<th>id</th>
					<th>PackageName</th>
					<th>CarrierType</th>
					<th>Validity</th>
					<th>Price</th>
				</tr>
				<!-- loop over and print the packages using JSTL forEach -->
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><a id="${pack.id}" class="choose-btn" 
					href="./detail/${pack.id}">Choose</a></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>