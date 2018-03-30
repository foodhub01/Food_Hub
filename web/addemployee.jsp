<%-- 
    Document   : addemployee
    Created on : Mar 30, 2018, 2:04:44 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
         <title>welcome to Food_Hub</title>
        <meta charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="style.css" rel="stylesheet">
    </head>
 <form action="addemployee.do" method="post">
                        <div class="form-group"><br>
     Employee Name:<input class="form-control" type="text" placeholder="Employee Name" name="employeeName" required/>
    <br>
    Username:<input class="form-control" type="text" placeholder="Username" name="userName"/>
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
