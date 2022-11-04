<%--
  Created by IntelliJ IDEA.
  User: blancapinot
  Date: 03-11-22
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Prevención de riesgos</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<%@include file="menu.jsp" %>
<div class="container">
  <form method="post" action="crear-capacitacion" modelAttribute="capacitacion">
    <div class="form-row">
      <div class="form-group col-md-6">
        <label for="inputId">Introduzca ID de Capacitación</label>
        <input type="text" name="Id" class="form-control" id="inputId">


      </div>
    </div>
    <form action="editar-capacitacion" method="post" modelAttribute="capacitacion">
    <button type="submit" name= "Id" value="${capacitacion.getId()}" class="btn btn-primary">Sign in</button>
    </form>
  </form>

</div>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

</body>
</html>
