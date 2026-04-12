package vista;

import javax.swing.JOptionPane;

public class CompetenciaVista {

    public int menuInicio() {
        String menu = """
                      MUNDIAL DE CICLISMO DE PISTA - CALI
                      
                      1. Agregar Equipo
                      2. Agregar Competidor
                      3. Ver Reporte General
                      4. Actualizar Ranking
                      5. Buscar Competidor
                      6. Salir
                      
                      Elige una opción:
                      """;
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    public String pedirNombreEquipo() {
        return JOptionPane.showInputDialog("Ingrese el nombre del equipo:");
    }
    public String pedirNombreCompetidor() {
        return JOptionPane.showInputDialog("Ingrese el nombre del participante:");
    }
    public String pedirPais() {
        return JOptionPane.showInputDialog("Ingrese el país:");
    }
    public int pedirEdad() {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
    }
    public int pedirRanking() {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ranking mundial:"));
    }
    public double pedirEstatura() {
        return Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura (Ej: 1.70m):"));
    }
    public double pedirPeso() {
        return Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso (kg):"));
    }
    public String pedirCategoria() {
        return JOptionPane.showInputDialog("Ingrese la categoría (ej: Sub-23):");
    }
public int pedirAnios() {
    return Integer.parseInt(JOptionPane.showInputDialog(
        "¿Cuántos años lleva de profesional?\n(Si es amateur ingrese 0):"));
    }
    public int pedirPuntos() {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos obtenidos:"));
    }
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}