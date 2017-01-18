<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:pagetemplate>
	<jsp:attribute name="title">
      Page de candidature
    </jsp:attribute>
	<jsp:body>
		<h1 class="text-center">Airbus
		</h1>
		<h1><small>${stage.getTitre()}</small></h1>
					
		<!-- <p>${stage.getDescription()}</p><br/>-->
		<h2>Postuler</h2>
	    <form action="candidature" method="post">
	    
			<div class="form-group">
		    	<h3>Message</h3>
				<textarea name="msg" cols="100" rows="5"></textarea>
		  	</div>
		  	
		  	<input type="hidden" name="stage" value="${stage.getId()}"/>
		  	
		  	<div class="form-group">
		   		<label for="CV">CV:</label>
		    	<input type="file" class="form-control" id="CV" accept="application/pdf">
		  	</div>
		  	
			<div class="form-group">
		   		<label for="LM">Lettre de motivation:</label>
		    	<input type="file" class="form-control" id="LM" accept="application/pdf">
		  	</div>
		  	<button type="submit" class="btn btn-primary btn-lg">Envoyer les informations</button>
		</form>
    </jsp:body>
</t:pagetemplate>