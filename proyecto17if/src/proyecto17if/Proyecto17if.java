/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto17if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto17if {

    /**
     * @param args the command line arguments
     * Se pide una edad y se informa si es niño adolescente o mayor de edad
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        edad = mysc.nextInt();
        
        if(edad>17)
        {
            System.out.println("Es mayor");
        }else{
                    
                if(edad<13)
                {
                    System.out.println("Es niño");
                }else
                {
                    System.out.println("Es adolescente");
                }
        
             }
        
        /*if(Edad > 17)
        {   
            System.out.println("Es mayor de edad");
            
        }else{
            
            if(Edad < 18 && Edad > 12)
            {
                System.out.println("Es adolescente");
            }else{
            
                if(Edad < 13)
                {
                    System.out.println("Es niño");
                }
            }
            
        }*/
            
            
            
    }
    
}
