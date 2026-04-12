package main;

import controlador.CompetenciaControlador;
import modelo.CompetidorCategoria;
import modelo.CompetidorProfesional;
import vista.CompetenciaVista;

public class Taller2Punto1 {
    public static void main(String[] args) {

        // ===== LÓGICA CON LAS 2 SUBCLASES (requisito h) =====
        CompetidorCategoria c1 = new CompetidorCategoria(
            "Carlos Ramirez", 22, "Colombia", 5, 1.75, 68.0, "Sub-23");

        CompetidorProfesional c2 = new CompetidorProfesional(
            "Julian Alaphilippe", 31, "Francia", 2, 1.73, 62.0, 8);

        // Desplegar la cadena del toString() de cada subclase
        System.out.println("=== SUBCLASE 1: CompetidorCategoria ===");
        System.out.println(c1.toString());
        System.out.println(c1.obtenerDatos());

        System.out.println("\n=== SUBCLASE 2: CompetidorProfesional ===");
        System.out.println(c2.toString());
        System.out.println(c2.obtenerDatos());

        // ===== INICIO DEL PROGRAMA =====
        CompetenciaVista vista = new CompetenciaVista();
        CompetenciaControlador controlador = new CompetenciaControlador(vista);
        controlador.iniciar();
    }
}