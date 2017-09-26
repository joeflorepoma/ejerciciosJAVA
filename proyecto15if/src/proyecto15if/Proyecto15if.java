/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto15if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto15if {

    /**
     * @param args the command line arguments
     * se pide el nombre el sexo y la localidad, si se llama jose o maria
     * y es de sexo masculinom viviendo en moron, semuestra el mensaje
     * "sos de moron"
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre;
        String Sexo;
        String Localidad;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre: ");
        Nombre = mysc.next();
        
        System.out.println("Ingrese su sexo: ");
        Sexo = mysc.next();
        
        System.out.println("Ingrese una localidad: ");
        Localidad = mysc.next();
        
        if(Nombre.equals("mario")||Nombre.equals("jose"))
        {
            if(Sexo.equals("m")&&Localidad.equals("moron"))
            {
                System.out.println("\nSos de moron");
            }
        }
    }
    
}
