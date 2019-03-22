package funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TerceraFuncionTest {
		
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
		@DisplayName("Test caja negra") //Test correcto, divide un número divisible entre 13 por otro entre 400 y 500
		@Test
		void divisibleEntreX() {
			assertEquals(13,o.TerceraFuncion(5239, 403));
		}
		
		@DisplayName("Test caja blanca")
		@Test
		void noDivisibleEntreX() { //Test correcto, el número no es divisible por 13
			assertEquals(3, o.TerceraFuncion(1350, 450));
			assertNotEquals(13, o.TerceraFuncion(5850, 450));
		}
		

	}
