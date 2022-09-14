<%-- 
    Document   : agecalculator
    Created on : Sep 12, 2022, 12:31:23 PM
    Author     : rylen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="POST">
            <label>Enter your age:</label>
            <input type="number" id="age" name="age" value=""><br>
            <input type="submit" value="Age next birthday"><br>
            
                    <% if (request.getAttribute("age") != null) { %>
                    <p>Your age after next birthday: <%= request.getAttribute("age")%></p>
        <% } %>
        
        <% if (request.getAttribute("message") != null) { %>
        <%= request.getAttribute("message") %>
        <% } %>
            
       

        </form>
        


    </body>
</html>
