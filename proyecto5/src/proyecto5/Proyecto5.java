/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto5 {

    /**
     * @param args the command line arguments
     * se necesita pedir 2 numeros y sumarlos, mostrar el resultado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Estoy en el ejercicio 5");
        int num1;
        int num2;
        int suma;
        
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = miScanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = miScanner.nextInt();
        suma = num1 + num2;
        System.out.println("La suma es: "+suma);
        
        
    }
    
}
