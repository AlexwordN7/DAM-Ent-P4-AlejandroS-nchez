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
}
