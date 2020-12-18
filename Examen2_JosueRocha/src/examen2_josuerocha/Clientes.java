 
package examen2_josuerocha;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Clientes {
    
    private ArrayList <Ordenes> ordenes;
    private String nombre;

    public Clientes() {
    }

    public Clientes(String nombre) {
        this.nombre = nombre;
    }

    public Clientes(ArrayList<Ordenes> ordenes, String nombre) {
        this.ordenes = ordenes;
        this.nombre = nombre;
    }

    public ArrayList<Ordenes> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Ordenes> ordenes) {
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
