<%-- 
    Document   : signin
    Created on : Mar 18, 2018, 3:03:49 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .modal-header, h4, .close {
      background-color: lightseagreen;
      color:black !important;
      text-align: center;
      font-size: 50px;
  }
  .modal-footer {
      background-color: #f9f9f9;
  }
  .modal-content{
    width: 320px;
    padding: 10px;
    border: 1px solid lightcyan;
    margin: 0 auto; 
}
.input{
    display: block; margin: 10px;
}
  </style>

<body class="bg">

     <div class="modal-content">
        <div class="modal-header">
          <h4><span class="glyphicon glyphicon-user"></span> Log In</h4>
        </div>
         
           <div class="modal-body">
               
<form action="signin.do" method="post">
     Username:<input class="form-control" type="text" placeholder="UserName" name="username"/>
    <br>
    Password:<input class="form-control" type="password" placeholder="Password" name="password"/>
    <br><center>
        <input type="submit" value="Login" style="background-color: lightseagreen" height="10px" width="20px" size="50px"/></center>
    <br>
    
</form>
</div>
     </div>
</body>

