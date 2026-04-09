package modelo;
import java.util.List;
public class CompetidorProfesional extends Competidor {
    private String equipo;
    private int aniosProfesional;

    public CompetidorProfesional(String nombre, int edad, String pais,
            int rankingMundial, double estatura, double peso,
            String equipo, int aniosProfesional) {
        super(nombre, edad, pais, rankingMundial, estatura, peso, 0);
        this.equipo = equipo;
        this.aniosProfesional = aniosProfesional;
    }

    public String getEquipo() { return equipo; }
    public void setEquipo(String equipo) { this.equipo = equipo; }
    public int getAniosProfesional() { return aniosProfesional; }
    public void setAniosProfesional(int aniosProfesional) { this.aniosProfesional = aniosProfesional; }

    // Sobreescritura con super
    @Override
    public String toString() {
        return super.toString() + " | Equipo: " + equipo
             + " | Años profesional: " + aniosProfesional + " | Tipo: Profesional";
    }

    // Sobrecarga 1 - simple
    public String obtenerDatos(String etiqueta) {
        return "[" + etiqueta + "] " + obtenerDatos();
    }

    // Sobrecarga 2 - con estructura anidada
    public String obtenerDatos(List<CompetidorProfesional> lista, int rankingLimite) {
        String resultado = "Profesionales con ranking mejor a " + rankingLimite + ":\n";
        for (CompetidorProfesional c : lista) {              // bucle exterior
            if (c.getRankingMundial() <= rankingLimite) {
                for (int i = 1; i <= c.getAniosProfesional(); i++) { // bucle interior
                    resultado += "  Año " + i + " de experiencia\n";
                }
                resultado += c.toString() + "\n";
            }
        }
        return resultado;
    }
}