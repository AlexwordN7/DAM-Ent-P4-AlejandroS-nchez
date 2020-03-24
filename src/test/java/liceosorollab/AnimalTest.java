package test.java.liceosorollab;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import main.java.liceosorollab.Animal;
public class AnimalTest {
	private Animal animal;
	
	@Before
	public void Before() {
		animal = new Animal ("mamifero","perro",7.4,4,"caqui");
	}
	
	@Test
	public void comprobarEspecie() {
		assertEquals("mamifero", animal.getEspecie());
	}
	
	@Test
	public void comprobarRaza() {
		assertEquals("perro", animal.getRaza());
	}
	
	@Test
	public void comprobarPeso() {
		assertEquals(7,4, animal.getPeso());
	}
	
	@Test
	public void comprobarEdad() {
		assertEquals(4, animal.getEdad());
	}
}
