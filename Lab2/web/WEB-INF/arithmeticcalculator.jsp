<%-- 
    Document   : arithmiccalculator
    Created on : Sep 14, 2022, 11:21:11 AM
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
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="POST">
            <label>Enter First:</label>
            <input type="number" id="first" name="first" value=""><br>
            <label>Enter Second:</label>

            <input type="number" id="second" name="second" value=""><br>

            <p>
                <button type="submit" name="operation" value="+">+</button>
                <button type="submit" name="operation" value="-">-</button>
                <button type="submit" name="operation" value="*">*</button>
                <button type="submit" name="operation" value="%">%</button>
            </p>


            <% if (request.getAttribute("message") != null) {%>
            <p>Result: <%= request.getAttribute("message")%></p>
            <% }%>
        </form>
        <a href="/Lab2/age">Age Calculator</a>

    </body>
</html>
