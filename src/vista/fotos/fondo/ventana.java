
package vista.fotos.fondo;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ventana extends javax.swing.JFrame {

    
    
    
    public JLabel getEtiqueta() {
        return LogoAvion;
    }
    
    
    
    public Ventana() { //esto se ejecuta al inicio del objeto
        initComponents();
        this.setVisible(true);
        this.setSize(1334, 750);
        this.setResizable(false);
        
        //BucleJuego bucle = new BucleJuego();
        //bucle.actualiza(LogoAvion);
        actualiza(LogoAvion);
    }

    
    
    boolean abierto=true;
    void actualiza(JLabel etiqueta) {
        int x=etiqueta.getLocation().x,y=etiqueta.getLocation().y,
            contador=0,moduloT=99999999,vAvion=1;
        System.out.println("La x inicial es:"+Integer.toString(x)+" y es:"+Integer.toString(y));
        
        while (abierto) {
            
            try {
                if (contador%(moduloT*vAvion)==0) {
                    System.out.println("x es:"+Integer.toString(x)+" y es:"+Integer.toString(y));
                    etiqueta.setLocation(x, y); //inicializa las variables a la poss iniciales en pantalla
                    x++;
                }
            }
            catch (Exception e) {
                System.out.println("e: division entre 0");
            }
            contador++;
            //rota();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    /*
    void paintComponent(Graphics g,ImageIcon icon) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.rotate(rot, icon.getIconWidth() / 2, icon.getIconHeight() / 2);
        g2.drawImage(icon.getImage(), 0, 0, null);
    }
    */
    
    
    
    /*
    void rota(JLabel etiqueta) {
        etiqueta.getIcon().
    }
    */
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Aeropuerto = new javax.swing.JPanel();
        LogoAvion = new javax.swing.JLabel();
        LogoAeropuerto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Aeropuerto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoAvion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fotos/Logos/LogoAvion.png"))); // NOI18N
        LogoAvion.setDoubleBuffered(true);
        Aeropuerto.add(LogoAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -120, -1, -1));

        LogoAeropuerto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fotos/fondo/aeropuerto.PNG"))); // NOI18N
        LogoAeropuerto.setDoubleBuffered(true);
        Aeropuerto.add(LogoAeropuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -140, 1694, 1004));

        getContentPane().add(Aeropuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    ///*
    public static void main(String args[]) {
        JFrame ventana= new Ventana();
    }
    //*/
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aeropuerto;
    private javax.swing.JLabel LogoAeropuerto;
    public javax.swing.JLabel LogoAvion;
    // End of variables declaration//GEN-END:variables
}