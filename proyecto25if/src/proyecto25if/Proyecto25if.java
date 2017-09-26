/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto25if;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Proyecto25if {

    /**
     * @param args the command line arguments
     * Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared de
     * 1 metro cuadrado, se pide el alto y ancho y se informa la cantidad de 
     * cada material que necesito.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ancho;
        int alto;
        int area;
        int cemento;
        int cal;
        
        Scanner mysc = new Scanner(System.in);
        
        System.out.println("Ingrese el ancho: ");
        ancho = mysc.nextInt();
        
        System.out.println("Ingrese el alto: ");
        alto = mysc.nextInt();
        
        area = ancho * alto;
        
        cemento = 3 * area;
        cal = 2 * area;
        
        System.out.println("Se necesitan "+cemento+" bolsas de cemento"+
        " y "+cal+" bolsas de cal, para una pared de "+area+" metros cuadrados");
        
    }
    
}
