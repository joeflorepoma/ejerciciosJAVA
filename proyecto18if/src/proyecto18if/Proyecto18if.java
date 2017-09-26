/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto18if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto18if {

    /**
     * @param args the command line arguments
     * Se pide una clave  y si coincide de muestra el mensaje “Bienvenido” 
     * de lo contrario mostrar el mensaje “clave incorrecta.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clave;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Ingrese clave: ");
        clave = mysc.next();
        
        if(clave.equals("utn750"))
        {
            System.out.println("Bienvenido!!");
        }
        
    }
    
}
