<%@tag description="Overall page template" pageEncoding="UTF-8"%>
<%@attribute name="title" fragment="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://bootswatch.com/paper/bootstrap.min.css" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<title><jsp:invoke fragment="title"/></title>
</head>
<body>

	<nav class="navbar navbar-default">
	  <div class="container">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#">
	        <img alt="Brand" src="...">
	      </a>
	    </div>
	  </div>
	</nav>

	<div class="container">
	
		<h1 class="page-header"><jsp:invoke fragment="title"/></h1>
		
		<jsp:doBody/>
	
	</div>

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>