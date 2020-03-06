package test.java.liceosorollab;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import main.java.liceosorollab.Rectangulo;

public class RectanguloTest {
	private Rectangulo rectangulo;
	
	@Before
	public void Before() {
		rectangulo=new Rectangulo(6,9);
	}
	
	@Test
	public void comprobarLadosIguales() {
		assertEquals(false,rectangulo.comprobarLadosIguales());
	}
	
	@Test
	public void comprobarPerimetro() {
		assertEquals(30, rectangulo.comproPerimetro());
	}
}
