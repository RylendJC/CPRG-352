<%-- 
    Document   : register
    Created on : Oct 18, 2022, 11:56:09 AM
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
        <h1>Shopping List</h1>
        
        <form action="shoppingList" method="POST">
            <input type="hidden" name="action" value="register">
            <label>
                Name:
                <input type="text" name="name" id="name">
                
                <button type="submit">Submit</button>
            </label>    
        </form>
    </body>
</html>
