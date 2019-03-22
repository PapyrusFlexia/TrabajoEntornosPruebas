package funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CuartaFuncionTest {
		
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
		
		@DisplayName("Test caja negra") //Test correcto, como esperábamos quita las vocales y mayúsculas
		@Test
		void quitarMayusculasYVocales() {
			assertEquals("rls rc rmlbl g nchzs nzlz mngz", o.CuartaFuncion("Carlos Garcia Marmol", "Pablo Vega Sanchez", "Jose Gonzalez Dominguez"));
		}
		
		@DisplayName("Test caja blanca") //Test correcto, el resultado esperado tiene vocales
		@Test
		void noQuitaMayusculasYVocales() {
			assertEquals("rls rc amrlbl gonchzs nzlz mngz", o.CuartaFuncion("Carlos Garcia Marmol", "Pablo Vega Sanchez", "Jose Gonzalez Dominguez"));
			assertNotEquals("rls rc rmlbl g nchzs nzlz mngz", o.CuartaFuncion("Carlos Garcia Marmol", "Pablo Vega Sanchez", "Jose Gonzalez Dominguez"));
		}
		

	}
