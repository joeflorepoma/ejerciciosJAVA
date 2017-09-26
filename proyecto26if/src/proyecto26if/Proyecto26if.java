/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto26if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto26if {

    /**
     * @param args the command line arguments
     * de pide una temperatura y se pide si se quiere pasar Celsius o Fahrenheit,
     * hacer la cuenta y mostrar el resultado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp;
        double fahr;
        String resp;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en Celsius: ");
        temp = mysc.nextDouble();
        
        System.out.println("¿Desea pasar de Celsius a Fahrenheit? si o no");
        resp = mysc.next();
        
        if(resp.equals("si"))
        {
            fahr = temp*1.8 + 32;
            System.out.println("La temperatura en Fahrenhite es: "+ fahr);
        }
        
    }
    
}
