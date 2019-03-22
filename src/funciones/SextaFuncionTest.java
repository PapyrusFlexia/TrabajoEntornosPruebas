package funciones;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertArrayEquals;

public class SextaFuncionTest {
	static Funciones o = null;
	static int operacionesRealizadas = 0;
	static int pruebasRealizadas = 0;

	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando Tests");
		o = new Funciones();
	}

	@BeforeEach
	private void preparaPruebaEjecutar() {
		operacionesRealizadas++;
		System.out.println("Ejecutando test " + operacionesRealizadas);
		pruebasRealizadas++; 
	}

	@AfterEach
	private void terminadaPrueba() {
		System.out.println("Se ha ejecutado el test: " + operacionesRealizadas);
		   System.out.println(pruebasRealizadas);
	}

	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		o = new Funciones();
	}

	@DisplayName("Test de Caja Negra") // Test correcto, indica que se han multiplicado los numeros correctamente
	@Test
	void comprobarMultiplicacion() {
		ArrayList<Double> resultadoEsperado = new ArrayList<Double>(); 
		List<Double> numeros = Arrays.asList(5.0); 
		assertEquals(resultadoEsperado,o.SextaFuncion(numeros)); 
		numeros = null; 
		

	}

	@DisplayName("Test de Caja Blanca") // Test correcto,  indica que no se han multiplicado los numeros correctamente
	@Test
	void noComprobarMultiplicacion() {
		ArrayList<Double> resultadoEsperado = new ArrayList<Double>(); 
		List<Double> numeros = Arrays.asList(5.0); 
		assertEquals(resultadoEsperado,o.SextaFuncion(numeros)); 
		List<Double> numeros2 = Arrays.asList(327.0); 
		assertNotEquals(resultadoEsperado,o.SextaFuncion(numeros2)); 
		numeros2 = null; 
	
		
	}
}