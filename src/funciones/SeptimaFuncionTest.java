package funciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SeptimaFuncionTest {

	static Funciones o;
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
		pruebasRealizadas++;
		System.out.println("Ejecutando test " + operacionesRealizadas);
	}

	@AfterEach
	private void terminadaPrueba() {
		System.out.println("Se ha ejecutado el test: " + operacionesRealizadas);
		System.out.println("Se han realizado "+pruebasRealizadas+" pruebas");
	}

	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		o = new Funciones();
	}

	@DisplayName("Test caja negra") // Test correcto, coge los caracteres entre 6 y 10
	@Test
	void cogerCharEntre6y10() {
		List<String> cadena = Arrays.asList("oooooopepeoooo");
		assertEquals("pepe", o.SeptimaFuncion(cadena));
		pruebasRealizadas++;
		System.out.println(pruebasRealizadas);
		cadena = null;
	}

	@DisplayName("Test caja blanca") // Test correcto, no coge los caracteres entre 6 y 10
	@Test
	void noCogerCharEntre6y10() {
		List<String> cadena = Arrays.asList("oooooopepeoooo");
		assertEquals("pepe", o.SeptimaFuncion(cadena));
		assertNotEquals("lmao", o.SeptimaFuncion(cadena));
		pruebasRealizadas++;
		System.out.println(pruebasRealizadas);
		cadena = null;
	}
}