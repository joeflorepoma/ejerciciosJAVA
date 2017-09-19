/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto6 {

    /**
     * @param args the command line arguments
     * se piden 3 y se informa el promedio
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        int num3;
        float promedio;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese numero 1: ");
        num1 = miScanner.nextInt();
        System.out.println("Ingrese numero 2: ");
        num2 = miScanner.nextInt();
        System.out.println("Ingrese numero 3: ");
        num3 = miScanner.nextInt();
        
        promedio = (num1 + num2 + num3)/3;
        
        System.out.println("El promedio es: "+promedio);
        
    }
    
}
