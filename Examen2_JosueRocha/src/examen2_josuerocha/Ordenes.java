 
package examen2_josuerocha;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Ordenes {
    
    private ArrayList<String> piezas;
    private ArrayList<String> complementos;

    public Ordenes() {
    }

    public Ordenes(ArrayList<String> piezas) {
        this.piezas = piezas;
    }

    public Ordenes(ArrayList<String> piezas, ArrayList<String> complementos) {
        this.piezas = piezas;
        this.complementos = complementos;
    }

    @Override
    public String toString() {
        return "Orden{" + "piezas=" + piezas + ", complementos=" + complementos + '}';
    }
    
    
    
    
}
