/*
 * 4. Crea la clase PuntoGeometrico que permita gestionar coordenadas (x,y) en un plano de dos dimensiones.
Esas coordenadas serán números reales. Incluye los siguientes métodos: constructores (por defecto y
parametrizado) y métodos get y set.
 */
package ejercicio4;

/**
 *
 * @author gabriel
 */
public class PuntoGeometrico {
    
    private double x;
    private double y;

    //Constructor por defecto
    public PuntoGeometrico() {
        
    }


    //Constructor parametrizado
    public PuntoGeometrico(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
    
    
    
    
    
}
