package uan.edu.co.CalculoTest;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class CalculoTest {
	
	private static Calculo calculo;
	
	@Before
	public  void setUp() {
		calculo= new Calculo(4, 2);
		
	}
	
	@After
	public  void tearDown() {
		calculo = null;
	}
	
	
	@Test
	public void testSuma() {
		int total =6;
		int sum = Calculo.suma();
		assertEquals(sum, total);
	}
	
	@Test
	public void testSumaFallida(){
		int total = 15;
		int sum = Calculo.suma();
		assertNotSame(sum, total);
	}
	
	@Test
	public void testResta() {
		int total = 2;
		int rest = Calculo.resta();
		assertEquals(rest, total);
	}
	
	@Test
	public void testRestaFallida(){
		int total = 15;
		int rest = Calculo.resta();
		assertNotSame(rest, total);
	}

	@Test
	public void testMultiplicacion() {
		int total = 8;
		int mult = Calculo.multiplicacion();
		assertEquals(mult, total);
	}
	
	@Test
	public void testMultiplicacionFallida(){
		int total = 15;
		int mult = Calculo.multiplicacion();
		assertNotSame(mult, total);
	}
	

	@Test
	public void testDivision() {
		int total = 2;
		int div = Calculo.division();
		assertEquals(div, total);
	}
	
	@Test
	public void testDivisionFallida(){
		int total = 15;
		int div = Calculo.division();
		assertNotSame(div, total);
	}
	

	@Test
	public void testPotenciacion() {
		int total = 16;
		int pot = (int) Calculo.potenciacion();
		assertEquals(pot, total);
	}
	
	@Test
	public void testPotenciacionFallida(){
		int total = 15;
		int pot = (int) Calculo.potenciacion();
		assertNotSame(pot, total);
	}
	

	@Test
	public void testRadicacion() {
		int total = 2;
		int rad = (int) Calculo.radicacion();
		assertEquals(rad, total);
	}
	
	@Test
	public void testRadicacionFallida(){
		int total = 15;
		int rad = (int) Calculo.radicacion();
		assertNotSame(rad, total);
	}
	
}
