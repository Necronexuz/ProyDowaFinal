<%--
  Created by IntelliJ IDEA.
  User: nexuz
  Date: 24/05/15
  Time: 04:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Registration Confirmation Page</title>

  <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
  <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">
</head>
<body>
message : ${success}
<br/>
<br/>
Go back to <a href="<c:url value='/list' />">List of All Users</a>

</body>

</html>
