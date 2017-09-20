/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     * se pide una edad y se informa si es niño, adolescente o mayor de edad
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("Ingrese la edad: ");
        edad = misc.nextInt();
        
        if(edad>17)
        {
            System.out.println("Es mayor");
        }else{
                    
                if(edad<13)
                {
                    System.out.println("Es niño");
                }else
                {
                    System.out.println("Es adolescente");
                }
        
             }
        
        /*if(edad >= 0 && edad <= 12)
        {
            System.out.println("niño");
        }
        
        if(edad >= 13 && edad < 18)
        {
            System.out.println("adolescente");      
        }
        
        if(edad >= 18)
        {
            System.out.println("mayor");
        }*/
    }   

    
}
