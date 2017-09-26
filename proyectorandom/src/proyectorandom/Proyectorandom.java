/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorandom;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyectorandom {

    /**
     * @param args the command line arguments
     * informar si: si le erro por un punto mensaje "casicasi"
     * si le erro por 2 puntos mensaje "cerca"
     * si le erro por 3 puntos mensaje "ni cerca"
     * si le erro por 4 puntos el mensaje "bien lejos"
     * para todos los demas mensaje "sos horrible en este juego"
     * tranformarlo a switch
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer numIngresado;
        int numero;
        String Aux;
        
        Scanner mysc = new Scanner(System.in);
        
        numero = (int) (Math.random() * 10) + 1;
        
        System.out.println("adivine el numero: ");
        Aux = mysc.next();
        numIngresado = Integer.parseInt(Aux);
        
        if(numIngresado == numero)
        {
            System.out.println("Ganaste");
        }else{
            
            if(numIngresado > numero)
            {
                System.out.println("Te pasaste");
            }else
            {
                System.out.println("Te falto");
            }
            
        }
        
        
        System.out.println("el numero es "+ numero);
    }
    
}
