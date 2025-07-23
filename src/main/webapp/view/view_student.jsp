<%--
  Created by IntelliJ IDEA.
  User: vipgl
  Date: 7/14/2025
  Time: 1:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Student</h1>
    <c:forEach var="tempStudent" items="${student_list}">
        ${tempStudent} <br>
    </c:forEach>
</body>
</html>
