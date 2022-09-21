<%-- 
    Document   : editnote
    Created on : Sep 19, 2022, 1:16:00 PM
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
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        
        <form>
            <label>
                Title:
                <input type="text">
            </label>
            <br>
            <label for="contents">Contents: </label>
            <textarea id="contents"></textarea>
            <br>
            <input type="submit">
        </form>
    </body>
</html>
