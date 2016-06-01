package modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.Contraseña;
/**
 * Realiza un test sobre la clase Contraseña del modelo.
 * @author Fernando Meseguer Fernández
 * 27/05/2016
 */
public class ContraseñaTest {
	
	private Contraseña contraseña1;
	private Contraseña contraseña2;
	@Before
	public void crearObjectosPrueba(){
		contraseña1 = new Contraseña();
		contraseña2 = new Contraseña("HolaKase1_");
		new Contraseña(contraseña2);
	}
	
	@After
	public void borrarObjetosPrueba(){
		contraseña1 = null;
		contraseña2 = null;
	}
	
	@Test
	public void testSetTexto(){
		String texto = "HolaK1Ase_";
		contraseña1.setTexto(texto);
		assertEquals(contraseña1.toString(), texto);
	}
	
	@Test

	public void testSetTextoInvalido(){
		try {
			//Metemos una contraseña nula
			contraseña2.setTexto(null);
		} catch (AssertionError e) {
			assertNotNull(contraseña2.toString());
		}
		
		try {
			//Metemos una contraseña que no cumple con el patrón para validarla
			contraseña2.setTexto("HolaKAse");
		} catch (AssertionError e) {
			assertNotNull(contraseña2.toString());
		}
	}

	@Test
	public void testToString(){
		assertNotNull(contraseña2.toString());
	}
}
