/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejemplowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       // Ejemplowhile.promedioConIf();
        
        //Ejemplowhile.promedioConWhile();
        //Ejemplowhile.iteracionSinCantidad();
        //Ejemplowhile.salidaPorLogica();
        //Ejemplowhile.pedirNumero();
        //Ejemplowhile.mostrarMenu();
        //Ejemplowhile.tomarDatosValidados();
        //Ejemplowhile.contadoresYacumuladores();
        //Ejemplowhile.numeroPrimo();
        Ejemplowhile.primosDelUnoAlCien();
    }//finaliza el main
    
    public static void primosDelUnoAlCien()
    {
        Integer numeroIngresado = 1;
        
        while(numeroIngresado<101)
        {           
            numeroIngresado++;
            Integer contador=2;
            Integer contadorDivisores=0;

            while(contador<numeroIngresado)
            {
                
                if(numeroIngresado%contador==0)
                {
                    contadorDivisores++;
                    break;
                }
                contador++;
            }
            if(contadorDivisores>0)
            {
                //System.out.println("no es primo");
            }else
            {
                System.out.println("Es primo: "+numeroIngresado);
            }
        }
    }
    
    public static void numeroPrimo()
    {
        Integer numeroIngresado = 5;
        Integer contador=2;
        Integer contadorDivisores=0;
        
        while(contador<numeroIngresado)
        {
            if(numeroIngresado%contador==0)
            {
                contadorDivisores++;
                break;
            }
            contador++;
        }
        if(contadorDivisores>0)
        {
            System.out.println("no es primo");
        }else
        {
            System.out.println("Es primo");
        }
        
    }
    
    public static void contadoresYacumuladores()
    {
        Integer contador = 0;
        Integer acumulador = 0;
        Integer multiplicador = 1;
        Integer restador = 0;
        Integer contadorPares=0;
        Integer contadorDiv3=0;
        
        while(contador<10)
        {   
            contador++;
            System.out.println("numero: "+ contador);
            acumulador = acumulador + contador;
            multiplicador = multiplicador * contador;
            restador = restador - contador;
            if(contador%2==0)
            {
                contadorPares++;
            }
            if(contador%3==0)
            {
                contadorDiv3++;
            }
        }
        
        System.out.println("La suma" + acumulador);
        System.out.println("La multiplicacion: " + multiplicador);
        System.out.println("La resta es: " + restador);
        System.out.println("Los pares son: "+ contadorPares);
        System.out.println("Los impares son: "+ contadorDiv3);
    }
    /**
     * Pide los datos de una persona y valida cada uno, datos a pedir:
     * nombre, 
     * edad entre 1 a 100 años, 
     * sexo (f o m), 
     * estado civil(S-C-D-V),
     * nacionalidad (N,L,E,R), 
     * sueldo(entre 8000 y 58000),
     * dona organos (Si o No).
     * clave no menos de 6 caracteres
     */
    public static void tomarDatosValidados()
    {
        Scanner mysc = new Scanner(System.in);
        
        String aux;
        String nombre;
        Integer edad;
        String sexo;
        String estadoCivil;
        String nacionalidad;
        Integer sueldo;
        String donador;
        String clave;
        
        System.out.println("Ingrese un numbre: ");
        nombre = mysc.next();
        
        System.out.println("Ingrese edad: ");
        aux = mysc.next();
        edad = Integer.parseInt(aux);
              
        while(edad<0||edad>100)
        {
            System.out.println("Ingrese edad: ");
            aux = mysc.next();
            edad = Integer.parseInt(aux);            
        }
        
        System.out.println("Ingrese sexo: ");
        sexo = mysc.next();
        
        while(!sexo.equalsIgnoreCase("f")&&!sexo.equalsIgnoreCase("m"))
        {
            System.out.println("Reingrese sexo: ");
            sexo = mysc.next();            
        }
        
        System.out.println("Ingrese estado civil: ");
        estadoCivil = mysc.next();
        
        while(!estadoCivil.equalsIgnoreCase("S")&&!estadoCivil.equalsIgnoreCase("C")&&
                !estadoCivil.equalsIgnoreCase("D")&&!estadoCivil.equalsIgnoreCase("V"))
        {
            System.out.println("Reingrese estado civil: ");
            estadoCivil = mysc.next();            
        }
        
        System.out.println("Ingrese nacionalidad: ");
        nacionalidad = mysc.next();
        
        while(!nacionalidad.equalsIgnoreCase("N")&&!nacionalidad.equalsIgnoreCase("L")&&
                !nacionalidad.equalsIgnoreCase("E")&&!nacionalidad.equalsIgnoreCase("R"))
        {
            System.out.println("Reingrese nacionalidad: ");
            nacionalidad = mysc.next();            
        }
        
        System.out.println("Ingrese sueldo: ");
        aux = mysc.next();
        sueldo = Integer.parseInt(aux);
        
        while(sueldo<8000||sueldo>58000)
        {
            System.out.println("Reingrese sueldo: ");
            aux = mysc.next();
            sueldo = Integer.parseInt(aux);            
        }
        
        System.out.println("Ingrese si es donador (Si o No): ");
        donador = mysc.next();
        
        while(!donador.equalsIgnoreCase("Si")&&!donador.equalsIgnoreCase("No"))
        {
            System.out.println("Reingrese si es donador: ");
            donador = mysc.next();            
        }
        
        System.out.println("Ingrese una clave de no menos 6 caracteres: ");
        clave = mysc.next();
        
        while(clave.length()<6)
        {
            System.out.println("Reingrese su clave: ");
            clave = mysc.next();
        }
        
        System.out.println("\nUd se llama: "+nombre+"\nTiene :" +edad+" años de edad.\nSu sexo es: "
                +sexo+"\nEstado civil es: "+estadoCivil+"\nSu nacionalidad es: "+nacionalidad+
                "\nSu sueldo es: "+sueldo+"\nDonador de organos: "+donador);
       
        
        
    }
    
    /**
     * pide 2 numeros e informa el promedio.
     */
    
  
    public static void promedioConIf()
    {
        Scanner mysc = new Scanner(System.in);
        
        Integer num1;
        Integer num2;
        String aux;
        Integer promedio;
        
        System.out.println("Ingrese el primer numero: ");
        aux = mysc.next();
        num1 = Integer.parseInt(aux);
        
        System.out.println("Ingrese el segundo numero: ");
        aux = mysc.next();
        num2 = Integer.parseInt(aux);
        
        promedio = (num1+num2)/2;
        System.out.println("El promedio es: " + promedio);
        
    }//finaliza promedio con if
    
    /**
     * pide 2 numeros e informa el promedio.
     */
    
    public static void promedioConWhile()
    {
        Scanner mysc = new Scanner(System.in);
        
        Integer num;
        float promedio;
        Integer contador = 0;        
        String aux;
        Integer suma = 0;
        
        while(contador<3)
        {
            //contador++;
            System.out.println("Ingrese un numero: "+contador);
            aux = mysc.next();
            num = Integer.parseInt(aux);
            suma = suma + num;
            
        }
        
        promedio =(float)suma/contador;
        
        System.out.println("El promedio es: " + promedio);
    }
    
    /**
     * cuando no sabemos la cantidad
     */
    
    public static void iteracionSinCantidad()
    {
        Scanner mysc = new Scanner(System.in);
        
        String continuar="si";
        Integer num;
        
        while(!continuar.equals("no"))
        {
            System.out.println("Hola");
            System.out.println("Desea continuar si/no");
            continuar = mysc.next();
        }
    }
    
    static public void salidaPorLogica()
    {
        Scanner mysc = new Scanner(System.in);
        String continuar;
        while(true)
        {
            System.out.println("Hola");
            System.out.println("Desea continuar si/no");
            continuar = mysc.next();
            if(continuar.equals("no"))
            {
                break;
            }
        }
    }
    
    public static void pedirNumero()
    {
        Integer num;
        Integer contador = 0;
        String aux;
        Integer suma = 0;
        
        Scanner mysc = new Scanner(System.in);
        
        while(contador<10 && suma<50)
        {
            contador++;            
            System.out.println("Ingrese numero "+contador);
            aux = mysc.next();
            num = Integer.parseInt(aux);
            suma = suma + num;
            
        }
        
        System.out.println("La suma es "+suma);
        System.out.println("La cantidad es "+contador);
        
    }
    
    public static void mostrarMenu()
    {
        
        String opcion="nada";
        
        Scanner mysc = new Scanner(System.in);
        
        while(!opcion.equals("6"))
        {
            
            System.out.println("1.- Sumar: ");
            System.out.println("2.- Restar: ");
            System.out.println("3.- multiplicar: ");
            System.out.println("4.- Dividir: ");
            System.out.println("6.- Salir: ");
            System.out.println("Ingrese opcion deseada: ");
            opcion = mysc.next();
            
            switch(opcion)
            {
                case "1":
                    Ejemplowhile.Sumar();
                    break;
                case "2":
                    Ejemplowhile.Resta();
                    break;
                case "3":
                    Ejemplowhile.Multiplicar();
                    break;
                case "4":
                    Ejemplowhile.Dividir();
                    break;
                case "6":
                    System.out.println("¡¡¡Adios.¡¡¡");
                    break;
                default:
                    System.out.println("\n¡¡¡Ingreso una opcion equivocada.¡¡¡\n");
            }
        }
        System.out.println("Cerro el menu");
        
    }
    
    public static void Sumar()
    {
        Integer num1;
        Integer num2;
        String aux;
        Integer resultado;
        
        Scanner mysc = new Scanner (System.in);
        
        System.out.println("Ingrese primer numero: ");
        aux = mysc.next();
        num1 = Integer.parseInt(aux);
        
        System.out.println("Ingrese segundo numero: ");
        aux = mysc.next();
        num2 = Integer.parseInt(aux);
        
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es: "+ resultado);
    }
    
    public static void Resta()
    {
        Integer num1;
        Integer num2;
        String aux;
        Integer resultado;
        
        Scanner mysc = new Scanner (System.in);
        
        System.out.println("Ingrese primer numero: ");
        aux = mysc.next();
        num1 = Integer.parseInt(aux);
        
        System.out.println("Ingrese segundo numero: ");
        aux = mysc.next();
        num2 = Integer.parseInt(aux);
        
        resultado = num1 - num2;
        System.out.println("El resultado de la resta es: "+ resultado);
    }
    
    public static void Multiplicar()
    {
        Integer num1;
        Integer num2;
        String aux;
        Integer resultado;
        
        Scanner mysc = new Scanner (System.in);
        
        System.out.println("Ingrese primer numero: ");
        aux = mysc.next();
        num1 = Integer.parseInt(aux);
        
        System.out.println("Ingrese segundo numero: ");
        aux = mysc.next();
        num2 = Integer.parseInt(aux);
        
        resultado = num1 * num2;
        System.out.println("El resultado de la multiplicacion es: "+ resultado);
    }
    
    public static void Dividir()
    {
        Integer num1;
        Integer num2;
        String aux;
        Integer resultado;
        
        Scanner mysc = new Scanner (System.in);
        
        System.out.println("Ingrese primer numero: ");
        aux = mysc.next();
        num1 = Integer.parseInt(aux);
        
        System.out.println("Ingrese segundo numero: ");
        aux = mysc.next();
        num2 = Integer.parseInt(aux);
        
        if(num2 == 0)
        {
            System.out.println("Ingrese un numero distinto de cero:");
            System.out.println("Ingrese segundo numero: ");
            aux = mysc.next();
            num2 = Integer.parseInt(aux);
        }
        
        resultado = num1 / num2;
        System.out.println("El resultado de la division es: "+ resultado);
    }
    
        
    
}
