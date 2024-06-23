package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				TblUsuariocl2 usuario=new TblUsuariocl2();
				ClassUsuarioImp crud=new ClassUsuarioImp();
				List<TblUsuariocl2> listadousuario=crud.ListadoUsuario();
				//invocamos el listado de productos para la vista
				request.setAttribute("listadousuario", listadousuario);
				//redirecionamos
				request.getRequestDispatcher("/ListarUsuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		       String usuario=request.getParameter("usuario");
		       String contraseña=request.getParameter("contraseña");
				
		       //instanciar las respectivas entidades
		       TblUsuariocl2 usu=new TblUsuariocl2();
	           ClassUsuarioImp crud=new ClassUsuarioImp();
		       //asignamos valores
		       usu.setUsuariocl2(usuario);
		       usu.setPasswordcl2(contraseña);
		      //invocamos al metodo registrar
		       crud.RegistrarUsuario(usu);
				
		      List<TblUsuariocl2> listadousuario=crud.ListadoUsuario();
		      //invocamos el listado de productos para la vista
		      request.setAttribute("listadousuario", listadousuario);
		      //redirecionamos
		      request.getRequestDispatcher("/listadoProductos.jsp").forward(request, response);
	}

}
