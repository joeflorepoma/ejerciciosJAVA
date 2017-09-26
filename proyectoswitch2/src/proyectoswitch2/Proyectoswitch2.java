/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoswitch2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyectoswitch2 {

    /**
     * @param args the command line arguments
     * adivina el numero
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer MesDelAño;
        String aux;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Ingrese mes del año");
        aux = mysc.next();
        MesDelAño = Integer.parseInt(aux);
                           
        switch(mesDelAño)
          {
            case 1:
            case :
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
