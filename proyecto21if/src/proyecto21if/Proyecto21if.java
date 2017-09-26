/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto21if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto21if {

    /**
     * @param args the command line arguments
     * se ingresa una nota, si es 10 mostrar excelente, si esta entre 9 y 4
     * mostrar aprobó, de lo contrario mostrar “la próxima será”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Ingrese nota: ");
        nota = mysc.nextInt();
        
        if(nota == 10)
        {
            System.out.println("Excelente");
        }
        else
        {
            if(nota < 10 && nota >3)
            {
                System.out.println("Aprobo");
            }
            
                else
                {
                    if(nota<4)
                    {
                        System.out.println("La proxima sera");
                    }
                }
            
            
        }
        
    }
    
}
