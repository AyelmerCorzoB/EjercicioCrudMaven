package com.equiposfutbol.utilidades;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class Teams {

    private static final long serialVersionUID = 1L;

    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("ciudad")
    private String ciudad;
    @JsonProperty("fechaFundacion")
    private String fechaFundacion;
    @JsonProperty("nombrePresidente")
    private String nombrePresidente;
    @JsonProperty("jugadores")
    private List<Players> jugadores;
    public Teams(String nombre, String ciudad, String fechaFundacion, String nombrePresidente,List<Players> jugadores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaFundacion = fechaFundacion;
        this.nombrePresidente = nombrePresidente;
        this.jugadores = jugadores;
    }

    public Teams() {
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

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    public List<Players> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Players> jugadores) {
        this.jugadores = jugadores;
    }

   

    @Override
    public String toString() {
        return "Equipo {" + 
                "Nombre: " + nombre + '\'' +
                "Ciudad: " + ciudad + '\'' +
                "Fecha Fundacion: " + fechaFundacion + '\'' +
                "Nombre del presidente: " + nombrePresidente + '\'' +
                "Jugadores: " + jugadores;
    }

}
