package red_link;

import java.util.Date;

public abstract class Transaccion {

    protected Date fecha;

    protected String operacion;
    protected Double monto;
    protected Cuenta origen;
    protected Cuenta destino;

    
    
    public Transaccion(Double monto, Cuenta origen, Cuenta destino, String operacion) {
        this.fecha = new Date();
        this.operacion = operacion;
        this.monto = monto;
        this.origen = origen;
        this.destino = destino;
        
    }
        
    
    
    
    
    
    
}
