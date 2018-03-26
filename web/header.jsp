<%-- 
    Document   : header
    Created on : Mar 15, 2018, 12:25:15 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Food Hub</title>
       <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
      .navbar{
          margin-bottom: 0px;
          border-radius: 0;
      }
      .jumbotron{
         background-color:lightblue; 
         margin-bottom: 0;
          
          
              
        
      }
     
      
  </style>
  
    </head>
    <body>
        <header>
            <div class="container-fluid">   
        <div class ="jumbotron">
        <div class="container text-center">
           <h1>Food Hub</h1>
        </div>
            </div>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class ="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class ="nav nav-tabs">
                        <li ><a href="home.jsp">HOME</a></li>
                        <li ><a href ="aboutus.jsp">ABOUT US</a></li>
                        <li ><a href ="contactus.jsp">CONTACT US</a></li>
                        <li ><a href ="product.do">Product</a></li>
                        <ul class="nav navbar-nav navbar-right">
                        <li><a href="signup.jsp"><span class="glyphicon glyphicon-user"></span> SIGN UP</a></li>
                        <li><a href="signin.jsp"><span class="glyphicon glyphicon-log-in"></span> SIGN IN</a></li>
                        
                    </ul>
                    </ul>
                    
                    
            </div>
        </nav>
        </div>
         </header>
    </body>
</html>
