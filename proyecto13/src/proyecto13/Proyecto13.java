/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto13;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto13 {

    /**
     * @param args the command line arguments
     * se ingresa una edad y se informa si es mayor de edad
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String datoAux;
        Integer edad;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese edad: ");
        datoAux = miScanner.next();
        edad = Integer.parseInt(datoAux);
        
        if(edad >= 18)
        {
            System.out.println("\nEs mayor de edad.");
        }
        else{
            System.out.println("\nNo es mayor de edad.");
        }
        
    }
    
}
