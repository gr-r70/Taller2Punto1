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
            "Julian Alaphilippe", 31, "Francia", 2, 1.73, 62.0, 8);
    }

    @Test
    public void testObtenerDatosMuestraAnios() {
        String resultado = competidor.obtenerDatos();
        assertTrue(resultado.contains("8"));
        assertTrue(resultado.contains("Julian Alaphilippe"));
    }

    @Test
    public void testObtenerDatosConEtiqueta() {
        String resultado = competidor.obtenerDatos("FAVORITO");
        assertTrue(resultado.contains("[FAVORITO]"));
        assertTrue(resultado.contains("Julian Alaphilippe"));
        assertTrue(resultado.contains("8")); // también muestra años
    }
}