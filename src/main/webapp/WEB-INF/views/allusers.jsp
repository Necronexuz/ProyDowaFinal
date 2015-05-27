<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>


    <title>List Users</title>
    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">

</head>

<body>
<h2>List of Users</h2>
<table>
    <tr>
        <td>ID</td><td>NAME</td><td>EMAIL</td><td>ACTION</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id_user}</td>
            <td>${user.username}</td>
            <td>${user.email}</td>
            <td><a href="<c:url value='/delete-${user.id_user}-user' />">DELETE</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="<c:url value='/new' />">Add New user</a>
</body>
</html>