<%-- Se agrega una declaracion --%>
<%! 
    //Declarando la variable con su metodo GET
    private String usuario = "Alberto";
public String getUsuario(){
return this.usuario;
}

//Se declara un contador de visitas
private int contadorVisitas = 1;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de declaraciones con JSP</title>
    </head>
    <body>
        <h1>Uso de declaraciones con JSP</h1>
        Valor de usuario por medio del atributo: <%= this.usuario %>
        <br>
        Valor de usuario por medio del metodo: <%= this.getUsuario() %>
        <br>
        Contador de visitas: <%= this.contadorVisitas++%>
    </body>
</html>
