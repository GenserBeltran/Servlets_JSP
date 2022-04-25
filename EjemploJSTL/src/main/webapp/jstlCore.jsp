<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/ html; charset=UTF-8">
        <title>Jstl Core</title>
    </head>
    <body>
        <h1>Jstl Core (JSP Standar Tag Library)</h1>
        <!-- Mnipulacion de variables -->
        <!-- Definicion de variable -->
        <c:set var="nombre" value="Hernesto" />
        <!-- Desplegando Variable -->
        Variables nombre: <c:out value="${nombre}" />
        <br/>
        <br/>
        Variable con codigo HTML
        <br/>
        <c:out value="<h1>Hola</h1>" escapeXml="false"/>
        <br/>
        <br/>
        <!-- Uso de If usando una bandera-->
        <c:set var="bandera" value="true"/>
        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>
        <br/>
        <!-- Codigo condicionado, uso de Switch -->
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    </br>
                    Opcion 1 seleccionada
                </c:when>
                <c:when test="${param.opcion == 2}">
                    </br>
                    Opcion 2 seleccionada
                </c:when>
                <c:when test="${param.opcion == 3}">
                    </br>
                    Opcion 3 seleccionada
                </c:when>
                <c:otherwise >
                    </br>
                    Opcion proporcionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <!-- Iteracion de un areglo  -->
        <%
            String nombres[] = {"claudia", "Pedro", "Juan"};
            request.setAttribute("nombres", nombres);
        %>
        <br/>
        <br/>
        Lista de Nombres: 
        <br/>
        <ul>
            <c:forEach var="persona" items="${nombres}">
                <li>${persona}</li>
                </c:forEach>
        </ul>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
