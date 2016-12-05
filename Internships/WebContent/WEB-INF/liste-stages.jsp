<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:pagetemplate>
	<jsp:attribute name="title">
      Liste des stages
    </jsp:attribute>

	<jsp:body>

    <!-- Outils de recherche -->
<div class="jumbotron" id="search-tools">

<div class="container">
  <form class="form-horizontal">

<!-- Search bar -->
<div class="form-group">
<div class="container">
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
		<div class="container">
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
</div>




  
  <!-- Liste des stages -->

<table class="table table-hover">
  <tbody>

    <tr>
      <td id="nonlu" class="info"></td>
      <td id="logo" class="hidden-xs"><img src="http://logok.org/wp-content/uploads/2014/09/Airbus-Logo-2006.png" class="img-responsive"/></td>

      <td id="description" class="vert-align">
        <h2 class="list-group-item-heading"><a href="details">Airbus - Développement d'un système de catapulte pour humains</a></h3>
        <p><b>Toulouse - 6 mois - à partir du 1er Février (négociable)</b></p>
        <p class="tagline">Elon Musk en avait parlé en soirée. </p>
      </td>

      <td id="favori" class="vert-align"><a href="#bloops"><span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span></a></td>
    </tr>

    <tr>
      <td id="nonlu" class=""></td>
      <td id="logo" class="hidden-xs"><img src="http://logodatabases.com/wp-content/uploads/2012/07/thales-logo.jpg" class="img-responsive"/></td>

      <td id="description">
        <h2 class="list-group-item-heading"><a href="details">Thales - Evaluation de textes rédigés par un réseau de neurones, suivant la théorie de Cuil</a></h3>
        <p><b>Toulouse - 4 à 6 mois - à partir du 1er Février</b></p>
        <p class="tagline">Amélioration du système pour générer de faux brevets et papiers scientifiques que les chinois essaieront de copier. Mouahaha !</p>
      </td>

      <td id="favori" class="vert-align"><a href="#bloops"><span class="glyphicon glyphicon-star" aria-hidden="true"></span></a></td>
    </tr>

    <tr>
      <td id="nonlu" class=""></td>
      <td id="logo" class="hidden-xs"><img src="https://www.seeklogo.net/wp-content/uploads/2014/12/twitter-logo-vector-download.jpg" class="img-responsive"/></td>

      <td id="description">
        <h2 class="list-group-item-heading"><a href="details">Twitter - Développement d'un système tweetant directement les pensées</a></h3>
        <p><b>San Francisco - 6 mois - à partir du 1er Février</b></p>
        <p class="tagline">Il suffira d'appuyer sur un bouton. C'est le futur !</p>
      </td>

      <td id="favori" class="vert-align"><a href="#bloops"><span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span></a></td>
    </tr>




  </tbody>
</table><!-- /.table -->

		
		
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

