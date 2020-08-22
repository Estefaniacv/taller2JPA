package control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpresaTest {

	/**
     *Calcular la nómina cuando no hay empleados.
	 */
	
	@Test
	void testCalcularNominanoEmpleado() {
		Empresa empresa = new empresa(new ListaEmpleados());
		double capacidadEsperada = 0;
		double capacidad = puerto.calcularCapacidadTotal();
		assertEquals(capacidadEsperada,capacidad);
	}

	
	@Test
	void testAdicionarEmpleado() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularNominaTotal() {
		fail("Not yet implemented");
	}

}
