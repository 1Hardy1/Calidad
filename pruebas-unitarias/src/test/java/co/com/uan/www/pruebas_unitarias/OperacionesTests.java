package co.com.uan.www.pruebas_unitarias;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DivisionTest.class, MultiplicacionTest.class, PotenciacionTest.class, RaizCuadradaTest.class,
		RestaTest.class, SumaTest.class })
public class OperacionesTests {

}
