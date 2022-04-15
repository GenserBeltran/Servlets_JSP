<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Con Scriplets</title>
    </head>
    <body>
        <h1>JSP Con Scriplets</h1>
        <br>
        <br>
        <%-- Scriplet para enviar informacion al navegador --%>
        <%
            out.print("Saludos desde un Scriplet");
        %>
        <%-- Scriplet para maniouklar los objetos impicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("Nombre de la aplicacion: " + nombreAplicacion);
        %>
        <br>
        <%-- Scriple con codigo condicionado --%>
        <%
            if (session != null && session.isNew()) {
        %>
        La sesion SI es nueva
        <%
        } else if (session != null) {
        %>
        la sesion NO es nueva
        <%
            }
        %>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
