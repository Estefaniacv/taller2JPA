package entidades;
/**
 * Permite crear un empleado de acuerdo con el tipo seleccionado
 * (que llega como uno de los parámetros),y así las clases
 * que usa empleado no tiene que conocer las hijas, solo la
 * clase padre.
 * 
 * @version 1.0
 */
public class FabricaEmpleados {
	public static Empleado crearEmpleado(int identificador, String nombre, double salarioSemanal,double valorHoras,int horasTrabajadas, double ventasRealizadas,char tipo) {
		switch (tipo){
			case 'a':
			case 'A': 	return new Asalariado(identificador,nombre,salarioSemanal);
			case 'p':   
			case 'P': 	return new PorHoras(identificador,nombre,valorHoras,horasTrabajadas);
			case 'c':	
			case 'C':   return new Comision(identificador,nombre,salarioSemanal,ventasRealizadas);
		}
		
		return null;
	}

}

