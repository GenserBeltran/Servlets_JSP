
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Declarando la variable contador
        int contador = 0 ;
        
        //Revisando si exite la cokiie en el navegador
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for (Cookie c : cookies) {
                if(c.getName().equals("contadorVisitas")){
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        //Incrementando el contador en 1
        
        contador++;
        
        //Agregando la respuesta la navegador
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        
        //La Cookie se almacenara en el cliente por una hora
        c.setMaxAge(3600);
        response.addCookie(c);
        
        //Mnadamos mensaje al navegador
        response.setContentType("text/html/charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente: " + contador);
    }
    
}
