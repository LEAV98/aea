/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypoli;

/**
 *
 * @author LUIS AVILA
 */
public class Docente extends Persona{
    private String curso;
    private int sueldo;
    private int horas;
    
    public Docente (String nombre, String apellido, int edad, String dni, String curso, int horas){
        super(nombre,apellido,edad,dni);
        this.curso= curso;
        this.horas = horas;
        generarSueldo();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre: "+ this.getNombre()+"Apellido: "+ this.getApellido() + "curso=" + curso + ", sueldo=" + sueldo +  "Sueldo:" +this.sueldo+'}';
    }

    @Override
    public void generarSueldo() {
        
       this.sueldo = horas*30;
    }
    
}
