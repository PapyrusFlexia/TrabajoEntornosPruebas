package funciones;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class QuintaFuncionTest {
	static Funciones o = null;
	static int operacionesRealizadas = 0;
	static int pruebasRealizadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando Tests");
		o = new Funciones();
	}
	
	@BeforeEach
	private void preparaPruebaEjecutar(){
		operacionesRealizadas++;
		System.out.println("Ejecutando test "+ operacionesRealizadas);
		 pruebasRealizadas++;
	}
	
	@AfterEach
	private void terminadaPrueba(){
		System.out.println("Se ha ejecutado el test: "+operacionesRealizadas);
		 System.out.println(pruebasRealizadas);
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		o = new Funciones();
	}
	@DisplayName("Test de Caja Negra") // Test correcto, Suma todos los numeros correctamente de la cadena
	@Test
	void sumarNumerosdeCadenas() {
		assertEquals(52, o.QuintaFuncion("Pablo Carlos 24/03/2000 27/06/1997"));
		

	}

	@DisplayName("Test de Caja Blanca") // Test correcto,  No suma todos los numeros correctamente de la cadena
	@Test
	void noSumaNumerodelaCadena() {
		assertEquals(2, o.QuintaFuncion("Pablo Carlos 24/03/2000 27/06/1997"));
		assertNotEquals(52, o.QuintaFuncion("Pablo Carlos 24/03/2000 27/06/1997"));
		
	}

}