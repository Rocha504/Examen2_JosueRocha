 
package examen2_josuerocha;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Clientes implements Serializable {
    
    private Ordenes ordenes;
    private String nombre;

    public Clientes() {
    }

    public Clientes(String nombre) {
        this.nombre = nombre;
    }

    public Clientes(Ordenes ordenes, String nombre) {
        this.ordenes = ordenes;
        this.nombre = nombre;
    }

    public Ordenes getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(Ordenes ordenes) {
        this.ordenes = ordenes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCode(String code) {
        this.nombre = code;
    }

    @Override
    public String toString() {
        return "Cliente "+ nombre+ " {" + "ordenes=" + ordenes + '}';
    }
    
    
    
    

    
    
    
    
}
