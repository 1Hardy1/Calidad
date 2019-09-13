package co.com.uan.www.pruebas_unitarias;

import org.junit.Test;

import junit.framework.TestCase;

public class PotenciacionTest extends TestCase {

	private static int a;
	private static int b;
	
	protected void setUp() throws Exception {
		a = 10;
		b = 2;
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testPotenciar() {
		assertEquals("Potencia exitosa", (double) 100, Potenciacion.potenciar(a, b));
	}

	@Test
	public void testPotenciarFallido() {
		assertNotSame(10, Potenciacion.potenciar(b, a));
	}
}
