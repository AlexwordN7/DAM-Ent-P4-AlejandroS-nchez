package test.java.liceosorollab;

import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import main.java.liceosorollab.Usuario;

public class UsuaioTest {
	
private Usuario usuario;
	
	@Before
	public void Before() {
		usuario = new Usuario("Yanella","Astudillo Ortiz", LocalDate.of(2000, 05, 07), 18);
	}
	
	@Test
	public void comprobarNombre() {
		assertEquals("Yanella", usuario.getNombre());
	}
	
	@Test
	public void comprobarApellido() {
		assertEquals("Astudillo Ortiz", usuario.getApellidos());
	}
	
	@Test
	public void comprobarNombreCompleto() {
		assertEquals("Yanella Astudillo Ortiz", usuario.getNombre()+ " "+usuario.getApellidos());
	}
	
	@Test
	public void comprobarMayorDeEdad() {
		
		assertEquals(true,usuario.mayoriaEdad());
	}
}
