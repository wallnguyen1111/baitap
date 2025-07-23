<%@ page import="org.example.demo33.buoi3.FunUntil" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<p>Upper case of sd20206 : <%= FunUntil.makeItupper("anhba") %>
</p>

<form action="studentServlet">
    First name : <input type="text" name="firstname">
    <br>
    Last name : <input type="text" name="lastname">
    <br>
    <select name="quoctich">
        <option value="lao">lao</option>
        <option value="Campuchia">Campuchia</option>
        <option value="VietNam">VietNam</option>
    </select>
    <input type="checkbox" name="favoriteLanguage" value="Java"> Java
    <input type="checkbox" name="favoriteLanguage" value="C#"> C#
    <input type="checkbox" name="favoriteLanguage" value="Javascript"> Javascript
    <input type="checkbox" name="favoriteLanguage" value="PHP"> PHP
    <br>
    <input type="submit" value="submit">
</form>
</body>
</html>