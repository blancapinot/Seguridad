<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    <title>Prevención de riesgos</title>
</head>
<body>
<div class="container">
    <%@include file="menu.jsp" %>

<%--    Formulario--%>
    <spring:url value="/capacitacion/guardar" var="guardarURL" htmlEscape="true"/>
    <form:form modelAttribute="capacitacionForm" method="post" action="${guardarURL}" cssClass="form">
    <form:hidden path="id"/>
        <div class="form-group">
            <label for="duracion">Ingrese duración de la Capacitación</label>
            <form:input path="duracion" cssClass="form-control" id="duracion"/>
        </div>
        <div class="form-group">
            <label for="cantidadAsistentes">Ingrese cantidad de Asistentes</label>
            <form:input path="cantidadAsistentes" cssClass="form-control" id = "cantidadAsistentes"/>
        </div>
        <div class="form-group">
            <label for="hora">Ingrese hora de la capacitacion</label>
            <form:input path="hora" cssClass="form-control" id="hora"/>
        </div>
        <div class="form-group">
            <label for="lugar">Ingrese lugar de la capacitacion</label>
            <form:input path="lugar" cssClass="form-control" id="lugar" placeholder="ejemplo: Enjoy Viña del Mar"/>
        </div>
        <div class="form-group">
            <label for="fecha">Ingrese fecha para la capacitacion</label>
            <form:input path="fecha" cssClass="form-control" id="fecha" placeholder="hh/mm/yy"/>
        </div>
        <div class="form-group">
            <label for="rut">Ingrese rut de cliente</label>
            <form:input path="rut" cssClass="form-control" id="rut" placeholder="18842139"/>
        </div>
        <button type="submit" class="btn btn-primary">Registrar</button>
    </form:form>

</div>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
        crossorigin="anonymous"></script>

</body>
</html>
