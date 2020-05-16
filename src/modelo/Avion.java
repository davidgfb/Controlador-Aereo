
package modelo;


public class Avion {
    float v=0;
    
    Avion(float v) {
        this.setVelocidad(v);
    }
    
    void setVelocidad(float v) {
        this.v=v;
        System.out.println(this.toString());
    }
    
    float getVelocidad() {
        return this.v;
    }
    
    
    public static void main(String[] args) {
        //PROBADOR
        float v=0;
        Avion a1 = new Avion(v);
        
    }
    
    @Override
    public String toString() {
        return "avion: v="+String.valueOf(this.getVelocidad()+" nudos/mach/mps/kmph");
        
    }
}
