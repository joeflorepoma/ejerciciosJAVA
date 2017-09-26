/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto19if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto19if {

    /**
     * @param args the command line arguments
     * se ingresa un importe, si supera los 100 pesos se  le suma un 
     * impuesto del 23%, si no se les descuenta el 50%
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double importe;
        double precioF;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("Ingrese el importe: ");
        importe = misc.nextDouble();
        
        if(importe < 101)
        {
            precioF = importe * 0.5;
            
            System.out.println("El importe final es: "+precioF);
        }else{
            precioF = importe *1.23;
            System.out.println("El importe final es:  "+precioF );
        }
        
    }
    
}
