/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferrete;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ferrete {

    /**
     * @param args the command line arguments
     * Debemos hacer una serie de aplicaciones para este negocio
    35- Las lámparas están al mismo precio de $35 pesos final. 
    A. Si compra 6 o más lamparitas bajo consumo tiene un descuento del 50%. 
    B. Si compra 5 lamparitas bajo consumo marca "ArgentinaLuz" se hace un descuento
    * del 40 % y si es de otra marca el descuento es del 30%. 
    C. Si compra 4 lamparitas bajo consumo marca "ArgentinaLuz" o “FelipeLamparas” 
    * se hace un descuento del 25 % y si es de otra marca el descuento es del 20%. 
    D. Si compra 3 lamparitas bajo consumo marca "ArgentinaLuz" el descuento es del 
    * 15%, si es “FelipeLamparas” se hace un descuento del 10 % y si es de otra marca un 5%.
    * E. Si el importe final con descuento suma más de $120 se debe sumar un 10% de ingresos 
    * brutos en informar del impuesto con el siguiente mensaje:”IIBB Usted pago X”, 
    * siendo X el impuesto que se pagó.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String marca;
        int cantidad;
        int precio = 35;
        int precioFinal;
        double precioDesc = (double)0;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de lamparas a comprar: ");
        cantidad = mysc.nextInt();
        
        System.out.println("Ingrese la marca de las lamparas: ");
        marca = mysc.next();
        
        precioFinal = cantidad * precio;
        
        if(cantidad >=6)
        {   
            precioDesc = (int)(precioFinal * 0.5);            
        }else
        {
            if(cantidad == 5)
            {
                if(marca.equals(""))
            }
        }
        
        
        
        
        
        System.out.println("Debe pagar"+precioDesc);
        
        /*switch(cantidad)
        {
            case 6:
                
        }*/
    }
    
}
