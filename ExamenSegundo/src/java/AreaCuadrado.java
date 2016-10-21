

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class AreaCuadrado extends HttpServlet {

  @Override
  public void init(ServletConfig conf)
    throws ServletException {
    super.init(conf);
  }

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

    
    
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();

    
	
	String LadoCuadrado = "";
        int Area;

         LadoCuadrado = req.getParameter("LadoC");
         
         
         
         

        //Decimos que nos hemos conectado 
    	out.println("<html>");
    	out.println("<body>");
    	out.println("<h2> El area de tu cuadrado es: "+LadoCuadrado+ "</h2>");
    	out.println("</body>");
	out.println("</html>");
	
	}

  

  @Override
  public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
    doGet(req, res);
  }
}