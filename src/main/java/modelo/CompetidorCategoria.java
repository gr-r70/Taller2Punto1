package modelo;
import java.util.List;

public class CompetidorCategoria extends Competidor {
    private String categoria;

    public CompetidorCategoria(String nombre, int edad, String pais,
            int rankingMundial, double estatura, double peso, String categoria) {
        super(nombre, edad, pais, rankingMundial, estatura, peso, 0);
        this.categoria = categoria;
    }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    @Override
    public String toString() {
        return super.toString() + " | Categoría: " + categoria + " | Tipo: Categoria";
    }

    public String obtenerDatos(boolean mostrarCategoria) {
        if (mostrarCategoria) {
            return obtenerDatos() + " | Categoría: " + categoria;
        }
        return obtenerDatos();
    }

    public String obtenerDatos(List<CompetidorCategoria> lista, String paisFiltro) {
        String resultado = "Competidores de " + paisFiltro + ":\n";
        for (CompetidorCategoria c : lista) {
            if (c.getPais().equalsIgnoreCase(paisFiltro)) {
                for (int i = 0; i < c.getPuntos(); i += 10) {
                    resultado += "  * Punto acumulado: " + i + "\n";
                }
                resultado += c.toString() + "\n";
            }
        }
        return resultado;
    }
}