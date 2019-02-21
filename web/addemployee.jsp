<%-- 
    Document   : addemployee
    Created on : Mar 30, 2018, 2:04:44 PM
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
 <form action="addemployee.do" method="post">
     <center>  <h1> Add Employee </h1></center>
                        <div class="form-group"><br>
     Employee Name:<input class="form-control" type="text" placeholder="Employee Name" name="employeeName" required/>
    <br>
    Username:<input class="form-control" type="text" placeholder="Username" name="username"/>
    <br>
    Designation:<input class="form-control" type="text" placeholder="Designation" name="designation"/>
    <br>
    Employee Contact:<input class="form-control" type="text" placeholder="Employee Contact" name="employeeContact"/>
    <br>
    Employee Password:<input class="form-control" type="text" placeholder="Employee Password" name="employeePassword"/>
    <br>
        <button type="submit" class="btn btn-primary form-control">Submit</button>
        
                        </div>
                    </form>
</body>