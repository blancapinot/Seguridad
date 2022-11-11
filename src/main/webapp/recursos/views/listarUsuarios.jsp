<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    <title>Lista base de datos</title>
</head>
<body>
<div class="container">
    <%@include file="menu.jsp" %>
    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Rut</th>
            <th>Fecha de Nacimiento</th>
            <th>Tipo</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${usuarioForm}" var="usuarios">
            <tr>
                <td>
                    <c:out value="${usuarioForm.getIdUsuario()}"/>
                </td>
                <td>
                    <c:out value="${usuarioForm.getNombre()}"/>
                </td>
                <td>
                    <c:out value="${usuarioForm.getApellido()}"/>
                </td>
                <td>
                    <c:out value="${usuarioForm.getRut()}"/>
                </td>
                <td>
                    <c:out value="${usuarioForm.getTipo}"/>
                </td>
                <td>
                    <c:out value="${usuarioForm.getFechaNacimiento}"/>
                </td>

                <td>
                    <spring:url value="/usuario/eliminar/${usuarios.idUsuario}" var="eliminarURL"/>
                    <a class="btn btn-primary" href="${eliminarURL}" role="button">Eliminar</a>
                </td>
                <td>
                    <spring:url value="/usuario/actualizar/${usuarios.idUsuario}" var="actualizarURL"/>
                    <a class="btn btn-primary" href="${actualizarURL}" role="button">Editar</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
        crossorigin="anonymous"></script>
</body>
</html>