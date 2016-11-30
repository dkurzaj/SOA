<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pagetemplate>
    <jsp:attribute name="title">
      Détails de l'offre
    </jsp:attribute>
    <jsp:body>
    	<div class="row">
    		<div class="col-xs-12">
    			<h1><span class="details-entreprise">Company</span> <span class="details-offre">A nice internship offer with a long buzzword-filled title</span></h1>
				<h2><span class="details-lieu">Toulouse</span> <span class="details-duration">6 months</span> <span class="details-start">starting 01 Feb 2016</span></h2>
    		</div>
    		<div class="col-xs-9">
    			<div class="details-description">
					<p><strong>Pellentesque habitant morbi tristique</strong> senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. <em>Aenean ultricies mi vitae est.</em> Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, <code>commodo vitae</code>, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. <a href="#">Donec non enim</a> in turpis pulvinar facilisis. Ut felis.</p>
					
					<ol>
					   <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>
					   <li>Aliquam tincidunt mauris eu risus.</li>
					</ol>
					
					<p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.</p>
					
					<ul>
					   <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>
					   <li>Aliquam tincidunt mauris eu risus.</li>
					</ul>
				</div>
    		</div>
    		<div class="col-xs-3">
    			<p><img src="https://fr.mappy.com/front-services/map/31000-toulouse" alt="Carte position du stage" class="details-map"/></p>
    			<p>
    				<a href="/" class="btn btn-primary">Apply</a>
    				<a href="/" class="btn btn-default">Message</a>
    			</p>
    		</div>
    	</div>
    
		
		
		
    </jsp:body>
</t:pagetemplate>

