<%--
  Created by IntelliJ IDEA.
  User: blancapinot
  Date: 10-10-22
  Time: 14:52
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
<spring:url value="/contacto/guardar" var="agregarURL" htmlEscape="true"/>
<form:form modelAttribute="contactoForm" method="post" action="${agregarURL}" cssClass="form">
    <form:hidden path="id"/>
<div class="container">
    <form>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="inputNombre">Nombre</label>
                <form:input type="text" cssClass="form-control" id="inputNombre"/>
            </div>
            <div class="form-group col-md-6">
                <label for="apellido">apellido</label>
                <form:input type="text" cssClass="form-control" id="apellido"/>
            </div>
        </div>
        <div class="form-group">
            <label for="direccion">direccion</label>
            <form:input type="text" cssClass="form-control" id="direccion" placeholder="1234 Main St"/>
        </div>
        <div class="form-group">
            <label for="inputPregunta">pregunta</label>
            <form:input type="text" cssClass="form-control" id="inputPregunta" placeholder="Cuestion"/>
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="inputCiudad">ciudad</label>
                <form:input type="text" cssClass="form-control" id="inputCiudad"/>
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Sign in</button>
    </form>

</div>

</form:form>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

</body>
</html>
