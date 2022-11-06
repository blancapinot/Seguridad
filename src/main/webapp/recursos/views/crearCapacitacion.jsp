<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    <title>Prevención de riesgos</title>
</head>
<body>
<div class="container">

    <%@include file="menu.jsp" %>

    <spring:url value="/capacitacion/guardar" var="agregarURL" htmlEscape="true"/>
    <form:form modelAttribute="capacitacionForm" method="post" action="${agregarURL}" cssClass="form">
        <form:hidden path="id"/>
        <div class="form-group">
            <label for="formGroupExampleInput">Ingrese duración de la Capacitación</label>
            <form:input type="text" cssClass="form-control" id="formGroupExampleInput"
                        placeholder="horas pedagógicas y prácticas" path="duracion"/>
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput2">Ingrese cantidad de Asistentes</label>
            <form:input type="text" cssClass="form-control" id="formGroupExampleInput2"
                        placeholder="número de asistentes" path="cantidadDeAsistentes"/>
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput2">Ingrese hora de la capacitacion</label>
            <form:input type="text" cssClass="form-control" id="formGroupExampleInput3" name="hora"
                        placeholder="ejemplo: 23:00 horas" path="hora"/>
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput2">Ingrese lugar de la capacitacion</label>
            <form:input path="lugar" type="text" cssClass="form-control" id="formGroupExampleInput4"
                        placeholder="ejemplo: Enjoy Viña del Mar"/>
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput2">Ingrese fecha para la capacitacion</label>
            <form:input path="dia" type="text" cssClass="form-control" id="formGroupExampleInput5" name="dia"
                        placeholder="hh/mm/yy"/>
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput2">Ingrese rut de cliente</label>
            <form:input path="rutCliente" type="text" cssClass="form-control" id="formGroupExampleInput6"
                        name="rutCliente" placeholder="18842139"/>
        </div>

        <button type="submit" class="btn btn-primary">Registrar ss</button>
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