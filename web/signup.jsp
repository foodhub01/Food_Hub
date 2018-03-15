<%-- 
    Document   : signup
    Created on : Mar 15, 2018, 2:25:43 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<style>
    .signup{
        ;
    }
    .bg { 
    
    background-image: url("img/fries.jpeg");

    
    height: 100%; 

   
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}
</style>
<body class="bg">
    
<div class="signup">
    <center>
<form action="signup.do" method="post">
    Name:<input type="text" name="customername"/>
    <br><br>
    Username:<input type="text" name="username"/>
    <br><br>
    Address:<input type="text" name="address"/>
    <br><br>
    Email:<input type="text" name="emailid"/>
    <br><br>
    Contact No:<input type="text" name="contactno"/>
    <br><br>
    Birth Date:<input type="text" name="birthdate"/>
    <br><br>
    Password:<input type="text" name="password"/>
    <br><br>
    <input type="submit" value="Submit"/>
    <br><br>
</form></center>
</div>
</body>
<%@include file="footer.jsp" %>
