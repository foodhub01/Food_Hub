<%-- 
    Document   : Book
    Created on : Mar 29, 2018, 6:16:09 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="style01.css" rel="stylesheet" type="text/css">
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap-grid.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/fontawesome.min.css">
        <script src="js/bootstrap.min.js"></script>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  <style>
      body{
         background-image:linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url("img/homebg.jpg");
    height: 100vh;
    background-position: center;
    background-size: cover;
    background-attachment: fixed;
    }
  </style>
  </head>
    <body>
    <center>
        <form>
        <div class="container">
            
            <div class="col-md-6">
                    <div class="jumbotron" style="margin-top: 30px; position: inherit">
                    <h3><center>Book your table</center></h3> 
                    <div class="container">
                                                
  <div class="dropdown">
      Choose Table :
      <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" >
      Select item
      </button><br>  
    <div class="dropdown-menu">
      <a class="dropdown-item" href="#">Table for 2 person </a>
      <a class="dropdown-item" href="#">Table for 4 person</a>
      <a class="dropdown-item" href="#">Table for 6 person</a>
      <a class="dropdown-item" href="#">Table for 8 person</a>
      
      
      
    </div>
  </div>
</div>
                        <div class="form-group"><br>
    
        <button type="submit" class="btn btn-primary form-control">Continue</button>
        
                        </div>
                    
            </div>
            
            
       
    
            
            
                    <div class="jumbotron" style="margin-top: 30px; position: inherit">
                    <h3><center>Book Floor</center></h3> 
                    <div class="container">
                                                
  <div class="dropdown">
      Choose Floor :
      <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" >
      Select item
      </button><br>  
    <div class="dropdown-menu">
      <a class="dropdown-item" href="#">1st Floor Capacity:100 persons </a>
      <a class="dropdown-item" href="#">2nd Floor Capacity:150 persons </a>
      
      
      
      
      
    </div>
      
  </div>
</div>
                        <div class="form-group"><br>
    
        <button type="submit" class="btn btn-primary form-control">Continue</button>
        
                        </div>
                    
            </div> </div>
            
            
        </div>
            </form>
        </center>
    </body>
