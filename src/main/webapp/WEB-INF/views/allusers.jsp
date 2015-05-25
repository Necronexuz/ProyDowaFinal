<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Project Enrollments</title>
    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
    <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">

</head>


<body>
<h2>List of Users</h2>
<table>
    <tr>
        <td>NAME</td><td>EMAIL</td><td>SSN</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td><a href="<c:url value='/delete-${user.ssn}-user' />">${user.ssn}</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="<c:url value='/new' />">Add New user</a>
</body>
</html>