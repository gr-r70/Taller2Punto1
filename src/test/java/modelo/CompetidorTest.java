/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompetidorTest {

    private Competidor competidor;

    @Before
    public void setUp() {
        competidor = new Competidor("Carlos Ramirez", 22, "Colombia", 10, 1.75, 68.0, 0);
    }

    // Prueba que los datos se guardan correctamente
    @Test
    public void testConstructor() {
        assertEquals("Carlos Ramirez", competidor.getNombre());
        assertEquals(22, competidor.getEdad());
        assertEquals("Colombia", competidor.getPais());
        assertEquals(10, competidor.getRankingMundial());
        assertEquals(1.75, competidor.getEstatura(), 0.001);
        assertEquals(68.0, competidor.getPeso(), 0.001);
        assertEquals(0, competidor.getPuntos());
    }

    // Prueba que los puntos se acumulan
    @Test
    public void testActualizarRankingAcumulaPuntos() {
        competidor.actualizarRanking(20);
        assertEquals(20, competidor.getPuntos());
        competidor.actualizarRanking(15);
        assertEquals(35, competidor.getPuntos());
    }

    // Prueba que el ranking mejora con puntos
    @Test
    public void testActualizarRankingMejora() {
        competidor.actualizarRanking(30); // 30/10 = 3 posiciones sube
        assertEquals(7, competidor.getRankingMundial()); // 10 - 3 = 7
    }

    // Prueba que el ranking no baja de 1
    @Test
    public void testActualizarRankingNoMenorA1() {
        competidor.actualizarRanking(200);
        assertTrue(competidor.getRankingMundial() >= 1);
    }

    // Prueba obtenerDatos no vacío
    @Test
    public void testObtenerDatosNoVacio() {
        assertNotNull(competidor.obtenerDatos());
        assertTrue(competidor.obtenerDatos().contains("Carlos Ramirez"));
    }

    // Prueba toString contiene info básica
    @Test
    public void testToString() {
        String resultado = competidor.toString();
        assertTrue(resultado.contains("Carlos Ramirez"));
        assertTrue(resultado.contains("Colombia"));
    }
}