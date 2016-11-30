<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pagetemplate>
    <jsp:attribute name="title">
      Page de connexion
    </jsp:attribute>
    <jsp:body>
		<c:if test="${!empty sessionScope.sessionNomUtilisateur}">
			<%-- Si l'utilisateur existe en session, alors on affiche son adresse email. --%>
			<p class="succes">Bienvenue : ${sessionScope.sessionIdentiteUtilisateur}.</p>
			<form method="get" action="deconnexion" class="form">
			    <fieldset>
					<input type="submit" value="Me déconnecter" class="btn btn-primary" />
		</c:if>
		<c:if  test="${empty sessionScope.sessionNomUtilisateur}">
			<h1 class="page-header">Connexion</h1>
			
			<div class="well">
				<form method="post" action="connexion" class="form form-inline">
				    <fieldset>
				    
				        <p>Vous pouvez vous connecter en utilisant vos identifiants INSA.</p>
				
						<div class="form-group">
					        <label class="sr-only" for="nom">Nom : </label>
					        <input type="text" id="nom" name="nom" value="<c:out value="${utilisateur.nom}"/>" size="20" maxlength="60" placeholder="Identifiant" class="form-control"/>
					        <span class="erreur">${form.erreurs['email']}</span>
				        </div>
				
						<div class="form-group">
					        <label class="sr-only" for="motdepasse">Mot de passe : </label>
					        <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" placeholder="Mot de passe" class="form-control"/>
					        <span class="erreur">${form.erreurs['motdepasse']}</span>
				        </div>
				
						
				        <input type="submit" value="Connexion" class="btn btn-primary" />
				        
				        <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
				    </fieldset>
				</form>
			</div>
		</c:if>
    </jsp:body>
</t:pagetemplate>

