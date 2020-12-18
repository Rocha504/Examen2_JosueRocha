 
package examen2_josuerocha;

import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author josue
 */
public class adminbarra extends Thread {
    
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private JSpinner piezas;
    private ArrayList<String> complementos;
    
    
    public adminbarra(JProgressBar barra){
        this.barra=barra;
        avanzar=true;
        vive=true;
    }
    
    public boolean isVive(){
        return vive;
    }
    
    public void setVive(boolean vive){
        this.vive=vive;
    }
    
    public boolean isAvanzar(){
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                barra.setValue((int) piezas.getValue());
                                      }
            }
            try{
                Thread.sleep(4000);
            }
            catch(InterruptedException e){    
        }     
    }       
}

