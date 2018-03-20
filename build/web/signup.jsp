<%-- 
    Document   : signup
    Created on : Mar 15, 2018, 2:25:43 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
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
  .modal-body{
    width: 320px;
    padding: 10px;
    border: 5px;
    margin: 0; 
}
  </style>

<body class="bg">
<center>
     <div class="modal-content">
        <div class="modal-header" style="padding:20px 20px;">
          <h4><span class="glyphicon glyphicon-user"></span> REGISTER </h4>
        </div>
         
           <div class="modal-body" style="padding:10px 50px;">
               
<form action="signup.do" method="post">
    Name:<input class="form-control" type="text" placeholder="FullName" name="customername" required/>
    <br>
    Username:<input class="form-control" type="text" placeholder="UserName" name="username"/>
    <br>
    Address:<input class="form-control" type="text" placeholder="Full address" name="address"/>
    <br>
    Email:<input class="form-control" type="text"placeholder="Email" name="emailid"/>
    <br>
    Contact No:<input class="form-control" type="text" placeholder="Contact info" name="contactno"/>
    <br>
    Birth Date:<input class="form-control" type="text" placeholder="YYYY/MM/DD" name="birthdate"/>
    <br>
    Password:<input class="form-control" type="password" placeholder="Password" name="password"/>
    <br>
    <input type="submit" value="Submit"/>
    <br>
</form>
</div>
     </div>
</body></center>
<%@include file="footer.jsp" %>
