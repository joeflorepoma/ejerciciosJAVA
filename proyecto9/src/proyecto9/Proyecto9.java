/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto9 {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad y precio de un producto y se informa el total a pagar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux;
        Integer cantidad;
        double  precio;
        double precioFinal;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad: ");
        datoAux = miScanner.next();
        cantidad = Integer.parseInt(datoAux);
        
        System.out.println("Ingrese precio: ");
        datoAux = miScanner.next();
        precio = Double.parseDouble(datoAux);
        
        precioFinal = cantidad * precio;
        
        System.out.println("El total a pagar es: "+ precioFinal);
        
        
        
    }
    
}
