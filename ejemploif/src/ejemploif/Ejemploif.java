/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejemploif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Nombre;
        String Clave;
        String Sexo;
        String Localidad;
        String Color;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("Ingrese nombres: ");
        Nombre = misc.next();
        
        System.out.println("Ingrese clave: ");
        Clave = misc.next();
        
        System.out.println("Ingrese sexo: ");
        Sexo =  misc.next();
        //ingresa m para masculino, f para femenino
        
        System.out.println("Ingrese localidad: ");
        Localidad = misc.next();
        
        System.out.println("Ingrese color favorito: ");
        Color = misc.next();
        
        /**
         * 1si es masculino que viva en lanus o avellaneda y que su color favorito
         * sea el rojo, mostrar el mensaje "sos de independiente"
         * 2si el nombre es "andrea", la localidad es moron y el color favorito
         * es "verde" u "azul", se le pone el mensaje "feliz primavera.
         */
        
        if(Sexo.equals("m")&&Color.equals("rojo"))
        {
            if(Localidad.equals("lanus")||Localidad.equals("avellaneda"))
            {
                System.out.println("Sos de independiente");
            }
        }
        
        if(Nombre.equals("andrea")&&Localidad.equals("moron"))
        {
            if(Color.equals("verde")||Color.equals("azul"))
            {
                System.out.println("Feliz Primavera!!");
            }
        }
        /*
        if(Color.equals("celeste") || Color.equals("blanco"))
        {
            System.out.println("Sos un patriota!!");
        }
        
        if(Localidad.equals("lanus") && Sexo.equals("f"))
        {
            System.out.println("Bienvenida chica de lanus");
        }  
        
        if(Sexo.equals("f"))
        {
            System.out.println("Feliz dia de la mujer!!");
            
//            if(Localidad.equals("lanus"))
//                {
//                    System.out.println("Bienvenida chica de lanus");
//                }
        }
        
        if(Nombre.equals("admin"))
        {
            System.out.println("\nBienvenido administrador.");
        }
        else
        {
            System.out.println("Bienvenido "+ Nombre);
        }
        */
        
        
        
        
    }
    
}
