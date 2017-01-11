<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pagetemplate>
    <jsp:attribute name="title">
      Détails de l'offre
    </jsp:attribute>
    <jsp:body>
    	<div class="row">
    		<div class="col-xs-12">
    			<h1 class="page-header"><span class="details-entreprise"></span> <span class="details-offre">${stage.getTitre()}</span></h1>
				<h2><span class="details-lieu">${stage.getLieu()}</span> <span class="details-duration">${stage.getDuree()} mois</span> <span class="details-start"> à partir du <fmt:formatDate value="${stage.getDebut()}" pattern="dd MMM yyyy" /></span></h2>
    		</div>
    		<div class="col-xs-9">
    			<div class="details-description">
					${stage.getDescription()}
				</div>
    		</div>
    		<div class="col-xs-3">
    			<p><img src="https://fr.mappy.com/front-services/map/31000-toulouse" alt="Carte position du stage" class="details-map"/></p>
    			<p>
    				<a href="candidature?id=${stage.getId()}" class="btn btn-primary">Candidater</a>
    				<a href="/" class="btn btn-default">Contacter</a>
    			</p>
    		</div>
    	</div>
		
		
    </jsp:body>
</t:pagetemplate>

