package modelo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Correo;

/**
 * Realiza un test sobre la clase Correo del modelo.
 * @author Rebeca Fernández
 * 26/05/2016
 */

public class CorreoTest {

	@Test
	public void testCorreoString() {
	
		Correo correo = new Correo("correo@correo");
		assertTrue(correo != null);
	
		}
	
	@Test
	public void testCorreoCorreo() {
		
		Correo correo = new Correo("correo@correo");
		assertTrue(correo != null);
			
	}
	
	@Test
	public void testSetTexto() {
		Correo correo = new Correo("correo@correo");
		assertNotNull(correo); 
		
		
	}


	@Test
	public void testGetTexto() {
		Correo correo = new Correo("correo@correo");
		assertNotNull(correo.getTexto());
		
		
	}
}