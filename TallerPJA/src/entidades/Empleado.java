package entidades;

public abstract class Empleado {
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
	public abstract double calcularpago();	
	
}
	
