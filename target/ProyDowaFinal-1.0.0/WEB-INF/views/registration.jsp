<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: nexuz
  Date: 24/05/15
  Time: 04:56 PM
  To change this template use File | Settings | File Templates.
--%>
<html>

<head>
  <meta charset="utf-8">
  <title>User Registration Form</title>
  <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">


  <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
  <link href="http://twitter.github.io/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">

</head>

<body>

<div class="container">
  <div class="row">
    <div class="span8 offset2">
      <h1>Users</h1>
      <form:form method="POST" action="new" commandName="user" class="form-horizontal" modelAttribute="user">
        <div class="control-group">
          <form:label cssClass="control-label" path="name">Name:</form:label>
          <div class="controls">
            <form:input path="name" id="name"/>
            <div>
              <form:errors path="name" cssClass="error"/>
            </div>
          </div>
        </div>
        <div class="control-group">
          <form:label cssClass="control-label" path="password" >Password:</form:label>
          <div class="controls">
            <form:password path="password" id="password"/>
          </div>
        </div>
        <div class="control-group">
          <form:label cssClass="control-label" path="email">Email:</form:label>
          <div class="controls">
            <form:input path="email" id="email"/>
            <div><form:errors path="email" cssClass="error"/></div>
          </div>
        </div>
        <div class="control-group">
          <form:label cssClass="control-label" path="ssn">SSN:</form:label>
          <div class="controls">
            <form:input path="ssn" id="ssn"/>
          </div>
        </div>
      <div class="control-group">
        <div class="controls">
          <input type="submit" value="Add User" class="btn"/>
          </form:form>
        </div>
      </div>
    </div>
  </div>
</div>

</body>
</html>
