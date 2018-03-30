<%-- 
    Document   : editemployee
    Created on : Mar 30, 2018, 12:03:42 PM
    Author     : Vedant
--%>

<%@page import="com.project.food_hub.entities.Employee"%>
<%@page import="com.project.food_hub.daoimpl.EmployeeDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Food_Hub</title>
</head>
<body>

<form action="employeelist.do" method="post">
<%
Employee employee = new EmployeeDAOImpl().getEmployeeById(Integer.parseInt(request.getParameter("employeeId")));
request.setAttribute("employee",employee);
%>
<input type="hidden" name="employeeId" value="${employee.employeeId}" />
            Employee Name :<input type="text" name="employeeName" value="${employee.employeeName}" />
            <br/>
            Username :<input type="text" name="userName" value="${employee.userName}" />
            <br/>
            Designation :<input type="text" name="designation" value="${employee.designation}"/>
            <br/>
            Employee Contact :<input type="text" name="employeeContact" value="${employee.employeeContact}"/>
            <br/>
            Employee Password :<input type="text" name="employeePassword" value="${employee.employeePassword}"/>
            <br/>
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
       </body>

</html>
