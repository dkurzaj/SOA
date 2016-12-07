<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pagetemplate>
	<jsp:attribute name="title">
		Page de connexion
	</jsp:attribute>
	<jsp:body>
		<c:choose>
			<c:when test="${!empty sessionScope.sessionNomUtilisateur}">
				<%-- Si l'utilisateur existe en session, alors on affiche son adresse email. --%>
				<p class="succes">Bienvenue : ${sessionScope.sessionIdentiteUtilisateur}.</p>
				${sessionScope.sessionPhotoUtilisateur}
				<form method="get" action="deconnexion" class="form">
					<fieldset>
						<input type="submit" value="Me déconnecter" class="btn btn-primary" />
					</fieldset>
				</form>
			</c:when>
			<c:otherwise>
			
				<h1 class="page-header">Connexion</h1>



				<!-- Connexion Etudiant -->
				<div class="well col-sm-4 col-sm-offset-1">
					<form method="post" action="connexion" class="form">
						<img src="https://www.creatis.insa-lyon.fr/site7/sites/www.creatis.insa-lyon.fr/files/INSA-LYON_logo-couleurs_reduit.jpg" class="logo img-responsive"/>
						<p><strong>Etudiants et staff INSA :</strong><br/>Vous pouvez vous connecter en utilisant vos identifiants INSA.</p>

						<div class="form-group">
							<label class="sr-only" for="nom">Nom : </label>
							<input type="text" id="nom" name="nom" size="20" maxlength="60" placeholder="Identifiant" class="form-control"/>
						</div>

						<div class="form-group">
							<label class="sr-only" for="motdepasse">Mot de passe : </label>
							<input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" placeholder="Mot de passe" class="form-control"/>
						</div>

						<input type="hidden" name="type-connexion" value="insa"/>
						<input type="submit" name="connexion-insa" value="Connexion" class="btn btn-primary"/>

					</form>
				</div>
				
				
				<!-- Connexion Entreprise -->
				<div class="well col-sm-4 col-sm-offset-1">
					<form method="post" action="connexion" class="form">
						<img src="http://i1.kym-cdn.com/photos/images/newsfeed/001/112/704/8a8.jpg" class="logo img-responsive"/>
						<p><strong>Entreprises :</strong></p>

						<div class="form-group">
							<label class="sr-only" for="nom">Nom : </label>
							<input type="text" id="nom" name="nom" size="20" maxlength="60" placeholder="Identifiant" class="form-control"/>
						</div>

						<div class="form-group">
							<label class="sr-only" for="motdepasse">Mot de passe : </label>
							<input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="60" placeholder="Mot de passe" class="form-control"/>
						</div>
						
						<input type="hidden" name="type-connexion" value="entreprise"/>							
						<input type="submit" name="connexion-entreprise" value="Connexion" class="btn btn-primary"/>
						
						<hr/>
						
						<p>ou <a href="inscription-entreprise">inscrivez-vous</a></p>
					</form>
				</div>
				
				
			</c:otherwise>
		</c:choose>
	</jsp:body>
</t:pagetemplate>

