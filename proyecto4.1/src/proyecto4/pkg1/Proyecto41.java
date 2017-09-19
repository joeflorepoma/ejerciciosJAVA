/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4.pkg1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto41 {

    /**
     * @param args the command line arguments
     * Al ingresar una edad y el nombre de debe mostrar el siguiente mensaje:
     * usted se llama xxx y tiene xxx años de edad
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        
        Scanner miscanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = miscanner.nextLine();
        System.out.println("Ingrese edad: ");
        edad = miscanner.nextInt();
        System.out.println("Usted se llama "+ nombre+" y tiene "+ edad+ " años de edad.");
    }
    
}
