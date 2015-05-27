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
  <meta username="viewport" content="width=device-width, initial-scale=1.0">

  <style>
    .error {
      color: #ff0000;
    }
  </style>

</head>

<body>

<div class="container">
  <div class="row">
    <div class="span8 offset2">
      <h1>Users</h1>
      <form:form method="POST" action="newTopic" commandName="topics" class="form-horizontal" modelAttribute="topics">
      <div class="control-group">
        <form:label cssClass="control-label" path="topic">Topic:</form:label>
        <div class="controls">
          <form:input path="topic" id="topic"/>
          <div>
            <form:errors path="topic" cssClass="error"/>
          </div>
        </div>
      </div>
      <div class="control-group">
        <div class="controls">
          <input type="submit" value="Add Topic" class="btn"/>
          </form:form>
        </div>
      </div>
    </div>
  </div>
</div>

</body>
</html>
