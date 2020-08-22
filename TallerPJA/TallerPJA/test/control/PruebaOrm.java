package control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Comision;
import entidades.Empleado;


/**
 * Prueba rapida para verificar la configuracion del Orm
 * @author 
 * @version 1.0
 */
public class PruebaOrm {
 
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("datosOrm");
		EntityManager gestorBD = fabrica.createEntityManager();
		
		gestorBD.getTransaction().begin();
		
		Empleado empleado = new Comision(1, "cristian", 100000, 60000);
		gestorBD.persist(empleado);
		gestorBD.getTransaction().commit();
		Empleado empleadoBuscado = gestorBD.find(Empleado.class,1);
		System.out.println(empleadoBuscado.getNombre());
		gestorBD.close();
	}

}
