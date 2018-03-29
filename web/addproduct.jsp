<%-- 
    Document   : addproduct
    Created on : Mar 29, 2018, 12:33:12 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
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
<%@include file="footer.jsp" %>