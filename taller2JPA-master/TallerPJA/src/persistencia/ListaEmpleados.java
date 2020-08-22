package persistencia;

import java.util.ArrayList;
import java.util.List;

import entidades.Empleado;

public class ListaEmpleados implements RepositorioEmpleados {
	private List<Empleado> empleados;

	public ListaEmpleados() {
		empleados = new ArrayList<Empleado>();
	}
	
	
	@Override
	public List<Empleado> consultarEmpleados() {
		return empleados;
	}

	@Override
	public boolean adicionarEmpleado(Empleado empleado) {
		return empleados.add(empleado);
	}

	@Override
	public Empleado buscarEmpleado(int identificador) {
		for (Empleado empleado : empleados) {
			if (empleado.getIdentificador()==(identificador)) {
				return empleado;
			}
		}
		return null;
	}
	@Override
	public boolean borrarEmpleado(Empleado empleado) {
		return empleados.remove(empleado);
	}

}
