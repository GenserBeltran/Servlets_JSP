
package web;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Leer los parametros del formulario HTML
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        System.out.println("Usuario = " + usuario);
        System.out.println("Password = " + password);
        
        //Respondiedo al cliente que realizo la llamada
        
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuaio es: " + usuario);
        out.print("<br>");
        out.print("El password es:  " + password);
        out.print("</body");
        out.print("</html>");
        out.close();
    }
    
}
