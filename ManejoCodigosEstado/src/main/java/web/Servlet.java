
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        //Simulando los valores correctos
        String usuariook = "Juan";
        String passwordok = "123";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        if(usuariook.equals(usuario) && passwordok.equals(password)){
            out.print("<h1>");
            out.print("Datos Correctos");
            out.print("<br> Usuarios: " + usuario);
            out.print("<br> Password: " + password);
            out.print("</h1>");
        }
        else{
            response.sendError(response.SC_UNAUTHORIZED, "LAS CREDENCIALES SON INCORRECTAS");
        }
        out.close();
    }
    
}
