package com.bootcamp.curso.principal.clases;
import com.bootcamp.curso.principal.interfaces.IProyecto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Felipe Cuevas
 */
public class Persona implements IProyecto{
    protected String run, nombre;
    protected Date fechaN;
    protected SimpleDateFormat formato;
    protected Calendar gestionFecha;
    
    public Persona(){
        formato = new SimpleDateFormat("dd/MM/yyyy");
        gestionFecha = Calendar.getInstance();
        setRun();
        setNombre();
        setFechaN();
    }

    public String getRun() {
        return run;
    }

    public void setRun() {
        System.out.println("Ingrese el RUN: ");
        run = leer.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.println("Ingrese el nombre: ");
        nombre = leer.nextLine();
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN() {
        try{
            System.out.println("Ingrese la fecha de nacimiento (formato '01/01/2000'): ");
            fechaN = formato.parse(leer.nextLine());
            gestionFecha.setTime(fechaN);
        }catch(ParseException e){
            System.err.println("Error en el formato de fecha: " + e.getMessage());
        }
    }
    
    
}
