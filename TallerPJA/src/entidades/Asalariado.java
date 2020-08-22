package entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/**
 * Un empleado que se le paga un salario semanal
 * fijo independiente a sus horas laboradas
 * @version 1.0
 */
@Entity
@DiscriminatorValue("asalariado")
public class Asalariado extends Empleado {
	
	private double salarioSemanal;

	 /**
	 * @param identificador	numero que identifica al empleado
	 * @param nombre nombre del empleado
	 * @param salarioSemanal remuneracion fija que se le da al empleado
	 */
	public Asalariado(int identificador, String nombre,double salarioSemanal) {
		super(identificador, nombre);
		this.salarioSemanal=salarioSemanal;
	
	}
	
	//constructor usado por el OMR para la persistencia
    public Asalariado() {
	   
	  }
	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}
   
	//los metodos set son usados por el ORM para persistencia
	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}


	
	/**
	 * Calcula el pago de salario que aplica
	 * para cada empleado
	 * @return	retorna eñ salario semanal del empleado
	 */
	@Override
	
	public double calcularPago() {
	   if(salarioSemanal==0) {
		   
		   return 0;
	   }
	   else 
	   {
		   return salarioSemanal;
	   }
	}

}
