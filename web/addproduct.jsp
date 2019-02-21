<%-- 
    Document   : addproduct
    Created on : Mar 29, 2018, 12:33:12 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
        
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap-grid.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/fontawesome.min.css">
        <script src="js/bootstrap.min.js"></script>
        <style>
            body{ background-image:linear-gradient(rgba(0,0,0,0.3),rgba(0,0,0,0.3)),url(img/homebg.jpg);
    height: 100vh;
    background-position: center;
    background-size: cover;
    background-attachment: fixed;
    top:50%;
bottom:50%;        
    left: 50%;
    position:absolute;
    transform: translate(-50% , -50%);
    width:55%;
    opacity: 0.9;
            
            
            }
            h1{
                color:white;
            }
    
    

  </style>
    </head>
    <body>
    <center><h1>Add Product</h1></center>
 <form action="addproduct.do" method="post">
                        <div class="form-group"><br>
     Product Name:<input class="form-control" type="text" placeholder="Product Name" name="productname" required/>
    <br>
    Price:<input class="form-control" type="text" placeholder="Price" name="price"/>
    <br>
    Stock:<input class="form-control" type="text" placeholder="Stock" name="stock"/>
    <br>
   
        <button type="submit" class="btn btn-primary form-control">Submit</button>
        
                        </div>
                    </form>
    </body>