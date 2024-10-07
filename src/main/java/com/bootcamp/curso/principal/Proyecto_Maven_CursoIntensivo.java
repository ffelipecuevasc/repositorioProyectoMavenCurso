package com.bootcamp.curso.principal;

import com.bootcamp.curso.principal.interfaces.IProyecto;
import com.bootcamp.curso.principal.clases.*;
import java.util.ArrayList;

/**
 *
 * @author ffeli
 */
public class Proyecto_Maven_CursoIntensivo implements IProyecto {

    private static ArrayList<CursoIntensivo> curso = new ArrayList<CursoIntensivo>();

    public static void main(String[] args) {
        int op = 0;
        try {
            do {
                System.out.println("MENU - CURSOS INTENSIVOS");
                System.out.println("------------------------");
                System.out.println("1) Ingresar un nuevo curso intensivo.");
                System.out.println("2) Mostrar todos los relatores con sus sueldos.");
                System.out.println("3) Mostrar la SF de cada alumno de un curso especifico.");
                System.out.println("4) Buscar un alumno por RUN en un curso especifico.");
                System.out.println("5) Eliminar un alumno por RUN en un curso especifico.");
                System.out.println("6) Exportar toda la informacion a un fichero.");
                System.out.println("7) Salir.");
                System.out.println("------------------------");
                System.out.println("Ingrese su opcion: ");
                op = leer.nextInt();
                leer.nextLine();
                switch (op) {
                    case 1:
                        CursoIntensivo c = new CursoIntensivo();
                        Proyecto_Maven_CursoIntensivo.curso.add(c);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        System.out.println("Finalizando el algoritmo.");
                        break;
                    default:
                        System.err.println("Opcion inválida.");
                        break;
                }
            } while (op < 7);
        } catch (Exception e) {
            System.err.println("Error de la aplicacion: " + e.getMessage());
        }
    }
}
