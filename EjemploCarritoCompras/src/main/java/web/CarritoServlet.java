package web;

import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        //Creanis i recuoperamos el objeto HTTP SESION
        HttpSession sesion = request.getSession();

        //Se recupera la lista de articulos agregados preciamente si existen
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //Verificando  si la lista de articulos existe
        if (articulos == null) {
            //Inicializando la lista de articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //Porocesando la variable articulo
        String articuloNuevo = request.getParameter("articulo");

        //Revisamos y agregamos el articulos nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        try ( //Se imprime la lista de articulos
                 PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de articulos</h1>");
            out.print("<br>");
            //Iteramos todos los articulos
            for (String articulo : articulos) {
                out.print("<h1>" + articulo + "</h1>");
            }
            //se agrega un link para ir al inicio
            out.print("<br>");
            out.print("<a href='/EjemploCarritoCompras'> Regresar al incio </a>");
        }
    }
}
