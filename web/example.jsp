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
                    <a href="" class="btn btn-full">Show me more</a>
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
        <!-- About Section -->
        <section class="info">
  
      <h2 class="text-center">ABOUT FOODHUB</h2>
    <div class="container">
        <div class="row">  
            <div class="col-md-6">
     <img src="img/about.jpg" class="" alt="about us img" width="100%" height="100%">
    </div>
        

      <div class="col-md-6">
          <div class="intro">
            
      <h5 class="text-center">Tradition Since 2010</h5><br>
      <p>Food Hub services came into existence as an innovative approach by two IIT graduate students, Tina and James,
      in 2010. The restaurant offers a sophisticated yet totally ethnic experience where the display kitchen is part of the restaurant. In Food Hub, while dining, guests
      are given checked aprons and are encouraged to eat with their hands to experience the food through all their senses.</p>
      <p>In 2011,Tine and James decided to expand their  business across the country. </p><br>
      <p>At present, Food Hub restaurants has their branches across the country and became a well-known brand in
      Indian cuisine restaurants.</p>
      </div>
      </div></div>
            
     </section>
        <section class="cities">
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
        
        <section class="form">
            <div class="container">
                <h2>WE WILL HAPPY TO HEAR FROM YOU</h2>
                
            </div>
            
            <div class="row gap">
                <div class="col-md-4">
                <p>If you have any questions, do not hesitate to ask them.</p>
    <i class="fa fa-map-marker w3-text-red" style="width:30px"></i> Mumbai, INDIA<br>
    <i class="fa fa-phone w3-text-red" style="width:30px"></i> Phone: 022 28185522<br>
    <i class="fa fa-envelope w3-text-red" style="width:30px"> </i> Email: foodhub@mail.com<br> <br>
    <img src="img/contactus.jpg" class="img-thumbnail" width="100%">
    
    
                </div>
                <div class="col-md-8">
                    <input type="text" placeholder="Name" class="form-control"><br>
    <input type="email" placeholder="EMAIL" class="form-control"><br> 
                    <textarea class="form-control" rows="10" placeholder="COMMENTS"></textarea>
                    <button class="btn btn-warning btn-block">Submit</button>
            </div>
            </div>
        </section>
    </body>
</html>
