<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pagetemplate>
	<jsp:attribute name="title">
		Page de connexion
	</jsp:attribute>
	<jsp:body>
	
		<h1 class="page-header">Inscription Entreprise</h1>				
		
		<!-- Connexion Entreprise -->
		<div class="well col-sm-8 col-sm-offset-2">
			<form method="post" action="inscription-entreprise" class="form form-inline">
				<fieldset>

        <div class="form-group">
            <label for="firstName">Nom</label>
                <input type="text" id="firstName" placeholder="Nom de l'entreprise" class="form-control" autofocus>
        </div>
        <div class="form-group">
            <label for="email" >Email</label>
                <input type="email" id="email" placeholder="Email" class="form-control">
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-3 control-label">Mot de passe</label>
                <input type="password" id="password" placeholder="Password" class="form-control">
        </div>
        
        <div class="form-group">
                <button type="submit" class="btn btn-primary btn-block">Register</button>
        </div>
    
    
					<div class="form-group">
						<label class="sr-only" for="nom">Nom : </label>
						<input type="text" id="nom-entreprise" name="nom" value="<c:out value="${utilisateur.nom}"/>" size="20" maxlength="60" placeholder="Identifiant" class="form-control"/>
						<span class="erreur">${form.erreurs['email']}</span>
					</div>
	
					<div class="form-group">
						<label class="sr-only" for="motdepasse">Mot de passe : </label>
						<input type="password" id="motdepasse" name="motdepasse-entreprise" value="" size="20" maxlength="20" placeholder="Mot de passe" class="form-control"/>
						<span class="erreur">${form.erreurs['motdepasse']}</span>
					</div>
					




						
					<input type="submit" name="connexion-entreprise" value="Connexion" class="btn btn-primary" />
					
					<p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
	
				</fieldset>
			</form>
		</div>
				
	</jsp:body>
</t:pagetemplate>

