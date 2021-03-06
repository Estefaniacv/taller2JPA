package persistencia;

import java.util.List;

import entidades.Empleado;

/**
 * Servicios relacionados con la gesti�n de los datos de los empleados
 * en un repositorio (consultar, adicionar, buscar, borrar)
 * @version 1.0
 */
public interface RepositorioEmpleados {
	/**
	 * Consulta toda la lista de los empleados que hay registrados
	 * @return	la lista (List) con los empleados.
	 * 			En caso de no existir empleados registrados retorna una lista vac�a.
	 */
	public List<Empleado> consultarEmpleados();
	/**
	 * Adiciona un empleado al repositorio para hacerlo persistente
	 * @param empleado el objeto empleado que se desea guardar,
	 * 			debe ser diferente de null
	 * @return un valor booleano indicando si se pudo guardar en el repositorio o no
	 * 		
	 */
	public abstract boolean adicionarEmpleado(Empleado Empleado);
	
	/**
	 * Busca un empleado en la base de datos a partir de su identificador
	 * @param identificador	el n�mero que identifica al empleado que se desea buscar,
	 * 			debe ser diferente de null
	 * @return	el objeto empleado con la identificacion dada, o null si no se encuentra.
	 */
	public abstract Empleado buscarEmpleado(int identificador);
	/**
	 * Elimina toda la informaci�n del empleado en el repositorio
	 * @param empleado el objeto empleado que se desea borrar,
	 * 			debe ser diferente de null
	 * @return un valor booleano indicando si se pudo borrar en el repositorio o no
	 */
	public abstract boolean borrarEmpleado(Empleado empleado);
	
}

	


