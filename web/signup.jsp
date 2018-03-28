<%-- 
    Document   : signup
    Created on : Mar 15, 2018, 2:25:43 PM
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
        <style>
            .login-bg{ background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.3)),url(img/homebg.jpg);
    height: 100vh;
    background-position: center;
    background-size: cover;
    background-attachment: fixed;
    top:50%;
bottom:80%;        
    left: 70%;
    position:absolute;
    transform: translate(-50% , -50%);
    width:75%;
    opacity: 0.9;
            
            
            }
    
    

  </style>
    </head>
    
 <body class="login-bg">
        <div class="container">
            
            <div class="col-md-6">
                    <div class="jumbotron" style="margin-top: 30px; position: inherit">
                    <h3><center>Register</center></h3> 
                    <form action="signup.do" method="post">
                        <div class="form-group"><br>
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
        <button type="submit" class="btn btn-primary form-control">Submit</button>
        
                        </div>
                    </form>
            </div> </div>
            
            
        </div>
    
</body>
</html>

