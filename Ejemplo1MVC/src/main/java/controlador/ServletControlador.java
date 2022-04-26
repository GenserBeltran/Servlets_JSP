package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1. Se procesan los parametros

        // 2. Se crea los JavaBeans
        Rectangulo rec = new Rectangulo(3, 6);

        //3. Agregamos el javaBeans a algun alcance request y Sesion
        request.setAttribute("mensaje", "saludos desde el Servlet");

        HttpSession sesion = request.getSession();
        sesion.setAttribute("rectangulo", rec);

        //4.redirecionar a la vista seleccionada
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
        rd.forward(request, response);

    }
}
