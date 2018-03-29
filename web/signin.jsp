<%-- 
    Document   : ex
    Created on : Mar 25, 2018, 4:48:17 PM
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
        <style>
            .login-bg{ background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.3)),url(img/homebg.jpg);
    height: 100vh;
    background-position: center;
    background-size: cover;
    background-attachment: fixed;
            top:50%;
bottom:80%;        
    left: 75%;
    position:absolute;
    transform: translate(-50% , -50%);
    width:80%;
    opacity: 0.9;}
        </style>
    </head>
    <body class="login-bg">
        <div class="container">
            <div class="col-lg-4"></div>
            <div class="col-lg-4">
                <div class="jumbotron" style="margin-top: 150px">
                    <h3><center>Log in</center></h3> 
                    <form action="signin.do" method="post">
                        <div class="form-group"><br>
    Username:<input class="form-control" type="text" placeholder="UserName" name="username"/>
    <br>
    Password:<input class="form-control" type="password" placeholder="Password" name="password"/>
<<<<<<< HEAD
    <br><center>
        <input type="submit" value="Login" style="background-color: lightseagreen" height="10px" width="20px" size="50px"/></center>
=======
>>>>>>> d5258f646a434967b13694256591c519747348a6
    <br>
        <button type="submit" class="btn btn-primary form-control">Log In</button>
        
                        </div>
                    </form>
                </div>
            </div>
            <div class="col-lg-4"></div>
        </div>
    </body>
</html>
