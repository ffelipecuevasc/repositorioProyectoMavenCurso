package com.bootcamp.curso.principal.clases;
import com.bootcamp.curso.principal.interfaces.IProyecto;
import java.util.ArrayList;
/**
 *
 * @author Felipe Cuevas
 */
public class CursoIntensivo implements IProyecto{
    private Integer codigo, asistenciaMinima;
    private String nombre;
    private Relator relator;
    private ArrayList<Alumno> curso;
    
    public CursoIntensivo(){
        setCodigo();
        setNombre();
        setAsistenciaMinima();
        setRelator();
        setCurso();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        System.out.println("Ingrese el codigo del curso: ");
        codigo = leer.nextInt(); leer.nextLine();
    }

    public Integer getAsistenciaMinima() {
        return asistenciaMinima;
    }

    public void setAsistenciaMinima() {
        System.out.println("Ingrese la asistencia minima del curso: ");
        asistenciaMinima = leer.nextInt(); leer.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.println("Ingrese el nombre del curso: ");
        nombre = leer.nextLine();
    }

    public Relator getRelator() {
        return relator;
    }

    public void setRelator() {
        relator = new Relator();
    }

    public ArrayList<Alumno> getCurso() {
        return curso;
    }

    public void setCurso() {
        Alumno a = new Alumno();
        curso.add(a);
    }
    
    public void buscarAlumno(){
        
    }
    
    public void eliminarAlumno(){
        
    }
    
    public void mostrarSF(){
        
    }
}
