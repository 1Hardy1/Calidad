package co.com.uan.www.pruebas_unitarias;

import org.junit.Test;

import junit.framework.TestCase;

public class RestaTest extends TestCase {

	private static int a;
	private static int b;
	
	protected void setUp() throws Exception {
		a = 254;
		b = 100;
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testRestar() {
		assertEquals("Resta exitosa", 154, Resta.restar(a, b));
	}

	@Test
	public void testRestarFallido() {
		assertNotSame(10, Resta.restar(b, a));
	}
}
