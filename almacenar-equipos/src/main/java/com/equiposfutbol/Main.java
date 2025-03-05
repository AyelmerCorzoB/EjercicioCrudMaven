package com.equiposfutbol;

import java.util.ArrayList;
import java.util.Scanner;

import com.equiposfutbol.utilidades.*;

public class Main {
    public static void main(String[] args) {
        TeamsService servicio = new TeamsService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("GESTIÓN DE EQUIPOS");
            System.out.println("1. Agregar equipo");
            System.out.println("2. Listar equipos");
            System.out.println("3. Actualizar equipo");
            System.out.println("4. Eliminar equipo");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ciudad que representa: ");
                    String ciudad = scanner.nextLine();
                    System.out.print("Fecha en que se Fundo: ");
                    String fechaFundacion = scanner.nextLine();
                    System.out.print("Nombre del presidente: ");
                    String nombrePresidente = scanner.nextLine();

                    ArrayList<Players> jugadores = new ArrayList<>();
                    System.out.println("Cuantos jugadores va a agregar (min-5): ");
                    int cantidadJugadores = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < cantidadJugadores; i++) {
                        System.out.println("Edad del jugador " + i +": ");
                        int edad = scanner.nextInt(); 
                        System.out.println("Dorsal del jugador " + i +": ");
                        int dorsal =scanner.nextInt();
                        System.out.println("Nombre del jugador " + i +": ");
                        String nombreJugador = scanner.nextLine();
                        System.out.println("Nacionalidad del jugador " + i +": ");
                        String nacionalidad = scanner.nextLine();
                        

                        jugadores.add(new Players(nombreJugador,nacionalidad,edad,dorsal));
                    }
                    servicio.crearTeam(nombre, ciudad, fechaFundacion, nombrePresidente,jugadores);
                    break;

                case 2:
                    servicio.listarTeams();
                    break;

                case 3:
                    System.out.print("ID de la equipo a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nuevo Ciudad a la que representa: ");
                    String nuevoCiudad = scanner.nextLine();
                    System.out.print("Correccion de fecha: ");
                    String nuevofechaFundacion = scanner.nextLine();
                    System.out.print("Nuevo Presidente(Nombre): ");
                    String nuevoNombrePresidente = scanner.nextLine();
                    servicio.actualizarTeam(idActualizar, nuevoNombre, nuevoCiudad, nuevofechaFundacion,nuevoNombrePresidente);
                    break;

                case 4:
                    System.out.print("ID de la equipo a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    servicio.eliminarTeam(idEliminar);
                    break;

                case 5:
                    System.out.println("👋 Saliendo del sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("⚠️ Opción no válida.");
            }
        }
    }
}