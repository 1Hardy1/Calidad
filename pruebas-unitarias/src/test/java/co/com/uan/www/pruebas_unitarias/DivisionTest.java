package co.com.uan.www.pruebas_unitarias;

import org.junit.Test;

import junit.framework.TestCase;

public class DivisionTest extends TestCase {
	
	private static int a;
	private static int b;
	
	protected void setUp() throws Exception {
		a = 25;
		b = 5;
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testDividir() {
		assertEquals("Division exitosa: ", (float) 5, Division.dividir(a, b));
	}
	
	@Test
	public void testDividirFallido() {
		assertNotSame(15, Division.dividir(b, a));		
	}

}
