<%--
  Created by IntelliJ IDEA.
  User: vipgl
  Date: 7/21/2025
  Time: 12:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Them thong tin HOC SINH
    <form action="/students/them" method="post">
        id: <input type="text" name="id"> <br>
        name:<input type="text" name="name"> <br>
        email:<input type="text" name="email"> <br>
        phone:<input type="text" name="phone"> <br>
        <button>Submit</button>
    </form>
</body>
</html>
