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
public class Ventana {
    
    private String id;
    private boolean isAbierta;

    
    //Constructor parametrizado
    public Ventana(String id, boolean isAbierta) {
        this.id = id;
        this.isAbierta = isAbierta;
    }
    
    //geters
    

    public String getId() {
        return id;
    }

    public boolean getIsAbierta() {
        return isAbierta;
    }
    
    //SETTERS

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Ventana{" + "id=" + id + ", isAbierta=" + isAbierta + '}';
    }
    
    //----------------------
    
    public void abrirVentana(){
        this.isAbierta=true;
    }
    
    public void cerrarVentana(){
        this.isAbierta=false;
    }
}
