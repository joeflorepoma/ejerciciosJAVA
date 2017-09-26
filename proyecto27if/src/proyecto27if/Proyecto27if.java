/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto27if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto27if {

    /**
     * @param args the command line arguments
     * para una pileta se necesita saber la superficie, se debe pedir que tipo
     * de pileta tiene (cuadrada o redonda) de ser redonda, pedir el radio y si
     * es cuadrada pedir el largo y el ancho, mostrar la superficie de la pileta.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String piscina;
        int largo;
        int ancho;
        int sup;
        double radio;
        double circunferencia;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Que tipo de piscina tiene: redonda o cuadrada");
        piscina = mysc.next();
        
        if(piscina.equals("cuadrada"))
        {
            System.out.println("Ingrese el largo de la piscina: ");
            largo = mysc.nextInt();
            
            System.out.println("Ingrese el ancho de la piscina: ");
            ancho = mysc.nextInt();
            
            sup = largo * ancho;
            
            System.out.println(" La superficie es: "+ sup);
        }
        if(piscina.equals("redonda"))
        {
            System.out.println("Ingrese el radiod de la piscina: ");
            radio = mysc.nextInt();            
            
            circunferencia = (3.14*(radio*radio));
            
            System.out.println(" La circunferencia es: "+ circunferencia);
        }
    }
    
}
