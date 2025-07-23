<%--
  Created by IntelliJ IDEA.
  User: vipgl
  Date: 7/20/2025
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Sua thong tin HOC SINH
<form action="/students/update" method="post">
    id: <input type="text" name="id" value="${students.id}"> <br>
    name:<input type="text" name="name" value="${students.name}"> <br>
    email:<input type="text" name="email" value=" ${students.email}"> <br>
    phone:<input type="text" name="phone" value=" ${students.phone}"> <br>
    <button>Submit</button>
</form>
</body>
</html>
