<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<style>
<%@ include file="bootstrap.min.css" %>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Liste de formations par lieu</title>
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


<h2>LISTE DE FORMATIONS DANS ${message}</h2>



<table>
  <tr>
    <th>Definition formation</th>
    <th>Ville Formation</th>
    <th>Endroit Formation</th>
  </tr>
<c:forEach items="${list}" var="formation">
  <tr>
    <td><h2>${formation.theme}</h2></th>
    <td><h2>${formation.lieu.ville}</h2></th>
    <td><h2>${formation.lieu.adresse}</h2></th>
  </tr>
  </c:forEach>
  </table>



</body>
</html>