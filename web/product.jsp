<%-- 
    Document   : product
    Created on : Mar 26, 2018, 2:18:45 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<h2>List of Product</h2>
<table border="1">
    <thead >
    <th>Product ID</th>
    <th>Product Name</th>
    <th>Price</th>
    <th>Stock</th>
    </thead>
    <tbody>
      
        <%--<c:if test="not employeeList equals  null" var="emp">--%>
        <c:forEach  var="product" items="${productList}">
             <tr>
            <td><c:out value="${product.productId}"/></td>
            <td><c:out value="${product.productName}"/></td>
            <td><c:out value="${product.price}"/></td>
            <td><c:out value="${product.stock}"/></td>
            <td><a href="Editproduct.jsp?productId=${product.productId}">Details</a></td>
            
        </tr>
        </c:forEach>
       
        <c:if test="${empty productList}" var="pro">
            <%out.println("No record");%>
        </c:if>
    </tbody>
    
</table>











<%@include file="footer.jsp" %>