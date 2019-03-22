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

class OctavaFuncionTest {

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
		System.out.println("Se han realizado " + pruebasRealizadas + " pruebas");
	}

	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		o = new Funciones();
	}

	@DisplayName("Test caja negra") // Test correcto, comprueba que los minutos son mayores que 700
	@Test
	void horasTrabajosAlumnos() {
		String[] alumnos = {"Carlos", "Pablo"};
		Integer[] horasCarlos = {30, 60, 120, 50, 270, 200};
		Integer[] horasPablo = {300, 120, 50, 30, 90, 130};
		Integer[] horasTotales = {730, 720};
		assertEquals(700, o.OctavaFuncion(alumnos, horasTotales));
		alumnos = null;
		horasCarlos = null;
		horasPablo = null;
		horasTotales = null;
 	}
	
	@DisplayName("Test caja negra") // Test correcto, no comprueba que los minutos son mayores que 700
	@Test
	void noHorasTrabajosAlumnos() {
		String[] alumnos = {"Carlos", "Pablo"};
		Integer[] horasCarlos = {30, 60, 120, 50, 270, 200};
		Integer[] horasPablo = {300, 120, 50, 30, 90, 130};
		Integer[] horasTotales = {730, 720};
		assertEquals(900, o.OctavaFuncion(alumnos, horasTotales));
		alumnos = null;
		horasCarlos = null;
		horasPablo = null;
		horasTotales = null;
 	}

}