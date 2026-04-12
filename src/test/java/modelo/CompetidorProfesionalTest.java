/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompetidorProfesionalTest {

    private CompetidorProfesional competidor;

    @Before
    public void setUp() {
        competidor = new CompetidorProfesional(
            "Julian Alaphilippe", 31, "Francia", 2, 1.73, 62.0, "Soudal", 8);
    }

    // Prueba que el equipo se guarda
    @Test
    public void testGetEquipo() {
        assertEquals("Soudal", competidor.getEquipo());
    }

    // Prueba años profesional
    @Test
    public void testGetAniosProfesional() {
        assertEquals(8, competidor.getAniosProfesional());
    }

    // Prueba sobreescritura toString incluye equipo y super
    @Test
    public void testToStringIncluyeEquipo() {
        String resultado = competidor.toString();
        assertTrue(resultado.contains("Soudal"));
        assertTrue(resultado.contains("Julian Alaphilippe")); // viene del super
        assertTrue(resultado.contains("Profesional"));
    }

    // Prueba sobrecarga obtenerDatos(String etiqueta)
    @Test
    public void testObtenerDatosConEtiqueta() {
        String resultado = competidor.obtenerDatos("FAVORITO");
        assertTrue(resultado.contains("[FAVORITO]"));
        assertTrue(resultado.contains("Julian Alaphilippe"));
    }
}