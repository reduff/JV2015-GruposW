package modelo.test;
/**
 * @author Salvador Zapata Casales
 * @Date 26/05/2016
 */






import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import modelo.Posicion;


public class testPosicion {
	
	

	 // Datos para las pruebas
	private Posicion x;
	private Posicion y;
	
	/**
	 * Se ejecuta antes de cada @test para preparar datos de prueba
	 */
	
	@Before  
	public void creaPosicion() {
		x = new Posicion (5, 0); 	
		y = new Posicion (0, 5);
	}
	/**
	 * Metodo que se ejecuta despues de cada @Test para limpiar datos de prueba.
	 */
	@After	
	public void borraPosicion() {
		Posicion x = null;
		Posicion y = null;
	}
	
	@Test
	public void testPosicionIntInt() {
	
		assertNotNull(x);
		assertNotNull(y);
	
	}

	@Test
	public void testPosicion() {
		
			assertTrue(x != null);
			assertTrue(y != null);
	}

	@Test
	public void testPosicionPosicion() {
		Posicion d = new Posicion();
		assertNotNull(d);
	}

	@Test
	public void testGetX() {
		
		assertNotNull(x.getX());
	}

	@Test
	public void testGetY() {
		assertNotNull(y.getY());
	}

	@Test
	public void testSetX() {
		x.setX(5);
		assertEquals(x.getX(), 5);
	}

	@Test
	public void testSetY() {
		y.setY(5);
		assertEquals(y.getY(),5);
	}

}
