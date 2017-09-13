/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouno;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerciciouno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        int suma;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un numero: ");
        numero1=miScanner.nextInt();
        System.out.println("el numero es: " +  numero1);
        
        System.out.println("Por favor ingrese el 2do numero: ");
        numero2=miScanner.nextInt();
        System.out.println("el numero es: " +  numero2);
        
        suma = numero1 + numero2;
        
        System.out.println("la suma es: " + suma);
        
                
        
        
    
           
    }
    
}
