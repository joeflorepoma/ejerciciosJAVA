/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg12;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto12 {

    /**
     * @param args the command line arguments
     * se ingresa el importe de un producto importado y se le debe agregar 
     * el 35% de impuestos internos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double producto;
        double impuesto;
        double precioFinal;
       // String datoAux;
        Scanner miScanner = new Scanner(System.in);
               
        System.out.println("Ingrese el importe del producto importado: ");
        producto = miScanner.nextDouble();
        
        impuesto = producto * 0.35;
        precioFinal = producto + impuesto;
        
        System.out.println("El precio final sera: "+precioFinal);
        
        
    }
    
}
