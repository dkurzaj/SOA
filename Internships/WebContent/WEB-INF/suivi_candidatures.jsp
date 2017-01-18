<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:pagetemplate>
	<jsp:attribute name="title">
    	Page de suivi des candidatures
    </jsp:attribute>
	<jsp:body>
	  	<h1><a href="details">${stage.getTitre()}</a></h1>
	  	<h3>à ${stage.getLieu() }</h3>
	  	<p>${stage.getDescription()}</p>
	  	<br/>
	  	<h2>Liste des candidats</h2>
	  <!-- Liste des candidats -->	
		<table class="table table-hover">
	  		<tbody>
	  		    <c:forEach items="${liste}" var="postuler">
		  		    <tr>
		  		    	<td class="info"></td>
						<td class="hidden-xs" style ="vertical-align: middle;"><img src="gerard.jpg" alt="error" width="150"></td>
						<td class="vert-align">
		        			<h2 class="list-group-item-heading"><a href="details">${postuler.getEtud().getPrenom()} ${postuler.getEtud().getNom()}</a> [${postuler.getStatus()}]</h3>
		        			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. </p>
		        			<form method="get" action="aa">
								<button type="submit" class="btn btn-primary">CV</button>
								<button type="submit" class="btn btn-primary">Lettre</button>
								<a href="#?action=accepter&idpost=${postuler.getIdPostuler()}" class="btn btn-success">Accepter la demande</a>
								<a href="#?action=refuser&idpost=${postuler.getIdPostuler()}"type="button" class="btn btn-success">Refuser la demande</button>										
							</form>
						</td>
		        	</tr>
				</c:forEach>
	        	
	  
	       	</tbody>
	       </table>	        			
	        	
	     <!-- Pagination -->
		<div class="text-center">
			<ul class="pagination">
			  <li class="disabled"><a href="#">&laquo;</a></li>
			  <li class="active"><a href="#">1</a></li>
			  <li><a href="#">2</a></li>
			  <li><a href="#">3</a></li>
			  <li><a href="#">&raquo;</a></li>
			</ul>
		</div>
	</jsp:body>
</t:pagetemplate>