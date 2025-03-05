package com.equiposfutbol.utilidades;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Players {
    private static final long serialVersionUID = 1L;

    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("nacionalidad")
    private String nacionalidad;
    @JsonProperty("edad")
    private int edad;
    @JsonProperty("dorsal")
    private int dorsal;

    public Players(String nombre, String nacionalidad, int edad, int dorsal) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.dorsal = dorsal;
    }

    public Players() {
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

    public String getnacionalidad() {
        return nacionalidad;
    }

    public void setnacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " | nacionalidad: " + nacionalidad + " | Edad: " + edad + " | Nombre del presidente " + dorsal;
    }
}
