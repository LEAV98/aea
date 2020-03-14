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
public class AlumnoPregado extends Persona{
    private String codigo;
    private String carrera;
    private int sueldo;
    public AlumnoPregado (String nombre, String apellido , int edad,String dni, String codigo, String carrera){
        super(nombre,apellido,edad,dni);
        this.codigo = codigo;
        this.carrera = carrera;
        generarSueldo();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Nombre:  " + this.getNombre() + "Apellido: "+ this.getApellido()+"codigo=" + codigo + ", carrera=" + carrera + "Sueldo:" +this.sueldo+'}';
    }
    public void generarSueldo(){
        this.sueldo = 0;
        System.out.println("El no tiene sueldo pe krnal :v");
    }
}
