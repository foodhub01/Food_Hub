<%-- 
    Document   : Editproduct
    Created on : Mar 28, 2018, 5:12:59 PM
    Author     : Vedant
--%>

<%@page import="com.project.food_hub.entities.Product"%>
<%@page import="com.project.food_hub.daoimpl.ProductDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Food_Hub</title>
</head>    <body>

<form action="editproduct.do" method="post">
<%
Product product = new ProductDAOImpl().getProductById(Integer.parseInt(request.getParameter("productId")));
request.setAttribute("product",product);
%>
<input type="hidden" name="productid" value="${product.productId}" />
            Product Name :<input type="text" name="productname" value="${product.productName}" />
            <br/>
            Price :<input type="text" name="price" value="${product.price}" />
            <br/>
            Stock :<input type="text" name="stock" value="${product.stock}"/>
            <br/>
            <input type="submit" name="action" value="Save Changes" />
            <input type="submit" name="action"  value="Delete" />
        </form>
       <body>

</html>