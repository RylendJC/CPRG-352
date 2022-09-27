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
        <h2>Edit Note</h2>
        
        <form action="note" method="post">
            <label>
                Title:
                <input type="text" name="title">
            </label>
            <br>
            <label for="contents">Contents: </label>
            <textarea id="contents" name="content"></textarea>
            <br>
            <button type="submit">Submit</button>
        </form>
    </body>
</html>
