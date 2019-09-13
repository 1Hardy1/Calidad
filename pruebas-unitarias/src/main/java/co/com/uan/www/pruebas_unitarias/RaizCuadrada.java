package co.com.uan.www.pruebas_unitarias;
import java.math.*;

public class RaizCuadrada {
	public static float radicar(int a) {
		return (float) Math.sqrt(a);
	}
	
	public static Exception radicarConException(int a) {
		return new Exception(a + "^2: " + Math.sqrt(a));
	}
}
