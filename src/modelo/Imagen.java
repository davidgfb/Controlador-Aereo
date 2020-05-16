
package modelo;

import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Imagen {
    void EscalaImagenSinDistorsion(Label etiqueta,float factorZoom) { //factorZoom=0.5
        //ejemplo: 
        float ancho=etiqueta.getWidth(); //1920
        float alto=etiqueta.getHeight(); //1080
                
        float ESCALA=ancho/alto; //1920/1080=1,77777778 
        
        float nuevoAlto=factorZoom*alto; //0.5*1080=540
        
        //float FACTOR_ESCALA=factorZoom*ESCALA; //0.5*1,77777778=0,88888889
        
        float nuevoAncho=ESCALA*nuevoAlto; //1,77777778*540=960,000001
        
        /*
        etiqueta.setWidth(nuevoAncho); //1920-->960,000001
        etiqueta.setHeight(nuevoAlto); //1080-->540
        */
        
        etiqueta.setSize((int)nuevoAncho, (int)nuevoAlto);
        
        float nuevaEscala=nuevoAncho/nuevoAlto; //960,000001/540=1,77777778 
        
        String mensaje="";
        if (ESCALA==nuevaEscala) {
            mensaje="Las escalas coinciden";
            
        } else {
            mensaje="Error: Las escalas NO coinciden";
        }
        System.out.println(mensaje);
    }
    
    /*
    //PROBADOR
    Label etiqueta = new Label();
    //etiqueta.setSize(1920,1080);
    //etiqueta.setPreferredSize(new Dimension(80,40));
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void ReescalaImagen(String archivo,Label etiqueta) { //asegura que la imagen no se deforme
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(archivo));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg = img.getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_SMOOTH); //bicubico?

        ImageIcon imageIcon = new ImageIcon(dimg);
    }
}
