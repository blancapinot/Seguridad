<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <th>CANT. ASISTENTES</th>
            <th>RUT</th>
            <th>LUGAR</th>
            <th>HORA</th>
            <th>DIA</th>
            <th>DURACION</th>
            <th>OPCION</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${capacitaciones}" var="capacitaciones">
            <tr>
                <td>
                    <c:out value="${capacitaciones.getId()}"/>
                </td>
                <td>
                    <c:out value="${capacitaciones.getCantidadDeAsistentes()}"/>
                </td>
                <td>
                    <c:out value="${capacitaciones.getRutCliente()}"/>
                </td>
                <td>
                    <c:out value="${capacitaciones.getLugar()}"/>
                </td>
                <td>
                    <c:out value="${capacitaciones.getHora()}"/>
                </td>
                <td>
                    <c:out value="${capacitaciones.getDia()}"/>
                </td>
                <td>
                    <c:out value="${capacitaciones.getDuracion()}"/>
                </td>
                <td>
                   <form action="EliminarCapacitacion" method="post" modelAttribute="capacitacion">
                      <button title="Eliminar" type="submit" name="id" class="btn btn-primary" value="${capacitaciones.getId()}">Eliminar</button>
                   </form>
                </td>
                <%--<form action="EditarCapacitacion" method="post">
                    <button title="Eliminar" type="submit" name="id" class="btn btn-primary" value="${capacitaciones}">Editar</button>
                </form>--%>
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
