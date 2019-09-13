package co.com.uan.www.pruebas_unitarias;

import org.junit.Test;

import junit.framework.TestCase;

public class SumaTest extends TestCase {

	private static int a;
	private static int b;
	
	protected void setUp() throws Exception {
		a = 19;
		b = 1;
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testSumar() {
		assertEquals("Suma exitosa", 20, Suma.sumar(a, b));
	}

	@Test
	public void testSumarFallido() {
		assertNotSame(23, Suma.sumar(a, b));
	}
}
