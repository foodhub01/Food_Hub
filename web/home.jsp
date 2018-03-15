<%-- 
    Document   : home.jsp
    Created on : Mar 15, 2018, 12:36:18 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
 <div class="container">
  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="img/pexels-photo-461198.jpeg" alt="Shawrma" style="width:100%;">
        <div class="carousel-caption">
          
        </div>
      </div>

      <div class="item">
        <img src="img/fries.jpeg" alt="Fries" style="width:100%;">
        <div class="carousel-caption">
         
        </div>
      </div>
    
      <div class="item">
        <img src="img/pancake.jpeg" alt="Pancake" style="width:100%;">
        <div class="carousel-caption">
          </div>
        </div>
      <div class="item">
        <img src="img/salad.jpg" alt="Salad" style="width:100%;">
        <div class="carousel-caption">
          
        </div>
        
      </div>
  
    

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
     
     <%@include file="footer.jsp" %>
