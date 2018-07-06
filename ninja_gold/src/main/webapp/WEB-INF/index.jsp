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
<body>
  <div id="wrapper">
    <h3>Your Gold:</h3>
    <p id="gold">${gold}</p>
    <a href="/reset">Reset</a>
    <div id="boxes">
      <div class="box">
        <h1>Farm</h1>
        <p>(earns 10-20 golds)</p>
        <form action='/process' method='post'>
          <input type="hidden" name="action" value="farm">
          <input type='submit' name="farm" value="Find Gold!" class="btn-md">
        </form>
      </div>
      <div class="box">
        <h1>Cave</h1>
        <p>(earns 5-10 golds)</p>
        <form action='/process' method='post'>
          <input type="hidden" name="action" value="cave">
          <input type='submit' name="cave" value="Find Gold!" class="btn-md">
        </form>
      </div>
      <div class="box">
        <h1>House</h1>
        <p>(earns 2-5 golds)</p>
        <form action='/process' method='post'>
          <input type="hidden" name="action" value="house">
          <input type='submit' name="house" value="Find Gold!" class="btn-md">
        </form>
      </div>
      <div class="box">
        <h1>Casino</h1>
        <p>(earns/takes 0-50 golds)</p>
        <form action='/process' method='post'>
          <input type="hidden" name="action" value="casino">
          <input type='submit' name="casino" value="Find Gold!" class="btn-md">
        </form>
      </div>
      <div class="box">
        <h1>Spa</h1>
        <p>(takes 5-20 golds)</p>
        <form action='/process' method='post'>
          <input type="hidden" name="action" value="spa">
          <input type='submit' name="spa" value="Find Gold!" class="btn-md">
        </form>
      </div>
    </div>
    <label for="bottom">Activities:</label>
    <div id="bottom">
    <c:forEach items="${actions}" var="current">
        <p class="<c:out value="${current.get(1)}"/>">${current.get(0)}</p>
    </c:forEach>
    </div>
  </div>
</body>
</html>