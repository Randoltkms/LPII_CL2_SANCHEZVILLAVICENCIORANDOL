package TestEntidades;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {
	
	public static void main(String[] args){
		//hacemos la respectiva instancia
		TblProductocl2 producto = new TblProductocl2();
		ClassProductoImp crud = new ClassProductoImp();
		
		//asignamos valores						
		/*producto.setNombrecl2("Reloj");
		producto.setPrecioventacl2(2700);
		producto.setPreciocompcl2(2600);
		producto.setEstadocl2("Operativo");
		producto.setDescripcl2("Un buen producto a la muñeca");
						
		crud.RegistrarProducto(producto);*/
			

						
		List<TblProductocl2> listadoprod=crud.ListadoProducto();		
		for(TblProductocl2 listar:listadoprod){							
		System.out.print(
			"-----------------------------------------------" + "\n\n" +
			"-------------------- U N O --------------------" + "\n\n" +
			"Codigo" + "\t\t: "+listar.getIdproductocl2()+ "\n" +
			"Nombre" + "\t\t: "+listar.getNombrecl2()+ "\n" +
			"P. de venta" + "\t: "+listar.getPrecioventacl2()+ "\n" +
			"P. de compra" + "\t: "+listar.getPreciocompcl2()+ "\n" +
			"Estado" + "\t\t: "+listar.getEstadocl2()+ "\n" +
			"Descripcion" + "\t: "+listar.getDescripcl2()+ "\n\n" +
			"-------------------- F I N --------------------" + "\n\n");
		}
						
				
						
		
				
	}//fin del metodo main

}//fin de la clase