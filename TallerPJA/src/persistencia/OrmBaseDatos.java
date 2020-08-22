package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import entidades.Empleado;

public class OrmBaseDatos implements RepositorioEmpleados {

	private EntityManager gestorBd;
	
	
	@Override
	public List<Empleado> consultarEmpleados() {
		
		return null;
	}


	@Override
	public boolean adicionarEmpleado(Empleado Empleado) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Empleado buscarEmpleado(int identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean borrarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return false;
	}

}
