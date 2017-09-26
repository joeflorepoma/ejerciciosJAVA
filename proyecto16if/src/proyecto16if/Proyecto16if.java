/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto16if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto16if {

    /**
     * @param args the command line arguments
     * Se debe ingresar un edad  e  informar si es mayor de edad o no.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Edad;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        Edad = mysc.nextInt();
        
        if(Edad > 17)
        {
            System.out.println("Es mayor de edad");
        }
        
    }
    
}
