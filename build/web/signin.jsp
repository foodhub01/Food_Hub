<%-- 
    Document   : signin
    Created on : Mar 18, 2018, 3:03:49 PM
    Author     : Vedant
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<center>
    <h2> Enter Login Details</h2>
    <p>
    <form action="signin.do" method="post">
        Username:<input type="text" name="username"/>
        <br><br>
        Password:<input type="password" name="password"/>
        <br><br>
        <input type="submit" value="Login"/>
        <br>
    </form>
    </p>
</center>

<%@include file="footer.jsp" %>
