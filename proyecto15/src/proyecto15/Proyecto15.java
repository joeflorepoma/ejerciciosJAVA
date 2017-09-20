/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto15;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto15 {

    /**
     * @param args the command line arguments
     * se ingresa un importe si supera los 100 pesos se le suma un 23%, si es 
     * menor a 100 pesos se le descuenta el 50%
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double importe;
        double importeFinal;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("ingrese importe");
        importe = misc.nextDouble();
        
        if(importe > 100)
        {
            importeFinal = importe * 1.23;
            System.out.println("El importe final es: "+importeFinal+" pesos.");
        }
        if(importe <= 100)
        {
            importeFinal = importe * 0.50;
            System.out.println("El importe final es: "+importeFinal+" pesos.");
        }
    }
    
}
