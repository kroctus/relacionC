/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author gabriel
 */
public class Puerta {
    
    private String id;
    private Ventana ventana;//composición de clases
    private boolean isAbierta;
    
    
    //Constructor

    public Puerta(String id, Ventana ventana) {
        this.id = id;
        this.ventana = ventana;
        this.isAbierta= false;
    }
    
    
    //getters

    public String getId() {
        return id;
    }

    public Ventana getVentana() {
        return ventana;
    }
    
    public boolean getAbierta(){
        return isAbierta;
    }
    
    //Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    
    public void abrir(){
        this.isAbierta=true;
    }
    
    public void cerrar(){
        this.isAbierta=false;
    }
    
    @Override
    public String toString() {
        return "Puerta{" + "id=" + id + ", ventana=" + ventana + '}';
    }
    
    
    
}
