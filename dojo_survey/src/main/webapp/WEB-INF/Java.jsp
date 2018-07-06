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

</head>
<body>
  <div id="box">
    <h2>Submitted Data</h2>
    <h2>Java Lovers</h2>
    <table>
      <tbody>
        <tr>
          <td>Name: </td>
          <td>${name}</td>
        </tr>
        <tr>
          <td>Dojo Location:</td>
          <td>${location}</td>
        </tr>
        <tr>
          <td> Favorite Language: </td>
          <td><h1>BEST LANGUAGE</h1></td>
        </tr>
      </tbody>
    </table>
    <label for="com">Comment:</label>
    <p id="com">${comment}</p>
      <a href="/">Go Back</a>
  </div>
</body>
</html>