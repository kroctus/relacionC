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
public class Motor {
    
    private int potencia; //Caballos de fuerza
    private boolean isOn; //Para saber si esta encendido.
    private String tipoMotor; //Gasolina, Diesel.
    private String idenfificador;

    
    //Constructor parametrizado
    public Motor(int potencia, boolean isOn, String tipoMotor, String idenfificador) {
        this.potencia = potencia;
        this.isOn = isOn;
        this.tipoMotor = tipoMotor;
        this.idenfificador = idenfificador;
    }
    
    
    //Getters and Setters

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isIsOn() {
        return isOn;
    }

  
    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getIdenfificador() {
        return idenfificador;
    }

    public void setIdenfificador(String idenfificador) {
        this.idenfificador = idenfificador;
    }
    
    
    public void arrancar(){
        this.isOn= true;
    }
    
    public void apagar(){
        this.isOn= true;
    }
    

    //Método toString
    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + ", isOn=" + isOn + ", tipoMotor=" + tipoMotor + ", idenfificador=" + idenfificador + '}';
    }
    
    
    
}
