<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<style><%@ include file="bootstrap.min.css" %></style>
<head>
<meta charset="ISO-8859-1">
<title>Liste de formations</title>
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

<h4>Choisir l'endroit de la formation</h4><br>



<form action="/Test/listforma" method="post">
<select name="vi">
<c:forEach items="${list}" var="li" >
<option value="${li.ville}">${li.ville}</option>
 </c:forEach>
</select>
<input type="submit" value="Choisir lieu">
</form>



</body>
</html>
