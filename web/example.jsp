<%-- 
    Document   : example1
    Created on : Mar 22, 2018, 11:01:25 AM
    Author     : RaHuL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Food Hub</title>
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap-grid.min.css" rel="stylesheet">
        <link href="style01.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="css/fontawesome-all.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <header>
            
            <div class="row">
                <div class="logo">
                    <h1>FoodHub</h1>
                </div>
                
                <ul class="main-nav">
                    <li><a href="">HOME</a></li>
                    <li><a href="aboutusex.jsp">ABOUT US</a></li>
                    <li><a href="contactusex.jsp">CONTACT US</a></li>
                    <li><a href="signup.jsp">SIGN UP</a></li>
                    <li><a href="ex.jsp">SIGN IN</a></li>
                </ul>
            </div>
            <div class="container-fluid">
            <div class="slogan">
                <h1>SAY HELLO...!<br>TO SUPER HEALTHY MEALS</h1>
                <div class="quick_button">
                    <a href="" class="btn btn-half">Quick search</a>
                    <a href="#cities" class="btn btn-full">Show me more</a>
                </div>  
            </div></div>
        </header>
        
        <section class="meal">
            <ul class="meal-list">
                <li>
                    <figure class="meal-photo">
                        <img src="img/cake.jpg">
                    </figure>
                </li><li>
                    <figure class="meal-photo">
                        <img src="img/Dhokla.jpg">
                    </figure>
                </li><li>
                    <figure class="meal-photo">
                        <img src="img/Idly.jpg">
                    </figure>
                </li><li>
                    <figure class="meal-photo">
                        <img src="img/chicken_fries.jpg">
                    </figure>
                </li><li>
                    <figure class="meal-photo">
                        <img src="img/salad.jpg">
                    </figure>
                </li><li>
                    <figure class="meal-photo">
                        <img src="img/salad.jpg">
                    </figure>
                </li><li>
                    <figure class="meal-photo">
                        <img src="img/fries.jpeg">
                    </figure>
                </li><li>
                    <figure class="meal-photo">
                        <img src="img/pizza.jpg">
                    </figure>
                </li>
            </ul>
        </section>
        
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
