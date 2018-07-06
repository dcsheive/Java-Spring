<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">

<style><%@include file="/resources/css/style.css"%></style>
<script><%@include file="/resources/js/app.js"%></script>
</head>
</head>
<body>
  <div id="box">
    <form action="/result" method="POST">
      <div class="form-group">
        <label for="email">Name:</label>
        <input type="text" class="form-control" name="name">
      </div>
      <div class="form-group">
        <label for="sel1">Dojo Location:</label>
        <select class="form-control" name="sel1">
          <option>Washington</option>
          <option>Seattle</option>
          <option>Kansas City</option>
          <option>San Francisco</option>
        </select>
      </div>
      <div class="form-group">
        <label for="sel2">Favorite Language:</label>
        <select class="form-control" name="sel2">
          <option>JavaScript</option>
          <option>Python</option>
          <option>Ruby</option>
          <option>MEAN</option>
          <option>Java</option>
        </select>
      </div>
      <label for="comment">Comment:</label>
      <textarea class="form-control" rows="5" name="comment"></textarea>
      <button type="submit" class="btn btn-default">Submit</button>
    </form>
  </div>
</body>
</html>