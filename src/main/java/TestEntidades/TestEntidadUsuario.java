package TestEntidades;

import java.util.List;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl2;

public class TestEntidadUsuario {

	public static void main(String[] args){
		
		//hacemos la respectiva instancia
		
		TblUsuariocl2 usuario = new TblUsuariocl2();
		ClassUsuarioImp crud = new ClassUsuarioImp();	
		
		
		/*usuario.setUsuariocl2("RandolSanchez");
		usuario.setPasswordcl2("Pepe");				
		crud.RegistrarUsuario(usuario);*/
			
	
		
				
			List<TblUsuariocl2> listadousu=crud.ListadoUsuario();
			for(TblUsuariocl2 listar:listadousu){			
			System.out.print(
				"-----------------------------------------------" + "\n\n" +
				"-------------------- U N O --------------------" + "\n\n" +
				"Codigo" + "\t\t: "+listar.getIdusuariocl2()+ "\n" +
				"Nombre" + "\t\t: "+listar.getUsuariocl2()+ "\n" +
				"Descripcion" + "\t: "+listar.getPasswordcl2()+ "\n\n" +
				"-------------------- F I N --------------------" + "\n\n");
			}
						
			
						
		
				
	}//fin del metodo main

}//fin de la clase
