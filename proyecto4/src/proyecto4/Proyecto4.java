/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto4 {

    /**
     * @param args the command line arguments
     * Se debe pedir el nombre y el apellido, luego mostrarlo
     * en el siguiente mensaje.
     * su nombres es xxx y xxx es su apellido.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        
        Scanner myscanner = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = myscanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = myscanner.nextLine();
        
        System.out.println("Su nombres es "+nombre+" y "+apellido+ " es su apellido");
        
        
        
    }
    
}
