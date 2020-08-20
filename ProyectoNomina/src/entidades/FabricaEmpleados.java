package entidades;
/**
 * Permite crear un empleado de acuerdo con el tipo de contrato
 * (que llega como uno de los par�metros),y as� las clases
 * que usan empleado no tiene que conocer las hijas, solo la
 * clase padre.
 * Corresponde al patr�n de dise�o "FACTORY"
 * 
 * @version 1.0
 *
 */
public class FabricaEmpleados {
	public static Empleado crearEmpleado(int identificador, String nombre, double salarioSemanal,double valorHoras,int horasTrabajadas, int ventasRealizadas,char tipo) {
		switch (tipo){
			case 'a':
			case 'A': 	return new Asalariado(identificador,nombre);
			case 'p':
			case 'P': 	
		}
		return null;
	}

}

