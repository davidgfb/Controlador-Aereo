
package controlador;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class BucleJuego {
    JFrame ventanaJuego;
    JLabel etiqueta;
   
    BucleJuego() { //constructor se ejecuta desde Main al iniciar el objeto
        ventanaJuego = new JFrame();
        ventanaJuego.setVisible(true);
        
        
        etiqueta=ventanaJuego;
        actualiza(etiqueta);
        
        
    }
    
    
    
    public static void main(String[] args) {
        BucleJuego juego = new BucleJuego();
    }
    
    
    boolean abierto=true;
    //JLabel etiqueta = new JLabel();
    
    public void actualiza(JLabel etiqueta) {
        int x=etiqueta.getLocation().x,
            y=0;
        System.out.println("la x inicial de la etiqueta es:"+Integer.toString(x));
        while (abierto) {
            etiqueta.setLocation(x, y);
            x++;
            System.out.println("la x de la etiqueta es:"+Integer.toString(x));
        }
    }
}
