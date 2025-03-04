package com.equiposfutbol;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.equiposfutbol.utilidades.Equipos;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        // String nombre,String ciudad, int fechaFundacion,String nombrePresidente
        Scanner sc = 
        Equipos equipo = new Equipos("Carlos", 30,"ana@gmail.com");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("persona.json"), persona);
            System.out.println("Objeto guardado en JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}