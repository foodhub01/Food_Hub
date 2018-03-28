<%-- 
    Document   : product
    Created on : Mar 26, 2018, 2:18:45 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <input type="hidden" name="productList" value="${productList}" />
      
        <%--<c:if test="not employeeList equals  null" var="emp">--%>
        <c:forEach  var="product" items="${productList}">
             <tr>
            <td><c:out value="${product.productID}"/></td>
            <td><c:out value="${product.productName}"/></td>
            <td><c:out value="${product.price}"/></td>
            <td><c:out value="${product.stock}"/></td>
            <!--<td><a href="editemployee.jsp?empid=${employee.employeeID}">Details</a></td>-->
            
            <!--<td><a href="editemployee.jsp?empid=${employee.employeeID}">Delete</a></td>-->
        </tr>
        </c:forEach>
        <%--</c:if>--%>
        <c:if test="${empty productList}" var="product">
            <%out.println("No record");%>
        </c:if>
    </tbody>
    
</table>











<%@include file="footer.jsp" %>