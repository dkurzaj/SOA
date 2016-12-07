<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:pagetemplate>
	<jsp:attribute name="title">
		Page de connexion
	</jsp:attribute>
	<jsp:body>
		<h1 class="page-header">Inscription Entreprise</h1>
		<div class="well">
			<!-- Connexion Entreprise -->
			<form method="post" action="inscription-entreprise" class="form">
				<div class="form-group">
					<label for="firstName" class="control-label">Nom</label>
					<input type="text" id="firstName" placeholder="Nom de l'entreprise" class="form-control" autofocus>
				</div>
				<div class="form-group">
					<label for="email" class="control-label">Email</label>
					<input type="email" id="email" placeholder="Email" class="form-control">
				</div>
				<div class="form-group">
					<label for="password" class="control-label">Mot de passe</label>
					<input type="password" id="password" placeholder="Password" class="form-control">
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary btn-block">Register</button>
				</div>
			</form>
		</div>
	</jsp:body>
</t:pagetemplate>