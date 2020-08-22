package entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Un empleado que se le paga nomina por hora trabajada
 * y se le da una comision extra si las horas laboradas
 * es mayor a 40 horas
 * @version 1.0
 */


@Entity
@DiscriminatorValue("porhoras")
public class PorHoras extends Empleado {
	
	private double valorHora;
	private double horasTrabajadas;
	private double numHoras=0;
    
	/**
	 * @param identificador	numero que identifica al empleado
	 * @param nombre nombre del empleado
	 * @param valorHora saldo que se da por hora-labor
	 * @param horasTrabajadas numero de horas laboradas por el empleado
	 */
	public PorHoras(int identificador, String nombre,double valorHora,double horasTrabajadas) {
		super(identificador, nombre);
	    this.valorHora=valorHora;
	    this.horasTrabajadas=horasTrabajadas;
	}

	//constructor usado por el OMR para la persistencia
    public PorHoras() {
		
	}
	/**
	 * Calcula el pago de salario que aplica
	 * para cada empleado
	 * @return	retorna el salario del empleado
	 */
	@Override
	public double calcularPago() {
		
		double saldo=valorHora*horasTrabajadas;
		numHoras +=horasTrabajadas;
		
		if(numHoras>40) {
			
			return saldo+200000;
			
		}
		
		return saldo;
	}

	public double getValorHora() {
		return valorHora;
	}
	
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public double getNumHoras() {
		return numHoras;
	}
	
	//los metodos set son usados por el ORM para persistencia
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}



	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	

	public void setNumHoras(double numHoras) {
		this.numHoras = numHoras;
	}

}
