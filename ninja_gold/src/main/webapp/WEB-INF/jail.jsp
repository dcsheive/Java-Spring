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
	<h1>YOU LOST!</h1>
	<h2>You ran out of gold.</h2>
	<a href="/reset">Play again?</a>
  </div>
</body>
</html>