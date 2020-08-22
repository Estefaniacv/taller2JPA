package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidades.Empleado;

public class OrmBaseDatos implements RepositorioEmpleados {


	private EntityManagerFactory fabrica;
	
	
	public OrmBaseDatos() {
		fabrica = Persistence.createEntityManagerFactory("datosOrm");
	}

	
	@Override
	public List<Empleado> consultarEmpleados() {
		EntityManager gestorBd = fabrica.createEntityManager();
		Query query = gestorBd.createQuery("select e from Empleado  e");
		List<Empleado> empleados = query.getResultList();
		gestorBd.close();
		return empleados;
		
	}
   

	@Override
	public boolean adicionarEmpleado(Empleado empleado) {
		try	{
			EntityManager gestorBd = fabrica.createEntityManager();
			gestorBd.getTransaction().begin();	
			gestorBd.persist(empleado);
			gestorBd.getTransaction().commit();
			gestorBd.close();
		}
		catch (Exception errorCrear)	{
			return false;
		}
		return true;
	}

	@Override
	public Empleado buscarEmpleado(int identificador) {
		EntityManager gestorBd = fabrica.createEntityManager();
		Empleado empleado = gestorBd.find(Empleado.class, identificador);
		gestorBd.close();
		return empleado;
	}

	@Override
	public boolean borrarEmpleado(Empleado empleado) {
		try	{
			EntityManager gestorBd = fabrica.createEntityManager();
			gestorBd.getTransaction().begin();
			
			// Primero se busca el empleado para "enlazarlo" con la base de datos
			empleado = gestorBd.find(Empleado.class, empleado.getIdentificador());
			
			gestorBd.remove(empleado);
			gestorBd.getTransaction().commit();
			gestorBd.close();
		}
		catch (Exception errorBorrar)	{
			return false;
		}
		return true;
	}
}
