package entidades;

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
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Calcula el pago de salario que aplica
	 * para cada empleado
	 * @return	retorna eñ salario semanal del empleado
	 */
	@Override
	
	public double calcularpago() {
	   if(salarioSemanal==0) {
		   
		   return 0;
	   }
	   else 
	   {
		   return salarioSemanal;
	   }
	}

}
