package test.java.liceosorollab;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import main.java.liceosorollab.Rectangulo;

public class RectanguloTest {
	private Rectangulo rectangulo;
	
	@Before
	public void Before() {
		rectangulo=new Rectangulo(5,5);
	}
	
	@Test
	public void comprobarLadosIguales() {
		assertEquals(false,rectangulo.comprobarLadosIguales());
	}
	
	@Test
	public void comprobarPerimetro() {
		assertEquals(20, rectangulo.comproPerimetro());
	}
	
	@Test
	public void comprobarArea() {
		assertEquals(25, rectangulo.comproArea());
	}
	
	@Test
	public void comprobarTamañoRectangulo() {
		assertEquals(7, rectangulo.comproTamano());
	}
}
