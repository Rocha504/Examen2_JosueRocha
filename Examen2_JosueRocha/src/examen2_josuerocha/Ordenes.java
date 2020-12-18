 
package examen2_josuerocha;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Ordenes implements Serializable {
    
    private int piezas;
    private ArrayList<String> complementos;

    public Ordenes() {
    }

    public Ordenes(int piezas) {
        this.piezas = piezas;
    }

    public Ordenes(int piezas, ArrayList<String> complementos) {
        this.piezas = piezas;
        this.complementos = complementos;
    }

    @Override
    public String toString() {
        return "Orden{" + "piezas=" + piezas + ", complementos=" + complementos + '}';
    }
    
    
    
    
}
