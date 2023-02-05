
<%@include file="layout/header.jsp" %>
<%@include file="layout/navbar.jsp" %>

<div class="container" style="margin-top:5%">
<p>${message}</p>
<form class="row g-3"  action="Insert_servlet" method="post">
  <div class="col-md-4">
    <label for="validationDefault01" class="form-label">Nom</label>
    <input type="text" name="nom" class="form-control" id="validationDefault01"  required>
  </div>
  
  <div class="col-md-4">
    <label for="validationDefault02" class="form-label">Prenom</label>
    <input type="text" name="prenom" class="form-control" id="validationDefault02" required>
  </div>
  
   <div class="form-check form-switch">
  <input class="form-check-input" name="gender" value="F" type="radio">
  <label class="form-check-label" for="flexSwitchCheckDefault">Female</label>
</div>
  <div class="form-check form-switch">
  <input class="form-check-input" name="gender" value="M" type="radio">
  <label class="form-check-label" for="flexSwitchCheckDefault">male</label>
</div> 
  
   <div class="col-md-3">
    <label for="validationDefault05" class="form-label">Date de naissance</label>
    <input type="date" name="dateN" class="form-control" id="validationDefault05" required>
  </div>  
  
   <div class="col-md-3">
    <label for="validationDefault05" class="form-label">Service</label>
    <input type="text" name="service" class="form-control" id="validationDefault05" required>
  </div>
  
 
  <div class="col-md-4">
    <label for="validationDefaultUsername" class="form-label">Email</label>
    <div class="input-group">
      <span class="input-group-text" id="inputGroupPrepend2">@</span>
      <input type="text"  name="email"  class="form-control" id="validationDefaultUsername"  aria-describedby="inputGroupPrepend2" required>
    </div>
  </div>
  
  
  <div class="col-md-3">
    <label for="validationDefault05" class="form-label">Matricule</label>
    <input type="number"  name="matricule" class="form-control" id="validationDefault05" required>
  </div>
  
  <div class="col-md-3">
    <label for="validationDefault03" class="form-label">ville</label>
    <input type="text"  name="ville" class="form-control" id="validationDefault03" required>
  </div>
  <div class="col-md-4">
    <label for="validationDefault04" class="form-label">Statut</label>
    <select class="form-select"  name="statut" id="validationDefault04" required>
      <option value="M">marié</option>
      <option  value="C">célibataire</option>
    </select>
  </div>
  
  <input type="hidden" name="session"  value="data suceffuly inserted" >
 
  <div class="col-12">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
      <label class="form-check-label" for="invalidCheck2">
        Agree to terms and conditions
      </label>
    </div>
  </div>
  <div class="col-12">
    <button class="btn btn-primary" type="submit">submit</button>
  </div>
</form>
</div>

<%@include file="layout/footer.jsp" %>