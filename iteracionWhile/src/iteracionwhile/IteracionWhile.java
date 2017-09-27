/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracionwhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class IteracionWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clave;
        Integer cont = 0;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Ingrese la clave correcta: ");
        clave = mysc.next();
        
        while(!clave.equals("1234"))
        {
            System.out.println("Error reingrese la clave correcta: ");
            clave = mysc.next();
            
        }
        System.out.println("bienvenido");
        
        while(cont < 10)
        {
            cont++;
            System.out.println("Contando"+ cont);
            
        }
        System.out.println("termino");
        
        
    }
    
}
