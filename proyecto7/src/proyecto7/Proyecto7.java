/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto7 {

    /**
     * @param args the command line arguments
     * se pide la base de un cuadrado y se informa el perimetro
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base;
        int perimetro;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese la base del cuadrado: ");
        base = miScanner.nextInt();
        perimetro = base * 4;
        System.out.println("El perimetro es: "+ perimetro+ " metros");
    }
    
}
