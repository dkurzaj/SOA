<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pagetemplate>
    <jsp:attribute name="title">
      Liste des stages
    </jsp:attribute>
    <jsp:body>
<div class="jumbotron" style="min-height: 100px; margin-top: 70px;">

  <form class="form-horizontal">

    <div class="form-group">
      <div class="col-sm-5 col-md-4">
        <div class="container">
          <p>Refine your search...</p>
        </div>
      </div>
      <div class="col-sm-7">
        <div class="col-sm-4">
          <select class="form-control form-horizontal" id="search-year" placeholder="Year of study">
            <option>1st year</option>
            <option>2nd year</option>
            <option>3rd year</option>
            <option>4th year</option>
            <option>5th year</option>
          </select>
        </div>
        <div class="col-sm-4">
          <select class="form-control form-horizontal" id="search-specialty" placeholder="Specialty">
            <option>Computer Science</option>
            <option>Civil Engineering</option>
            <option>Biology</option>
            <option>Other</option>
          </select>
        </div>
        <div class="col-sm-4">
          <select class="form-control form-horizontal" id="search-city">
            <option>Toulouse</option>
            <option>Paris</option>
            <option>London</option>
            <option>Budapest</option>
          </select>
        </div>
      </div>
    </div>

    <div class="form-group">
      <div class="col-sm-5 col-md-4">
        <div class="container">
          <p>Sort by...</p>
        </div>
      </div>
      <div class="col-sm-7">
        <div class="col-sm-4">
          <select class="form-control">
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
    
		
		
		
    </jsp:body>
</t:pagetemplate>

