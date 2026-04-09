package modelo;

import java.util.ArrayList;
import java.util.List; 
public class Equipo {
    private String nombre;
    private String pais;
    private List<Competidor> competidores; // ← así se declara

    public Equipo (String nombre, String pais) 
    {   this.nombre = nombre;
        this.pais = pais;
        this.competidores = new ArrayList<>();}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getPais() {return pais;}
    public void setPais(String pais) {this.pais = pais;}

    public List<Competidor> getCompetidores() {return competidores;}
    public void setCompetidores(List<Competidor> competidores) {this.competidores = competidores;}

    
    
    public void agregarCompetidor(Competidor c) {
        competidores.add(c);
    }
    
    public String obtenerDatosEquipo(){
        String datos = "Equipo: " + nombre + " | País: " + pais + "\n";
        datos += "Competidores:\n";
        for (Competidor c : competidores) {
            datos += c.obtenerDatos() + "\n";
        }
        return datos;     
    }
    @Override
    public String toString() {
        return "Equipo: " + nombre + " | País: " + pais;
    }
}