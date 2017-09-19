/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese numero: ");
        num1 = miScanner.nextInt();
        System.out.println("El numero ingresado es: " + num1);
    }
    
}
