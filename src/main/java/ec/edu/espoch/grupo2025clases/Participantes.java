/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.grupo2025clases;

/**
 *
 * @author anthony
 */
public class Participantes {
    
    private String nombre;
    private String categoria;
    private String servicio;
    private String turno;

    public Participantes(String nombre, String categoria, String servicio, String turno) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.servicio = servicio;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getServicio() {
        return servicio;
    }

    public String getTurno() {
        return turno;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Categoría: " + categoria + ", Servicio: " + servicio + ", Turno: " + turno;
                
    }
    
}
