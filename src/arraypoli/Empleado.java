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
public class Empleado extends Persona{
    private String cargo;
    private int sueldo;
    private int horas;
    public Empleado(String nombre, String apellido, int edad, String dni, String cargo, int horas){
        super(nombre,apellido,edad,dni);
        this.cargo = cargo;
        this.horas=horas;
        generarSueldo();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Nombre: "+ this.getNombre() + " Apellido: "+ this.getApellido() + "Cargo: " + this.cargo+ "Sueldo:" +this.sueldo ;

    }
   public void generarSueldo(){
       this.sueldo = horas*10;
   }
}
