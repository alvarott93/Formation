<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style><%@ include file="bootstrap.min.css" %></style>
<head>
<meta charset="ISO-8859-1">
<title>Ajoute un lieu</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">


  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/Test/addforma">Ajouter une nouvelle formation <span class="sr-only">(current)</span></a>
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


<form action="/Test/addlieu" method="post">
<input type="text" placeholder="Adresse" name="adresse">
<input type="text" placeholder="Ville" name="ville">
<input type="submit" value="Ajouter">
</form>



</body>
</html>