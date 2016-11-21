<%@tag description="Overall page template" pageEncoding="UTF-8"%>
<%@attribute name="title" fragment="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
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
		
		<div class="jumbotron">
			<h1>Qui va là ?</h1>
			<p>Avant de faire quoi que ce soit, il faut se connecter !</p>
			<p><a class="btn btn-primary btn-large" href="connection">Connexion</a></p>
		</div>
		
		<jsp:doBody/>
	
	</div>

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>