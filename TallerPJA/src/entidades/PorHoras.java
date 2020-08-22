package entidades;

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
	/**
	 * Calcula el pago de salario que aplica
	 * para cada empleado
	 * @return	retorna el salario del empleado
	 */
	@Override
	public double calcularpago() {
		
		double saldo=valorHora*horasTrabajadas;
		numHoras=+horasTrabajadas;
		
		if(numHoras>40) {
			
			return saldo+200000;
			
		}
		
		
		return saldo;
	}

}
