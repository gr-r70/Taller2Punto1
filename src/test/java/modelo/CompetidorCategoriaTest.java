/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompetidorCategoriaTest {

    private CompetidorCategoria competidor;

    @Before
    public void setUp() {
        competidor = new CompetidorCategoria("Ana Lopez", 20, "Mexico", 5, 1.65, 55.0, "Sub-23");
    }

    // Prueba que la categoría se guarda
    @Test
    public void testGetCategoria() {
        assertEquals("Sub-23", competidor.getCategoria());
    }

    // Prueba sobreescritura toString incluye categoría y super
    @Test
    public void testToStringIncludeCategoria() {
        String resultado = competidor.toString();
        assertTrue(resultado.contains("Sub-23"));
        assertTrue(resultado.contains("Ana Lopez")); // viene del super
        assertTrue(resultado.contains("Categoria"));
    }

    @Test
    public void testObtenerDatosConCategoria() {
        String resultado = competidor.obtenerDatos(true);
        assertTrue(resultado.contains("Sub-23"));
    }

    @Test
    public void testObtenerDatosSinCategoria() {
        String resultado = competidor.obtenerDatos(false);
        assertTrue(resultado.contains("Ana Lopez"));
    }

    // Nuevo test: obtenerDatos() base muestra categoría
    @Test
    public void testObtenerDatosMuestraCategoria() {
        String resultado = competidor.obtenerDatos();
        assertTrue(resultado.contains("Sub-23"));
        assertTrue(resultado.contains("Ana Lopez"));
    }
}