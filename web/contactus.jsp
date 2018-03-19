<%-- 
    Document   : contactus
    Created on : Mar 15, 2018, 12:54:46 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

  <div class="w3-container" id="contact">
      <form action="/action_page.php" class="w3-container w3-card-4 w3-light-grey w3-text-blue w3-margin">
    <h2 class="w3-center">Contact Us</h2>
    <p>If you have any questions, do not hesitate to ask them.</p>
    <i class="fa fa-map-marker w3-text-red" style="width:30px"></i> Mumbai, INDIA<br>
    <i class="fa fa-phone w3-text-red" style="width:30px"></i> Phone: 022 28185522<br>
    <i class="fa fa-envelope w3-text-red" style="width:30px"> </i> Email: foodhub@mail.com<br>
    
        <div class="w3-row w3-section">
  <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-user"></i></div>
  <div class="w3-rest">
      <input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Name" required name="Name">
  </div></div>
        
<div class="w3-row w3-section">
  <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-envelope-o"></i></div>
    <div class="w3-rest">
      <input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Email" required name="Email">
    </div></div>
        
        <div class="w3-row w3-section">
  <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-pencil"></i></div>
    <div class="w3-rest">
      <input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Message" required name="Message">
    </div></div>
            
    <p class="w3-center">
    <button class="w3-button w3-section w3-blue w3-ripple"> Send </button>
    </p>
    </form>
  </div>


<%@include file="footer.jsp" %>
