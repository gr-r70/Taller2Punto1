package main;

import controlador.CompetenciaControlador;
import vista.CompetenciaVista;

public class Taller2Punto1 {
    public static void main(String[] args) {
        CompetenciaVista vista = new CompetenciaVista();
        CompetenciaControlador controlador = new CompetenciaControlador(vista);
        controlador.iniciar();
    }
}