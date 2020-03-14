/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypoli;

import java.util.Scanner;

/**
 *
 * @author LUIS AVILA
 */
public class Sistema {
    public static void main(String [] args){
        Scanner entrada = new Scanner("System.in");
       try{
        try {
            int indice =0;
        int contador=0;
        Persona p[]= new Persona[4];
        int il = 120;
        System.out.println("Bienvenidos al registro de  personas");
        System.out.println("LA edad de Luis es: " + il);
        
        MisExcepciones.ValidarNumero(il);
            p[indice]=new AlumnoPregado("Luis", "Enrique", il, "76955812", "18200057", "Ing Sistemas");indice++;
            p[indice]= new Docente("Jorge", "ZAvaleta", 43, "21212", "poo", 32);indice++;
            p[indice]= new Empleado("Juana","Vilca",32, "866565", "Seretaria",21);indice++;
            for(int i=0; i < indice;i++){
                System.out.println(p[i]);
//                if(p[i] instanceof AlumnoPregado){
//                    System.out.println(p[i].toString());
//                }
//                if(p[i] instanceof Docente){
//                    System.out.println(p[i].toString());
//                }
//                if(p[i] instanceof Empleado){
//                    System.out.println(p[i].toString());
//                }
            }
            System.out.println("Buscando a luis en el registro:");
        String nombre = "Luis";
        for(int i=0; i< indice; i++){
            if(nombre.equals(p[i].getNombre())){
                 if(p[i] instanceof AlumnoPregado){
                    System.out.println(p[i].toString());
                }
                if(p[i] instanceof Docente){
                    System.out.println(p[i].toString());
                }
                if(p[i] instanceof Empleado){
                    System.out.println(p[i].toString());
                }
                break;
            }
        }
        
        }
        catch(MisExcepciones e){
                System.out.println(e.getMessage());
              //throw e;
                }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
    catch(Exception e){
            System.out.println("Habil te crees causa");
}

    }
}
