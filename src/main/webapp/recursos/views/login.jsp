<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Prevención de riesgos</title>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <%@include file="menu.jsp" %>
    <section>

        <h3>Ingrese con sus Datos</h3>

        <div class="container justify-content-center">
            <%
                String error = (String) request.getAttribute("error");
                if (error != null && error.equals("true")) {
                    out.println("<h3 class='alert alert-danger text-center'>Error de autentificacion</h3>");
                }
            %>
            <form action="${pageContext.request.contextPath}/login" method="post">
                <div class="form-group text-white">
                    <label for="username">Nombre usuario</label>
                    <input type="text" class="form-control" name="username" id="username">

                </div>
                <div class="form-group text-white">
                    <label for="password">Contraseña</label>
                    <input type="password" name="password" class="form-control" id="password">
                </div>
                <button type="submit" class="btn btn-primary">Iniciar Sesion</button>
            </form>
        </div>
    </section>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
            crossorigin="anonymous"></script>
</div>
</body>
</html>
