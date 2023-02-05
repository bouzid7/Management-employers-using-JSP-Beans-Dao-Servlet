<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*"%>
<%@page import="EmpManagemen_beans.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="layout/header.jsp" %>
<meta charset="UTF-8">
<title>listEmp</title>
</head> 
<body>
<%@include file="layout/navbar.jsp" %>
<div class="container" style="margin-top:2%;overflow:hidden" >
 <br>

<button type="button" class="btn btn-light">
&nbsp;<a href="Paginate?page=1">1</a>&nbsp;
<a href="Paginate?page=2">2</a>&nbsp;
<a href="Paginate?page=3">3</a>&nbsp;
<a href="Paginate?page=4">4</a>&nbsp;
<a href="getAll">tous</a>&nbsp;
</button>

<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">#id</th>
      <th scope="col">Nom</th>
      <th scope="col">Prenom</th>
      <th scope="col">Gender</th>
      <th scope="col">Statut</th>
      <th scope="col">Matricule</th>
      <th scope="col">Email</th>
      <th scope="col">Date de naissance</th>
      <th scope="col">Service</th>
      <th scope="col">Ville</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>

<c:forEach  items="${emp}"  var="e">
<tr>
  
      <th scope="row">   <c:out  value="${e.getId()}" ></c:out></th>  
      <td><c:out  value="${e.getNom()}" ></c:out></td>
      <td><c:out  value="${e.getPrenom()}" ></c:out></td>
      <td><c:out  value="${e.getGender()}" ></c:out></td>
      <td><c:out  value="${e.getStatut()}" ></c:out></td>
      <td><c:out  value="${e.getMatricule()}" ></c:out></td>
      <td><c:out  value="${e.getEmail()}" > </c:out></td>
      <td><c:out  value="${e.getDateN()}" ></c:out></td>
      <td><c:out  value="${e.getService()}" ></c:out></td>
      <td><c:out  value="${e.getVille()}" ></c:out></td>
      <td>
<a href="updateEmp.jsp?id=${e.getId()}" style="background-color:greenyellow;" class="btn btn-default border">update <i class="fa fa-edit"></i></a>
<a href="Delete_servlet?id=${e.getId()}" class="btn btn-default border rem_form" ><span class="fa fa-trash text-danger"></span></a>
      </td>
</tr>
</c:forEach>

  </tbody>
</table>
</div>

<%@include file="layout/footer.jsp" %>

</body>
</html>