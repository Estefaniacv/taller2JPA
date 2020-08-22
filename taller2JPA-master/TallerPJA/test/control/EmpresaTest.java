package control;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import persistencia.ListaEmpleados;


class EmpresaTest {
	
	
	/**
     *Calcular la nómina cuando no hay empleados.
	 */
	
	@Test
	void testCalcularNominanoSinEmpleados() {
		Empresa empresa = new Empresa(new ListaEmpleados());
		double nominaEsperada = 0;
		double nominaTotal = empresa.calcularNominaTotal();
		assertEquals(nominaEsperada,nominaTotal);
	}

	/**
	 * Se adicionan un empleado asalariado,por horas y  comision
	 */
	@Test
	void testAdicionarEmpleadosValidos(){
		Empresa empresa = new Empresa(new ListaEmpleados());
		boolean adicionAsalariado = empresa.adicionarEmpleado(1,"Andres",100000,0,0,0,'a');
		boolean adicionPorHoras = empresa.adicionarEmpleado(2,"Felipe",0,5000,6,0,'p');
		boolean adicionComision = empresa.adicionarEmpleado(8,"Maria",50000,0,0,4000,'c');
		assertTrue(adicionAsalariado);
		assertTrue(adicionPorHoras);
		assertTrue(adicionComision);
	}

	/**
     *Calcular la nómina con los tres empleados
     *añadidos
	 */
	
	@Test
	void testCalcularNominanoConEmpleados() {
		Empresa empresa = new Empresa(new ListaEmpleados());
		empresa.adicionarEmpleado(1,"Andres",100000,0,0,0,'a');
		empresa.adicionarEmpleado(2,"Felipe",0,5000,6,0,'p');
		empresa.adicionarEmpleado(8,"Maria",50000,0,0,4000,'c');
		double nominaEsperada = 180200;
		double nominaTotal = empresa.calcularNominaTotal();
		assertEquals(nominaEsperada,nominaTotal);
	}

	

}
