/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoswitch;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyectoswitch {

    /**
     * @param args the command line arguments
     * > 80 y viaja de vacaciones ponerle "vacunate contra la gripe" si es
     * invierno
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mesDelAño;
        String vacaciones;
        int edad;
        
        Scanner mysc = new Scanner(System.in);
                
        System.out.println("¿Vas de vacaciones? ");
        vacaciones = mysc.next();
        
        if(vacaciones.equals("si"))
        {
            
            
            System.out.println("Ingrese mes del año: ");
            mesDelAño = mysc.next();
            
            System.out.println("Ingrese su edad: ");
            edad = mysc.nextInt();
        
            switch(mesDelAño)
            {
                case "enero":
                case "febrero":
                    System.out.println("Lindo veranito");
                    break;

                case "julio":
                    if(edad > 80)
                    {
                        System.out.println("Vacunate contra la gripe");
                    }
                    System.out.println("Lindo invierno");
                    break;
                default:
                    System.out.println("No es verano");
                    break;

            }
        }    
        
        
        
    }
    
}
