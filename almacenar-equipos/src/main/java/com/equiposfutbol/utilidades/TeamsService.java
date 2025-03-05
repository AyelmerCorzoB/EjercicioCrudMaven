package com.equiposfutbol.utilidades;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TeamsService {
    private static final String FILE_PATH = "Teams.json";
    private Map<Integer, Teams> equipos;
    private ObjectMapper objectMapper;

    public TeamsService() {
        objectMapper = new ObjectMapper();
        equipos = cargarTeams();
    }

    // 🔹 Cargar Equipos desde JSON
    private Map<Integer, Teams> cargarTeams() {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) return new HashMap<>();
            return objectMapper.readValue(file, new TypeReference<Map<Integer, Teams>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }

    // 🔹 Guardar la lista en JSON
    private void guardarEquipo() {
        try {
            objectMapper.writeValue(new File(FILE_PATH), equipos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 🔹 Crear un nuevo Equipo
    public void crearTeam(String nombre, String ciudad, String fechaFundacion, String nombrePresidente,List<Players> jugadores) {
        int id = (equipos.isEmpty()) ? 1 : equipos.keySet().stream().max(Integer::compare).orElse(0) + 1;
        Teams nuevoTeam = new Teams(nombre,ciudad,fechaFundacion,nombrePresidente,jugadores);
        equipos.put(id, nuevoTeam);
        guardarEquipo();
        System.out.println("✅ Equipo agregado con ID: " + id);
    }

    // 🔹 Leer todos las Equipos
    public void listarTeams() {
        if (equipos.isEmpty()) {
            System.out.println("📂 No hay Equipos disponibles.");
            return;
        }
    
        equipos.forEach((id, team) -> {
            String lista = String.format("| ID: %s | Nombre: %s | Ciudad: %s | Presidente: %s | Fecha Creacion: %s |", id, team.getNombre(),team.getCiudad(),team.getNombrePresidente(),team.getFechaFundacion());
            System.out.println("------------------------------------------------------");
            System.out.println(lista);
            System.out.println("------------------------------------------------------");
        });
    }

    // 🔹 Buscar un Equipo por ID
    public Teams buscarTeam(int id) {
        return equipos.get(id);
    }

    // 🔹 Actualizar un Equipo
    public void actualizarTeam(int id, String nombre, String ciudad, String fechaFundacion, String nombrePresidente) {
        if (equipos.containsKey(id)) {
            Teams equipo = equipos.get(id);
            equipo.setNombre(nombre);
            equipo.setCiudad(ciudad);
            equipo.setFechaFundacion(fechaFundacion);
            equipo.setNombrePresidente(nombrePresidente);

            guardarEquipo();
            System.out.println("✅ Equipo actualizada.");
        } else {
            System.out.println("⚠️ Equipo no encontrada.");
        }
    }

    // 🔹 Eliminar un Equipo
    public void eliminarTeam(int id) {
        if (equipos.remove(id) != null) {
            guardarEquipo();
            System.out.println("🗑 Equipo eliminada.");
        } else {
            System.out.println("⚠️ Equipo no encontrada.");
        }
    }
}
