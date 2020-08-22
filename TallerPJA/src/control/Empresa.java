package control;


import persistencia.RepositorioEmpleados;
import entidades.Empleado;
import entidades.FabricaEmpleados;
import persistencia.OrmBaseDatos;

/**
 * Clase donde se registran los empleados de la empresa
 * y tiene la principales funciones del programa.
 * 
 * @version 1.0
 */
public class Empresa  {

private RepositorioEmpleados repositorioEmpleados;

public Empresa() {
	
	repositorioEmpleados= new OrmBaseDatos();
	}
   
/**
 * Se adiciona un empleado a la empresa, es decir, se registra su informaci�n y se guarda.
 * Usa la clase f�bricaEmpleados para crear el objeto espec�fico.
 * @param tipo	qu� tipo de empleado es: 'A' para asalariado, 'C' para comision 'P' porHoras
 * @param identificador numero que identifica al empleado
 * @param nombre nombre del empleado
 * @param salarioSemanal remuneracion que recibe el empleado por labor
 * @param valorHoras remuneracion por horas
 * @param horasTrabadas numero de horas laboradas
 * @param ventasRealizadas numero de ventas realizadas por el empleado por comision
 * 
 * @return	un valor booleano indicando si se pudo adicionar el empleado
 * 			o no (porque ya exist�a otro con esa identificador).
 */
public boolean adicionarEmpleado(int identificador, String nombre, double salarioSemanal,double valorHoras,int horasTrabajadas, double ventasRealizadas,char tipo){
	Empleado empleadoBuscado = buscarEmpleado(identificador);
	if (empleadoBuscado == null) {
		Empleado empleadoNuevo = FabricaEmpleados.crearEmpleado(identificador,nombre,salarioSemanal,valorHoras,horasTrabajadas,ventasRealizadas, tipo);
		return repositorioEmpleados.adicionarEmpleado(empleadoNuevo);
	}
	return false;
}
/**
 * Busca un empleado entre los que est�n registrados, por su n�mero de identificacion
 * @return el objeto empleado con la identificacion dada, o null si no se encuentra
 */
public Empleado buscarEmpleado(int identificador) {
	Empleado empleado = repositorioEmpleados.buscarEmpleado(identificador);
	return empleado;
}

/**
 * Borra un empleado entre los que est�n registrados,
 * busc�ndolo previamente por su n�mero de identificacion
 * @throws BarcoException si no encuentra un barco con esa matr�cula.
 */
public void borrarBarco(int identificador) {
	Empleado empleadoBuscado = repositorioEmpleados.buscarEmpleado(identificador);
	if (empleadoBuscado == null) {

	}
	
	boolean pudoBorrar = repositorioEmpleados.borrarEmpleado(empleadoBuscado);
	
	if (!pudoBorrar) {
	
	}
}

}


