package com.equiposfutbol.utilidades;

// 1. almacenar equipos de futbol(
// 	"nombre", 
// 	"ciudad que representa",
// 	"fecha de fundación", 
// 	"Presidente del equipo", 
// 	"Jugadores(
// 		"número de dorsal",
// 		"nombre del jugador ",
// 		"Ciudad",
// 		"edad",
// 		"dorsal)")
public class Equipos {
    private static final long serialVersionUID = 1L; 
    private String nombre;
    private String ciudad;
    private int fechaFundacion;
    private String nombrePresidente;
    public Equipos(String nombre,String ciudad, int fechaFundacion,String nombrePresidente) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaFundacion = fechaFundacion;
        this.nombrePresidente = nombrePresidente;
    }
    public Equipos() {
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public int getFechaFundacion() {
        return fechaFundacion;
    }
    public void setFechaFundacion(int fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }
    public String getNombrePresidente() {
        return nombrePresidente;
    }
    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }
    
}
