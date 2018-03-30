<%-- 
    Document   : home.jsp
    Created on : Mar 15, 2018, 12:36:18 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Food Hub</title>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="style01.css" rel="stylesheet" >
    </head>
    <body>
        <header>
            
            <div class="row">
                <div class="logo">
                    <h1>FoodHub</h1>
                </div>
                
                <ul class="main-nav">
                    <li><a href="">HOME</a></li>
                    <li><a href="aboutus.jsp">ABOUT US</a></li>
                    <li><a href="contactus.jsp">CONTACT US</a></li>
                    <li><a href="signup.jsp">SIGN UP</a></li>
                    <li><a href="signin.jsp">SIGN IN</a></li>
                </ul>
            </div>
            <div class="container-fluid">
            <div class="slogan">
                <h1>SAY HELLO...!<br>TO SUPER HEALTHY MEALS</h1>
                <div class="quick_button">
                    <a href="quicksearch.jsp" class="btn btn-half">Quick search</a>
                    <a href="#cities" class="btn btn-full">Search Branches</a>
                </div>  
            </div></div>
        </header>
        <section class="cities" id="cities">
            <h2>WE ARE CURRENTLY IN THESE CITIES</h2>
            <div class="container">
                <div class="row">
                    <div class="col-md-3">
                        <img src="img/mumbai.jpg">
                        <h4>MUMBAI</h4>
                        <p><span>1000+ Happy customer</span></p>
                </div>
                    <div class="col-md-3">
                        <img src="img/Kolkata.jpg">
                        <h4>KOLKATA</h4>
                        <p><span>1000+ Happy customer</span></p>
                </div>
                    <div class="col-md-3">
                        <img src="img/bangalore.jpg">
                        <h4>BANGALORE</h4>
                        <p><span>1000+ Happy customer</span></p>
                </div>
                    <div class="col-md-3">
                        <img src="img/delhi.jpg">
                        <h4>DELHI</h4>
                        <p><span>1000+ Happy customer</span></p>
                </div>
            </div></section>
       
           </body>
</html>
           
