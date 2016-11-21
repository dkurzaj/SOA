<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pagetemplate>
    <jsp:attribute name="title">
      Page de connexion
    </jsp:attribute>
    <jsp:body>
    
        <form method="post" action="connection" class="form">
		    <fieldset>
		        <legend>Connexion</legend>
		        <p>Vous pouvez vous connecter en utilisant vos identifiants INSA.</p>
		
		        <label for="nom">Nom : </label>
		        <input type="text" id="nom" name="nom" value="<c:out value="${utilisateur.nom}"/>" size="20" maxlength="60" class="form-control"/>
		        <span class="erreur">${form.erreurs['email']}</span>
		        <br />
		
		        <label for="motdepasse">Mot de passe : </label>
		        <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" class="form-control"/>
		        <span class="erreur">${form.erreurs['motdepasse']}</span>
		        <br />
		
		        <input type="submit" value="Connexion" class="btn btn-primary" />
		        <br />
		        
		        <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
		    </fieldset>
		</form>
		
    </jsp:body>
</t:pagetemplate>

