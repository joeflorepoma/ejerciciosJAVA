/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13ejercioif;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Main {

    /**
     * @param args the command line arguments
     * 13- Se ingresa un color y una localidad, si es avellaneda o 
     * Lanús y el color es rojo, mostrar el mensaje “sos de independiente”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Localidad;
        String Color;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("Ingrese color favorito: ");
        Color = misc.next();
        
        System.out.println("Ingrese localidad: ");
        Localidad = misc.next();
       
        if(Color.equals("rojo"))
        {
            if(Localidad.equals("lanus")||Localidad.equals("avellaneda"))
            {
                System.out.println("Sos de independiente!!");
            }
        }
        
    }
    
}
