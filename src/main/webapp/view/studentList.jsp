
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
    <table>
        <tr>
             <th>#</th>
            <th>id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Service</th>
        </tr>
        <c:forEach var="tempStudent" items="${students}" varStatus="i">
        <tr>
            <td>${i.index + 1 }</td>
            <td>${tempStudent.id}</td>
            <td>${tempStudent.name}</td>
            <td>${tempStudent.email}</td>
            <td>${tempStudent.phone}</td>
            <td><a href="/students/new">Them</a>
                <a href="/students/xoa?id=${tempStudent.id}">Xoa</a>
                <a href="/students/chi-tiet?id=${tempStudent.id}">update</a>
            </td>
        </tr>
        </c:forEach>


    </table>
</body>
</html>
