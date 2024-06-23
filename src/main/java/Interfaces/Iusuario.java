package Interfaces;

import java.util.List;

import model.TblUsuariocl2;;

public interface Iusuario {
	public void RegistrarUsuario(TblUsuariocl2 Usuario);	
	public List<TblUsuariocl2>ListadoUsuario();
	public TblUsuariocl2 ValidarUsuario(String usuario, String contraseña);

}
