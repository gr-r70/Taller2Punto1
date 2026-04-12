
package modelo;

import java.util.ArrayList;
import java.util.List;


public class Competencia {
    private String nombreEvento;
    private List<Equipo> equipos;
    
    public Competencia (String nombreEvento)
    {    this.nombreEvento=nombreEvento;
        this.equipos=new ArrayList<>();}

    public String getNombreEvento() {return nombreEvento;}
    public void setNombreEvento(String nombreEvento) {this.nombreEvento = nombreEvento;}
    
    public List<Equipo> getEquipos() {return equipos;}
    public void setEquipos(List<Equipo> equipos) {this.equipos = equipos;}
    
    
    public void agregarEquipo(Equipo e){
        equipos.add(e);
    }
    public String generarReporte(){
        String reporte = "===== COMPETENCIA: " + nombreEvento + " =====\n\n";
        for (Equipo e : equipos) {
            reporte += e.obtenerDatosEquipo();
            reporte += "------------------------------\n";
        }
        return reporte;
        
    }
}
