/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto14if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto14if {

    /**
     * @param args the command line arguments
     * Se pide el sexo y el nombre, si es “f” de femenino, se muestra 
     * el mensaje” feliz dia XXXXX”, donde XXXX es el nombre.
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        String Nombre;
        String Sexo;

        Scanner misc = new Scanner(System.in);
        
        System.out.println("Ingrese nombre: ");
        Nombre = misc.next();
        
        System.out.println("Ingrese sexo: ");
        Sexo =  misc.next();
    
        if(Sexo.equals("f"))
        {
            System.out.println("Feliz dia "+ Nombre);
        }
    }
    
}
