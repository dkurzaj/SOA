<%@tag description="Overall page template" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- Déclarer les attributs ici... -->
<%@attribute name="title" fragment="true" %>
<%@attribute name="jumbotronheader" fragment="true" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://bootswatch.com/paper/bootstrap.min.css" crossorigin="anonymous">
	<link rel="stylesheet" href="css/style.css">
	<link href="https://fonts.googleapis.com/css?family=Lobster" rel="stylesheet">
	<title><jsp:invoke fragment="title"/></title>
</head>
<body>

	<!-- Navbar -->
	<nav class="navbar navbar-inverse">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Internshipz</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="liste-stages">Tous les stages</a></li>
					<li><a href="mes-stages">Mes stages</a></li>
					<li><a href="favoris">Favoris</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<c:choose>
						<c:when test="${!empty sessionScope.sessionNomUtilisateur}">
							<%-- Si l'utilisateur existe en session, alors on affiche son adresse email. --%>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Mon compte <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="mes-infos">Mes infos</a></li>
									<li role="separator" class="divider"></li>
									<li class="nav-user"><a href="deconnexion">${sessionScope.sessionPhotoUtilisateur} Déconnexion</a></li>
								</ul>
							</li>
						</c:when>
						<c:otherwise>
							<li><a href="connexion">Connexion</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div><!-- /.navbar-collapse -->
		</div><!-- /.container-fluid -->
	</nav>


<!-- Body (dans un container) -->
<div id="body" class="container">
	<!-- <h1 class="page-header"><jsp:invoke fragment="title"/></h1> -->
	<jsp:doBody/>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>