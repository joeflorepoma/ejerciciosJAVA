/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto24if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto24if {

    /**
     * @param args the command line arguments
     * Debemos pedir el ancho, el largo de un terreno y la cantidad de hilos de 
     * alambre e informar cuantos metros de alambre necesitamos para 
     * completar las vueltas de alambre.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ancho;
        int largo;
        int alambre;
        int perimetro;
        int completar;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Ingrese el ancho:");
        ancho = mysc.nextInt();
        
        System.out.println("Ingrese el largo:");
        largo = mysc.nextInt();
        
        perimetro = 3*(2*(ancho + largo));
        
        System.out.println("Ingrese la cantida de alambre:");
        alambre = mysc.nextInt();
        
        completar = perimetro - alambre;
        
        System.out.println("Se necesitan aun "+completar+" metros de alambre para completar las vueltas.");
    }
    
}
