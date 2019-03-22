package funciones;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class PrimeraFuncionTest {
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
	@DisplayName("Test de Caja Negra") //Test correcto, indica que la funcion es divisible
	@Test
	void divisibleEntreTrece() {
        assertTrue(o.PrimeraFuncion(0)); 
       
        
	}
	@DisplayName("Test de Caja Blanca") //Test correcto, indica que la funcion no es divisible
	@Test
	void noEsDivisible() {
        assertTrue(o.PrimeraFuncion(20));
        assertFalse(o.PrimeraFuncion(26));
       
	}  
	

}