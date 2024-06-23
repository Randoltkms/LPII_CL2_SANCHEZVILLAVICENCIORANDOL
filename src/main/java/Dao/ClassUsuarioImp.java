package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iusuario;
import model.TblUsuariocl2;

public class ClassUsuarioImp implements Iusuario {

	@Override
	public void RegistrarUsuario(TblUsuariocl2 Usuario) {
		// TODO Auto-generated method stub
		
		//establecer la cadena de conexion con la unidad de persistencia
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoMavenExamen2JPA");
				//gestionar las entidades
				EntityManager em=fabr.createEntityManager();
				//iniciamos la transaccion
				em.getTransaction().begin();
				//registramos
				em.persist(Usuario);
				//emitimos mensaje por consola
				System.out.print("Usuario registrado en la BD");
				//configuramos
				em.getTransaction().commit();
				//cerramos
				em.close();
		
	}


	

	@Override
	public List<TblUsuariocl2> ListadoUsuario() {
		// TODO Auto-generated method stub
		//establecemos conexion con la unidad de persistencia
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoMavenExamen2JPA");
				//gestionar las entidades
				EntityManager em=fabr.createEntityManager();
				//iniciamos la transaccion
				em.getTransaction().begin();
				//recuperamos el listado de cliente de la BD
				//aplicamos consultas JPQL, el metodo createquery(), sirve para hacer consultas dinamicas
				List<TblUsuariocl2> listado=em.createQuery("select c from TblUsuariocl2 c",TblUsuariocl2.class).getResultList();
				//confirmamos
				em.getTransaction().commit();
				//cerramos
				em.close();
				//recuperamos el cliente buscado de la BD
				return listado;
	}
	
	public TblUsuariocl2 ValidarUsuario(String usuario, String contraseña){
		
		 EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoMavenExamen2JPA");  
	        EntityManager em=fabr.createEntityManager();  
	        TblUsuariocl2 usu = null;
	        try {
	            em.getTransaction().begin();
	            usu = em.createQuery("SELECT u FROM TblUsuariocl2 u WHERE u.usuariocl2 = :usuario AND u.passwordcl2 = :contraseña", TblUsuariocl2.class)
	                    .setParameter("usuario", usuario)
	                    .setParameter("contraseña", contraseña)
	                    .getSingleResult();
	            em.getTransaction().commit();
	        } catch (Exception e) {
	            em.getTransaction().rollback();
	        } finally {
	            em.close();
	        }
	        return usu;
		
	}

}
