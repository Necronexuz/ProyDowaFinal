<%--
  Created by IntelliJ IDEA.
  User: nexuz
  Date: 27/05/15
  Time: 01:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Home Page</title>
</head>

<body>
<h2>Welcome To Story Time</h2>
<table>
  <tr>
    <td>Users</td><td>Stories</td>
  </tr>
    <tr>
      <td><a href="<c:url value='/list' />">View User</a></td>
      <td><a href="<c:url value='/list-topics' />">View Topics</a></td>
      <td><a href="<c:url value='/stories' />">View</a></td>
      <td><a href="<c:url value='/stories' />">View</a></td>
    </tr>
</table>
<br/>
</body>
