package com.bootcamp.curso.principal.clases;

/**
 *
 * @author Felipe Cuevas
 */
public class Relator extends Persona{
    private String profesion;
    private Double sueldo;
    
    public Relator(){
        super();
        setProfesion();
        setSueldo();
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion() {
        System.out.println("Ingrese la profesion: ");
        profesion = leer.nextLine();
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo() {
        System.out.println("Ingrese el sueldo: ");
        sueldo = leer.nextDouble();
    }
    
    
}
