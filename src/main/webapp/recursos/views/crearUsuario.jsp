<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    <title>Registro Usuario</title>
</head>
<body>
<div class="container">
    <%@include file="menu.jsp" %>

    <%--    Formulario--%>
    <spring:url value="/usuario/guardar" var="guardarURL" htmlEscape="true"/>
    <form:form modelAttribute="usuarioForm" method="post" action="${guardarURL}" cssClass="form">
        <form:hidden path="idUsuario"/>
        <div class="form-group">
            <label for="nombre">Ingrese su Nombre</label>
            <form:input path="nombre" cssClass="form-control" id="nombre"/>
        </div>
        <div class="form-group">
            <label for="apellido">Ingrese su apellido</label>
            <form:input path="apellido" cssClass="form-control" id = "apellido"/>
        </div>
        <div class="form-group">
            <label for="rut">Digite su rut sin puntos ni digito verificador</label>
            <form:input path="rut" cssClass="form-control" id="rut"/>
        </div>
        <div class="form-group">
            <label for="fechaNacimiento">Ingrese su fecha de nacimiento en formato "hh//mm/yy"</label>
            <form:input path="fechaNacimiento" cssClass="form-control" id="fechaNacimiento" placeholder="01/03/2001"/>
        </div>
        <div class="form-group">
            <label for="tipo">Especifique su tipo de usuario</label>
            <form:input path="tipo" cssClass="form-control" id="tipo" placeholder="Cliente, Administrativo o Profesional"/>
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
