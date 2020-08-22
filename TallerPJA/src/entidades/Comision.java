package entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Un empleado que se le paga nomina empezando con 
 * un salario semanal base + comision del 5%
 * de las ventas que realice 
 * @version 1.0
 */
@Entity
@DiscriminatorValue("comision")
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

	//constructor usado por el OMR para la persistencia
    public Comision() {
		
		
	}
	/**
	 * Calcula el pago de salario que aplica
	 * para cada empleado
	 * @return	retorna el salario semanal del empleado
	 */
	@Override
	public double calcularPago() {
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

	public double getSalarioSemanal() {
		return salarioSemanal;
	}
	public double getVentas() {
		return ventas;
	}
	
	
	//los metodos set son usados por el ORM para persistencia
	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	
	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	
	}

