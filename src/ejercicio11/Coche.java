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
public class Coche {
    
    private String id;
    private Motor motor;
    private Rueda ruedaDD, ruedaDI, ruedaTD, ruedaTI;
    private Puerta puertaPiloto, puertaCopiloto;
    
    
    //constructor por defecto
    public Coche() {
        id="coche por defecto";
    }

    //Constructor
    //inyección de dependencias ,ediante constructor
    public Coche(String id, Motor motor, Rueda ruedaDD, Rueda ruedaDI, Rueda ruedaTD, Rueda ruedaTI, Puerta puertaPiloto, Puerta puertaCopiloto) {
        this.id = id;
        this.motor = motor;
        this.ruedaDD = ruedaDD;
        this.ruedaDI = ruedaDI;
        this.ruedaTD = ruedaTD;
        this.ruedaTI = ruedaTI;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
    }
    
    //GETTERS

    public String getId() {
        return id;
    }

    public Motor getMotor() {
        return motor;
    }

    public Rueda getRuedaDD() {
        return ruedaDD;
    }

    public Rueda getRuedaDI() {
        return ruedaDI;
    }

    public Rueda getRuedaTD() {
        return ruedaTD;
    }

    public Rueda getRuedaTI() {
        return ruedaTI;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }
    
    //SETTERS

    public void setId(String id) {
        this.id = id;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setRuedaDD(Rueda ruedaDD) {
        this.ruedaDD = ruedaDD;
    }

    public void setRuedaDI(Rueda ruedaDI) {
        this.ruedaDI = ruedaDI;
    }

    public void setRuedaTD(Rueda ruedaTD) {
        this.ruedaTD = ruedaTD;
    }

    public void setRuedaTI(Rueda ruedaTI) {
        this.ruedaTI = ruedaTI;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }
    
    //toString

    @Override
    public String toString() {
        return "Coche{" + "id=" + id + ",\n motor=" + motor + ",\n ruedaDD=" + ruedaDD + ", ruedaDI=" + ruedaDI + ", ruedaTD=" + ruedaTD + ", ruedaTI=" + ruedaTI + ",\n puertaPiloto=" + puertaPiloto + ", puertaCopiloto=" + puertaCopiloto + '}';
    }
    
     //Métodos de un coche
    //Apaga el coche si esta encendido
    public void arrancarCoche(){
        if(!this.motor.isIsOn()){
            this.motor.arrancar();
        }
    }
    
    public void pararCoche(){
        if(this.motor.isIsOn()){
            this.motor.apagar();
        }
    }
    
    public void bajarVentanaCopiloto(){
        if(!this.puertaCopiloto.getVentana().getIsAbierta()){
            this.puertaCopiloto.getVentana().abrirVentana();
        }
    }
    
    public void inflarRuedaDelantera(){
        if(!this.ruedaDD.getIsInflada()){
            this.ruedaDD.llenar();
        }
    }
    
    
    
}
