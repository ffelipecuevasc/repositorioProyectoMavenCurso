package com.bootcamp.curso.principal.clases;
import java.util.ArrayList;
/**
 *
 * @author Felipe Cuevas
 */
public class Alumno extends Persona{
    private Integer asistencia;
    private ArrayList <Evaluacion> evaluaciones;
    
    public Alumno(){
        super();
        
    }

    public Integer getAsistencia() {
        return asistencia;
    }

    public void setAsistencia() {
        System.out.println("Ingrese la asistencia: ");
        asistencia = leer.nextInt(); leer.nextLine();
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones() {
        Evaluacion e = new Evaluacion();
        evaluaciones.add(e);
    }
    
    
}
