package test.java.liceosorollab;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import main.java.liceosorollab.Animal;
public class AnimalTest {
	private Animal animal;
	
	@Before
	public void Before() {
		animal = new Animal ("mamifero","gato",4.5,2,"negro");
	}
	
	@Test
	public void comprobarEspecie() {
		assertEquals("mamifero", animal.getEspecie());
	}
}
