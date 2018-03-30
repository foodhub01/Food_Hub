<%-- 
    Document   : order
    Created on : Mar 29, 2018, 8:04:32 PM
    Author     : RaHuL
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
    <body>
        <div class="container">
            
            <div class="col-md-6">
                    <div class="jumbotron" style="margin-top: 30px; position: inherit">
                    <h3><center>Place your order</center></h3> 
                    <div class="container">
                                                
  <div class="dropdown">
      Choose item :
      <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" >
      Select item
      </button><br>  
    <div class="dropdown-menu">
      <a class="dropdown-item" href="#">item 1</a>
      <a class="dropdown-item" href="#">item 2</a>
      <a class="dropdown-item" href="#">item 3</a>
    </div>
        <form class="form-inline" action="/action_page.php">
    <label for="email">Quantity:</label>
    <input type="text" class="dropdown-toggle-split" data-toggle="dropdown"/>
    <div class="dropdown-menu">
      <a class="dropdown-item" href="#">1</a>
      <a class="dropdown-item" href="#">2</a>
      <a class="dropdown-item" href="#">3</a>
    </div>
       </form>
  </div>
</div>
                        <div class="form-group"><br>
    
        <button type="submit" class="btn btn-primary form-control">Continue</button>
        
                        </div>
                    </form>
            </div> </div>
            
            
        </div>
    </body>
</html>