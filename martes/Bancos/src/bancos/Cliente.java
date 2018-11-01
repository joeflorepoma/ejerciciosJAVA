/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancos;

/**
 *Se pretende que club debe tener 3 socios comom atributo
 * y se necesita imprimir al socia con mayor antiguedad
 * socio tendra un nombre y la altiguedad en el club
 * constructor
 * @author alumno
 */
public class Cliente {
    
    private String nombre;
    private int monto;
    // creamos el metodo constructor
    
    public Cliente(String nom)
    {
        nombre = nom;
        monto = 0;
    }
    
    public void depositar(int mont)
    {
        monto +=mont;
    }
    
    public void extraer(int mont)
    {
        monto -=mont;
    }
    
    public int retornarMonto()
    {
        return monto;
    }
    
    public void imprimir()
    {
        System.out.println(nombre + " tiene depositado la suma de: "+  monto);
    }
}
