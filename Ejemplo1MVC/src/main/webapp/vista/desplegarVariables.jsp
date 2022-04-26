<!DOCTYPE html>
<html>
    <head>
        <title>Despliegue de Variables</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Despliegue de Variables</h1>
        Variable en alcance request:
        ${mensaje}
        <br/>
        <br/>
        Variable en alcance session:
        <br/>
        Rectangulo
        <br/>
        base: ${rectangulo.base}
        <br/>
        altura: ${rectangulo.altura}
        <br/>
        area: ${rectangulo.area}
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al inicio </a>
    </body>
</html>