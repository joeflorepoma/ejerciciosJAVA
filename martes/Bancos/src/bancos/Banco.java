/* un banco tiene 3 clientes requiere que al final del dia 
    *  saber los depositos totales.
    *
    */
package bancos;


public class Banco {

    private Cliente cliente1, cliente2, cliente3;
    
    public Banco()
    {
        cliente1 = new Cliente("Juan");
        cliente2 = new Cliente("Ana");
        cliente3 = new Cliente("Mara");
    }
    
    public void operar()
    {
        cliente1.depositar(1000);
        cliente2.depositar(1500);
        cliente3.depositar(2000);
        cliente3.extraer(500);
        cliente2.extraer(500);
    }
    
    public void verDepositosTotales()
    {
        int total = cliente1.retornarMonto() + cliente2.retornarMonto() + 
                cliente3.retornarMonto();
        
        System.out.println("El banco dispone de $/. "+ total);
        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();
    }
    
    
    public static void main(String[] args) {
        
        Banco banco = new Banco();
        
        banco.operar();
        banco.verDepositosTotales();
    }
    
}
