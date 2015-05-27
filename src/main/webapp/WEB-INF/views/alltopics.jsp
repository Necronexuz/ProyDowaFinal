<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>


  <title>List Topics</title>
  <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
  <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">

</head>

<body>
<h2>List of Topics</h2>
<table>
  <tr>
    <td>ID</td><td>NAME</td>
  </tr>
  <c:forEach items="${topics}" var="topic">
    <tr>
      <td>${topics.id_topic}</td>
      <td>${topic.topic}</td>
      <td><a href="<c:url value='/delete-${topics.id_topic}-user' />">DELETE</a></td>
    </tr>
  </c:forEach>
</table>
<br/>
<a href="<c:url value='/newTopic' />">Add New Topic</a>
</body>
</html>