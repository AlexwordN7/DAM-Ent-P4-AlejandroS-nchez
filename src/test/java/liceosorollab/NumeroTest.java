package test.java.liceosorollab;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.java.liceosorollab.Numero;


public class NumeroTest {
	
	private Numero numero;

	
	@Before
	public void Before() {
		numero=new Numero(1,5);
	}
	
	@Test
	public void comprobarnumero1() {
		assertEquals(1,numero.getNumero1());
	}
	
	@Test
	public void comprobarnumero2() {
		assertEquals(5,numero.getNumero2());
	}
	
	@Test
	public void comprobarsuma() {
		assertEquals(6,numero.suma());
	}
	
	@Test
	public void comprobarresta() {
		assertEquals(-4,numero.resta());
	}
	
	@Test
	public void comprobarMultiplicar() {
		assertEquals(5,numero.multiplicar());
	}
	
	@Test
	public void comprobarDividir() {
		assertEquals(0,numero.dividir());
	}
}
