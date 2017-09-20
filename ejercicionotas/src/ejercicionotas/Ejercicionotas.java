/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionotas;

/**
 *
 * @author alumno
 */
public class Ejercicionotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer nota;
        
        nota = 0;
        
        if(nota == 10)
        {
            System.out.println("sos un genio");
        }
        else
        {
            if(nota < 10 && nota >7)
            {
                System.out.println("Estas entre los mejores");
            }
            else
            {
                if(nota>5)
                {
                    System.out.println("Casi bien");
                }
                else
                {
                    if(nota<4)
                    {
                        System.out.println("La proxima");
                    }else
                    {
                        System.out.println("todo mal");
                    }
                }
            }
            
        }
    }
    
}
