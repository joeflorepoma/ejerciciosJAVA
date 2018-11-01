/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Socio {
   
    
    private String nombre;
    private int antiguedad;
    
    public Socio(Scanner teclado)
    {
        System.out.println("Ingrese el nombre del socio: \n");
        nombre = teclado.next();
        
        System.out.println("Ingrese la antiguedad (en años): \n");
        antiguedad = teclado.nextInt();
        
    }
    
    public void imprimir()
    {
        System.out.println(nombre + " tiene una antiguedad de "+ antiguedad);
    }
    
    public int retornaAntiguedad()
    {
        return antiguedad;
    }
    
    
}
