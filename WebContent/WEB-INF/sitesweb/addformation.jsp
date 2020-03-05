<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<style><%@ include file="bootstrap.min.css" %></style>
<head>
<meta charset="ISO-8859-1">
<title>Ajoute une formation</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">


  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/Test/addforma">Ajouter une nouvelle formation</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/Test/addlieu">Ajouter un lieu</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/Test/listforma">Lister les formations existantes</a>
      </li>
    </ul>
    </div>
</nav>


<form action="/Test/addforma" method="post">
<h4>Introduire la description de la formation</h4><br>
<input type="text" placeholder="description" name="descrip"><br>
<h4>Choisir l'endroit ou elle se derroule</h4><br>
<select name="idl">
<c:forEach items="${list}" var="lieuu" >
<option value="${lieuu.idLieu}">${lieuu.ville},${lieuu.adresse} </option>
 </c:forEach>
</select>
<input type="submit" value="Ajouter">
</form>


</body>
</html>