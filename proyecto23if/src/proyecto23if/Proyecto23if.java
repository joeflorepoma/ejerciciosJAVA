/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto23if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto23if {

    /**
     * @param args the command line arguments
     * Debemos pedir el ancho y el largo de un terreno e informar cuantos metros
     * de alambre necesitamos para dar tres (3) vueltas de alambre.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ancho;
        int largo;
        int perimetro;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Ingrese el ancho:");
        ancho = mysc.nextInt();
        
        System.out.println("Ingrese el largo:");
        largo = mysc.nextInt();
        
        perimetro = 3*(2*(ancho + largo));
        
        System.out.println("El alambre necesario para 3 vueltas es: "+perimetro+" metros.");
        
    }
    
}
