package entidades;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Información de un empleado que se registra en la empresa
 * y del que se desea conocer su pago de nomina
 * @version 1.0
 */

@Entity
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_empleado")

public abstract class Empleado {
	@Id
	private int identificador;
	private String nombre;
	
	/**
	 * @param identificador	numero que identifica al empleado
	 * @param nombre nombre del empleado

	 */
	
	public Empleado(int identificador,String nombre) {
		this.identificador=identificador;
		this.nombre=nombre;
		
	}
	
	//constructor usado por el OMR para la persistencia
	public Empleado() {
		
		
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public String getNombre() {
		return nombre;
	}


	/**
	 * Calcula el pago de salario que aplica
	 * para cada empleado
	 * @return	retorna un valor numerico
	 */
	public abstract double calcularPago();

	//los metodos set son usados por el ORM para persistencia
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	
}
	
