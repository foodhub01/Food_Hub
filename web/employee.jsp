<%-- 
    Document   : product
    Created on : Mar 26, 2018, 2:18:45 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>



<h2>List of Product</h2>
   
<table border="1">
    <thead >
    <th>Employee ID</th>
    <th>Employee Name</th>
    <th>Username</th>
    <th>Designation</th>
    <th>Employee Contact</th>
    <th>Employee Password</th>
    </thead>
    <tbody>
      
        <%--<c:if test="not employeeList equals  null" var="emp">--%>
        <c:forEach  var="employee" items="${employeeList}">
             <tr>
            <td><c:out value="${employee.employeeId}"/></td>
            <td><c:out value="${employee.employeeName}"/></td>
            <td><c:out value="${employee.username}"/></td>
            <td><c:out value="${employee.designation}"/></td>
            <td><c:out value="${employee.employeeContact}"/></td>
            <td><c:out value="${employee.employeePassword}"/></td>
            <td><a href="editemployee.jsp?employeeId=${employee.employeeId}">Details</a></td>
        </tr>
        </c:forEach>
        <c:if test="${empty employeeList}" var="emp">
            <%out.println("No record");%>
        </c:if>
    </tbody>
    
</table>

<a href="addemployee.jsp"> Add Employees</a>

