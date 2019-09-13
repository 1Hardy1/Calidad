package co.com.uan.www.pruebas_unitarias;

import org.junit.Test;

import junit.framework.TestCase;

public class RaizCuadradaTest extends TestCase {

	private static int a;
	protected void setUp() throws Exception {
		a = 25;
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testRadicar() {
		assertEquals("Raiz cuadrada exitosa", (float) 5, RaizCuadrada.radicar(a));
	}

	@Test (expected = Exception.class)
	public void testRadicarFallido() {
		assertNotSame(50, RaizCuadrada.radicarConException(a));
	}
}
