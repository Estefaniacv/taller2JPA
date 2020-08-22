package entidades;

public class Comision extends Empleado {
  private double salarioSemanal;
  private double ventas;
	
  
  /**
	 * @param identificador	numero que identifica al empleado
	 * @param nombre nombre del empleado
     * @param salarioSemanal remuneracion fija que se le da al empleado
     * @param ventas numero de ventas que realiza el empleado
	 */
	public Comision(int identificador, String nombre,double salarioSemanal,double ventas) {
		super(identificador, nombre);
		this.salarioSemanal=salarioSemanal;
		this.ventas=ventas;
	
	}
	/**
	 * Calcula el pago de salario que aplica
	 * para cada empleado
	 * @return	retorna el salario semanal del empleado
	 */
	@Override
	public double calcularpago() {
       if(salarioSemanal!=0&&ventas!=0) {
    	   ventas=(ventas*0.05);
    	   salarioSemanal=salarioSemanal+ventas;
    	   
    	   return salarioSemanal;
       }
       else if(salarioSemanal!=0||ventas==0) {
    	   return salarioSemanal;
    	   
       }
      return 0;
    	   
       }
	}

