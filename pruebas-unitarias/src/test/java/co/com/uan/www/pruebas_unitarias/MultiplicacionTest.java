package co.com.uan.www.pruebas_unitarias;

import org.junit.Test;

import junit.framework.TestCase;

public class MultiplicacionTest extends TestCase {

	private static int a;
	private static int b;
	
	protected void setUp() throws Exception {
		a = 10;
		b = 10;
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testMultiplicar() {
		assertEquals("Multiplicacion exitosa", 100, Multiplicacion.multiplicar(a, b));
	}

	@Test
	public void testMultiplicarFallido() {
		assertNotSame(40, Multiplicacion.multiplicar(b, a));
	}
}
