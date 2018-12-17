package red_link;

public class Transferencia extends Transaccion{
    
    public Transferencia(Cuenta origen, Cuenta destino, double monto) {
        super(monto, origen, destino, "Transferencia");
    }
    
    public void transferir(){
        origen.retirarPlata(monto);
        destino.agregarPlata(monto);
    } 
}
