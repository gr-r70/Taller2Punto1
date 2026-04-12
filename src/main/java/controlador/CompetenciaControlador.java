package controlador;

import modelo.Competencia;
import modelo.CompetidorCategoria;
import modelo.CompetidorProfesional;
import modelo.Competidor;
import modelo.Equipo;
import vista.CompetenciaVista;

public class CompetenciaControlador {

    private final CompetenciaVista vista;
    private Competencia competencia;

    public CompetenciaControlador(CompetenciaVista vista) {
        this.vista = vista;
    }

public void iniciar() {
    competencia = new Competencia("Mundial de Ciclismo de Pista - Cali");

    int opcion;
    do {
        opcion = vista.menuInicio();
        switch (opcion) {
            case 1: agregarEquipo();        break;
            case 2: agregarCompetidor();    break;
            case 3: verReporte();           break;
            case 4: actualizarRanking();    break;
            case 5: buscarCompetidor();     break;
            case 6: vista.mostrarMensaje("Saliendo..."); break;
            default: vista.mostrarMensaje("Opción inválida");
        }
    } while (opcion != 6);
}

    private void agregarEquipo() {
        String nombre = vista.pedirNombreEquipo();
        String pais   = vista.pedirPais();
        competencia.agregarEquipo(new Equipo(nombre, pais));
        vista.mostrarMensaje("Equipo agregado correctamente.");
    }

    private void agregarCompetidor() {
        if (competencia.getEquipos().isEmpty()) {
            vista.mostrarMensaje("Primero agregue un equipo.");
            return;
        }

        String nombreEquipo = vista.pedirNombreEquipo();
        Equipo equipo = buscarEquipo(nombreEquipo);

        if (equipo == null) {
            vista.mostrarMensaje("Equipo no encontrado.");
            return;
        }

        String nombre  = vista.pedirNombreCompetidor();
        int edad       = vista.pedirEdad();
        String pais    = vista.pedirPais();
        int ranking    = vista.pedirRanking();
        double estatura = vista.pedirEstatura();
        double peso    = vista.pedirPeso();
        String categoria = vista.pedirCategoria();

        equipo.agregarCompetidor(new CompetidorCategoria(
        nombre, edad, pais, ranking, estatura, peso, categoria));
        vista.mostrarMensaje("Competidor agregado correctamente.");
    }

    private void verReporte() {
        if (competencia.getEquipos().isEmpty()) {
            vista.mostrarMensaje("No hay equipos registrados.");
            return;
        }
        vista.mostrarMensaje(competencia.generarReporte());
    }

    private void actualizarRanking() {
        String nombre      = vista.pedirNombreCompetidor();
        int puntosObtenidos = vista.pedirPuntos();
        Competidor c       = buscarCompetidor(nombre);

        if (c == null) {
            vista.mostrarMensaje("Competidor no encontrado.");
            return;
        }
        c.actualizarRanking(puntosObtenidos);
        vista.mostrarMensaje("Ranking actualizado.\n" + c.toString());
    }

    private void buscarCompetidor() {
        String nombre = vista.pedirNombreCompetidor();
        Competidor c  = buscarCompetidor(nombre);
        if (c != null) {
            vista.mostrarMensaje("ENCONTRADO:\n" + c.obtenerDatos());
        } else {
            vista.mostrarMensaje("Competidor no encontrado.");
        }
    }

    // Sobrecarga en controlador: buscar por nombre
    public Competidor buscarCompetidor(String nombre) {
        for (Equipo e : competencia.getEquipos()) {
            for (Competidor c : e.getCompetidores()) { // estructura anidada
                if (c.getNombre().equalsIgnoreCase(nombre)) {
                    return c;
                }
            }
        }
        return null;
    }

    // Sobrecarga: buscar por ranking
    public Competidor buscarCompetidor(int ranking) {
        for (Equipo e : competencia.getEquipos()) {
            for (Competidor c : e.getCompetidores()) { // estructura anidada
                if (c.getRankingMundial() == ranking) {
                    return c;
                }
            }
        }
        return null;
    }

    // Buscar equipo por nombre
    private Equipo buscarEquipo(String nombre) {
        for (Equipo e : competencia.getEquipos()) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
}