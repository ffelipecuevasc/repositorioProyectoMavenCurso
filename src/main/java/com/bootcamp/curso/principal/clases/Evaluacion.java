package com.bootcamp.curso.principal.clases;
import com.bootcamp.curso.principal.interfaces.IProyecto;
/**
 *
 * @author Felipe Cuevas
 */
public class Evaluacion implements IProyecto{
    private Double nota;
    
    public Evaluacion(){
        setNota();
    }

    public Double getNota() {
        return nota;
    }

    public void setNota() {
        System.out.println("Ingrese la nota: ");
        nota = leer.nextDouble();
    }
    
    public Boolean validarNota(Double n){
        Boolean validacion = false;
        
        return validacion;
    }
}
