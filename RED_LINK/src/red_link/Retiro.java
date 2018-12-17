
package red_link;


public class Retiro extends Transaccion{

     public Retiro(Cuenta origen, double monto) {
        super(monto, origen, null, "Retiro");
    }
    
    public void retirar(){
        origen.retirarPlata(monto);
        
    } 
    
}
