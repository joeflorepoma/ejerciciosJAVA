/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto14 {

    /**
     * @param args the command line arguments
     * se pide ingresar una clave, si es "utn750", se mostrara el mensaje
     * bienvenido, de lo contrario el mensaje "clave erronea".
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String clave;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingresar clave: ");
        clave = miScanner.nextLine();
        
       /* boolean respuesta;
        respuesta = clave.equals("utn750");
        if(respuesta){}
        */
        
        if(clave.equals("utn750"))
        {
            System.out.println("Bienvenido.");
        }
        else
        {
            System.out.println("Clave erronea.");
        }
        
        
    }
    
}
