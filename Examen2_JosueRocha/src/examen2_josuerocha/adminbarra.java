 
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
    private boolean avanzar=true;
    private boolean vive=true;
    private JSpinner piezas;
    private ArrayList<String> complementos;
    
    
    public adminbarra(JProgressBar barra,JSpinner piezas,ArrayList<String> complementos){
        this.barra=barra;
        this.piezas=piezas;
        this.complementos=complementos;
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
        
        int max=(int) piezas.getValue();
        barra.setMaximum(max);
         
        while(vive){
            if(avanzar){
                try{
                sleep(2000);
                barra.setValue(barra.getValue()+1);
                }
                 catch(InterruptedException m){
                 }
                if(barra.getValue()==barra.getMaximum()){
                    barra.setValue(barra.getMinimum());
                }
            }    
        }
        
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){    
        }     
    
    }
}

