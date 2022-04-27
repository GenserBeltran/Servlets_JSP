<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance de Variables</title>
    </head>
    <body>
        <h1>Alcance de Variables</h1>
        <br/><br/>
        Variables en alcance de request:
        <br/>
        Base: ${rectanguloRequest.base}
        <br/>
        Altura: ${rectanguloRequest.altura}
        <br/>
        Area: ${rectanguloRequest.area}
        <br/><br/>
        Variables en alcance de Sesion
        <br/><br/>
        Base: ${rectanguloSesion.base}
        <br/>
        Altura: ${rectanguloSesion.altura}
        <br/>
        Area: ${rectanguloSesion.area}
        <br/><br/>
        Variables en alcance de aplicacion
        <br/><br/>
        Base: ${rectanguloAplicacion.base}
        <br/>
        Altura: ${rectanguloAplicacion.altura}
        <br/>
        Area: ${rectanguloAplicacion.area}
        <br/><br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al incio</a>
        
    </body>
</html>
