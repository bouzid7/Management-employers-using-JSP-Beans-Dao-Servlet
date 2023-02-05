
<%@include file="header.jsp" %>

<nav id="navbar-example2" class="navbar navbar-light bg-light px-3">
<div class="container-fluid">
 <ul class="nav nav-pills">
     <li class="nav-item">
      <a class="nav-link" style="font-family: 'Nunito', sans-serif;" href="home.jsp"><i class="fa fa-home"></i>&nbsp;home</a>
    </li>
     <li class="nav-item">
      <a class="nav-link" style="font-family: 'Nunito', sans-serif;" href="getAll"><i class="fa fa-list"></i>&nbsp;listEmp</a>
    </li>
      <li class="nav-item">
        <a class="nav-link" style="font-family: 'Nunito', sans-serif;" href="addEmp.jsp"><i class="fa fa-plus"></i>&nbsp;add</a>
      </li>

            <li class="nav-item dropdown">
              <a  class="nav-link dropdown-toggle" href="" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              
                <button type="button" class="btn btn-success">admin</button>
              </a>
              <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                <li><a class="dropdown-item" style="background-color:red;" href="LogOutServlet">log out</a></li>
              </ul>
            </li>
</ul>
<div>
</nav>