/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Competidor {
    private String nombre;
    private int edad;
    private String pais; 
    private int rankingMundial;
    private double estatura;
    private double peso;
    private int puntos;
    
    public Competidor(String nombre, int edad,String pais,int rankingMundial ,double estatura ,double peso, int puntos)
    {  this.nombre=nombre;
       this.edad=edad;
       this.pais=pais;
       this.rankingMundial=rankingMundial;
       this.estatura=estatura;
       this.peso=peso;
       this.puntos=puntos;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public String getPais() {return pais;}
    public void setPais(String pais) {this.pais = pais;}

    public int getRankingMundial() {return rankingMundial;}
    public void setRankingMundial(int rankingMundial) {this.rankingMundial = rankingMundial;}

    public double getEstatura() {return estatura;}
    public void setEstatura(double estatura) {this.estatura = estatura;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

    public int getPuntos() {return puntos;}
    public void setPuntos(int puntos) {this.puntos = puntos;}
    
    
}
