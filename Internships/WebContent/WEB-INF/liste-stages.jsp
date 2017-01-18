<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:pagetemplate>
	<jsp:attribute name="title">
		Liste des stages
	</jsp:attribute>
	<jsp:body>

		<!-- Outils de recherche -->
		<div class="well" id="search-tools">
			<form class="form-horizontal">
				<!-- Search bar -->
				<div class="form-group">
					<div class="col-xs-12">
						<div class="input-group">
							<input type="text" class="form-control" placeholder="Mots clés (optionnel)" name="q">
							<div class="input-group-btn">
								<button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
							</div>
						</div>
					</div>
				</div>
				<!-- Paramètres de recherche -->
				<div class="form-group">
					<div class="col-xs-12">
						<div class="col-sm-3">
							<select class="form-control form-horizontal" id="search-year">
								<option selected>Année</option>
								<option>1st year</option>
								<option>2nd year</option>
								<option>3rd year</option>
								<option>4th year</option>
								<option>5th year</option>
							</select>
						</div>
						<div class="col-sm-3">
							<select class="form-control form-horizontal" id="search-specialty">
								<option selected>Spécialité</option>
								<option>Computer Science</option>
								<option>Civil Engineering</option>
								<option>Biology</option>
								<option>Other</option>
							</select>
						</div>
						<div class="col-sm-3">
							<select class="form-control form-horizontal" id="search-city">
								<option selected>Ville</option>
								<option>Toulouse</option>
								<option>Paris</option>
								<option>London</option>
								<option>Budapest</option>
							</select>
						</div>
						<div class="col-sm-3">
							<select class="form-control">
								<option selected>Trier par...</option>
								<option>Title - Alphabetical</option>
								<option>Title - Reverse alphabetical</option>
								<option>Company - Alphabetical</option>
								<option>Company - Reverse alphabetical</option>
								<option>City - Alphabetical</option>
								<option>City - Reverse alphabetical</option>
							</select>
						</div>
					</div>
				</div>
			</form>
		</div>

		<!-- Liste des stages -->
		<table class="table table-hover">
			<tbody>
				<c:forEach items="${liste}" var="stage">
					<tr>
						<td id="nonlu" class="info"></td>
						<td class="hidden-xs"><img src="http://logok.org/wp-content/uploads/2014/09/Airbus-Logo-2006.png" class="logo img-responsive"/></td>
						<td id="description" class="vert-align">
							<h2 class="list-group-item-heading"><a href="details?id=${stage.getId()}">${stage.getEntreprise().getNom()} - ${stage.getTitre()}</a></h2>

							<span class="label label-info">**Année**</span>
							<span class="label label-success">**Spécialité**</span>
							<span class="label label-primary">${stage.getLieu()}</span>
							<span class="label label-default">${stage.getDuree()} mois - à partir du <fmt:formatDate value="${stage.getDebut()}" pattern="dd MMM yyyy" /></span>
							
							<p class="tagline">${stage.getDescription()}</p>
						</td>
						<td id="favori" class="vert-align"><a href="#bloops"><span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span></a></td>
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