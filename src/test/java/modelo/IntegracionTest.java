/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntegracionTest {

    private Competencia competencia;
    private Equipo equipo;
    private CompetidorCategoria c1;
    private CompetidorProfesional c2;

    @Before
    public void setUp() {
        // Crear competencia
        competencia = new Competencia("Mundial de Ciclismo de Pista - Cali");

        // Crear equipo
        equipo = new Equipo("Team Colombia", "Colombia");

        // Crear un objeto de cada subclase
        c1 = new CompetidorCategoria("Carlos Ramirez", 22, "Colombia", 10, 1.75, 68.0, "Sub-23");
        c2 = new CompetidorProfesional("Julian Alaphilippe", 31, "Francia", 2, 1.73, 62.0, "Soudal", 8);
    }

    // Prueba agregar equipo a competencia
    @Test
    public void testAgregarEquipoACompetencia() {
        competencia.agregarEquipo(equipo);
        assertEquals(1, competencia.getEquipos().size());
    }

    // Prueba agregar competidores de ambas subclases al equipo
    @Test
    public void testAgregarCompetidoresDeAmbasSubclases() {
        equipo.agregarCompetidor(c1);
        equipo.agregarCompetidor(c2);
        assertEquals(2, equipo.getCompetidores().size());
    }

    // Prueba que el reporte incluye datos de ambas subclases
    @Test
    public void testGenerarReporteConAmbasSubclases() {
        equipo.agregarCompetidor(c1);
        equipo.agregarCompetidor(c2);
        competencia.agregarEquipo(equipo);

        String reporte = competencia.generarReporte();
        assertTrue(reporte.contains("Carlos Ramirez"));
        assertTrue(reporte.contains("Julian Alaphilippe"));
        assertTrue(reporte.contains("Team Colombia"));
    }

    // Prueba actualizar ranking y verificar cambio
    @Test
    public void testActualizarRankingIntegracion() {
        equipo.agregarCompetidor(c1);
        competencia.agregarEquipo(equipo);

        int rankingAntes = c1.getRankingMundial();
        c1.actualizarRanking(30);
        assertTrue(c1.getRankingMundial() < rankingAntes);
    }

    // Prueba flujo completo: crear, agregar y obtener datos
    @Test
    public void testFlujoCompleto() {
        equipo.agregarCompetidor(c1);
        equipo.agregarCompetidor(c2);
        competencia.agregarEquipo(equipo);

        // El reporte no debe estar vacío
        String reporte = competencia.generarReporte();
        assertNotNull(reporte);
        assertFalse(reporte.isEmpty());

        // Verificar toString de cada subclase (polimorfismo)
        assertTrue(c1.toString().contains("Categoria"));
        assertTrue(c2.toString().contains("Profesional"));
    }
}