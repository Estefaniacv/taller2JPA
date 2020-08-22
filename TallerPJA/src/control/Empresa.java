package control;


import persistencia.RepositorioEmpleados;

import java.util.List;

import javax.swing.JOptionPane;

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
 * Se adiciona un empleado a la empresa, es decir, se registra su información y se guarda.
 * Usa la clase fábricaEmpleados para crear el objeto específico.
 * @param tipo	qué tipo de empleado es: 'A' para asalariado, 'C' para comision 'P' porHoras
 * @param identificador numero que identifica al empleado
 * @param nombre nombre del empleado
 * @param salarioSemanal remuneracion que recibe el empleado por labor
 * @param valorHoras remuneracion por horas
 * @param horasTrabadas numero de horas laboradas
 * @param ventasRealizadas numero de ventas realizadas por el empleado por comision
 * 
 * @return	un valor booleano indicando si se pudo adicionar el empleado
 * 			o no (porque ya existía otro con esa identificador).
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
 * Busca un empleado entre los que están registrados, por su número de identificacion
 * @return el objeto empleado con la identificacion dada, o null si no se encuentra
 */
public Empleado buscarEmpleado(int identificador) {
	Empleado empleado = repositorioEmpleados.buscarEmpleado(identificador);
	return empleado;
}

/**
 * Borra un empleado entre los que están registrados,
 * buscándolo previamente por su número de identificacion
 * @throws BarcoException si no encuentra un barco con esa matrícula.
 */
public void borrarEmpleado(int identificador) {
	Empleado empleadoBuscado = repositorioEmpleados.buscarEmpleado(identificador);
	if (empleadoBuscado == null) {
		JOptionPane.showMessageDialog(null,"no se encontro el empleado buscado");

	}
	
	boolean pudoBorrar = repositorioEmpleados.borrarEmpleado(empleadoBuscado);
	
	if (!pudoBorrar) {
		JOptionPane.showMessageDialog(null,"No se pudo borrar el empleado de la base de datos");

	
	}
}

/**
 * Calcula la nomina  total de la semana de todos los empleados en la empresa
 * @return	el valor total a pagar
 */
public double calcularNominaTotal() {
	List<Empleado> empleados = repositorioEmpleados.consultarEmpleados();
	double nominaTotal = 0;
	for (Empleado empleado : empleados) {
		nominaTotal += empleado.calcularPago();
	}
	return nominaTotal;
}

}


