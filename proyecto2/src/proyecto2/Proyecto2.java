/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     * se debe pedir un nombre y se debe mostrar el mismo nombre
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombres;
        
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        nombres = miScanner.nextLine();
        System.out.println("El nombre es: " + nombres);
    }
    
}
