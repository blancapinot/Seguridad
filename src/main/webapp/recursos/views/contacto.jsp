
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Contactanos</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <%@include file="./menu.jsp" %>
    <spring:url value="/contacto/guardar" var="enviarURL" htmlEscape="true"/>
    <form:form modelAttribute="contactoForm" method="post" action="${enviarURL}" cssClass="form">
        <div class="form-group row">
            <label class="col-sm-3 col-form-label">Nombre</label>
            <div class="col-sm-9">
                <form:input path="nombre" class="form-control" id="nombre" placeholder="Nombre"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-3 col-form-label">Apellido</label>
            <div class="col-sm-9">
                <form:input path="apellido" type="text" class="form-control" placeholder="Apellido" id="apellido"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-3 col-form-label">Direccion</label>
            <div class="col-sm-9">
                <form:input path="direccion" type="text" class="form-control" placeholder="Direccion" id="direccion"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-3 col-form-label">Consulta</label>
            <div class="col-sm-9">
                <form:input path="consulta" id="consulta" type="text" class="form-control" placeholder="Consulta"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-3 col-form-label">Ciudad</label>
            <div class="col-sm-9">
                <form:input path="ciudad" id="ciudad" type="text" class="form-control" placeholder="Ciudad"/>
            </div>
        </div>

        <button type="submit" class="btn btn-primary">Enviar</button>
    </form:form>
</div>
</body>
</html>
