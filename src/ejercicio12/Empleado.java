/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import ejercicio9.Nif;

/**
 *
 * @author kroctus
 */
public class Empleado {

    private Nif nif;
    private double sueldoBase;
    private double pagoHorasExtra;
    private double horasExtraMes;
    private boolean casado;
    private int numeroHijos;
    
    
    //Método que calcula el complemento correspondiente a las horas extras realizadas;
    
    public double complementoHorasExtras(){
        
       double calculo= this.pagoHorasExtra*this.horasExtraMes;
       return calculo;
    }
    
    //Retenciones IRPF
    
    
    //Método para visualizar la información báscia
    
    public void escribirBasicInfo(){
        System.out.println("Horas extras"+ this.horasExtraMes);
    }
    
    
    
    

    //Constructor por defecto
    public Empleado() {

        this.sueldoBase = 800;
        this.pagoHorasExtra = 25;
        this.horasExtraMes = 5;
        this.casado = true;
        this.numeroHijos = 2;
        this.nif = nif;

    }

    //Constructor parametrizado
    public Empleado(Nif nif, double sueldoBase, double pagoHorasExtra, double horasExtraMes, boolean casado, int numeroHijos) {
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.pagoHorasExtra = pagoHorasExtra;
        this.horasExtraMes = horasExtraMes;
        this.casado = casado;
        this.numeroHijos = numeroHijos;
    }

    //Métodos getters
    public Nif getNif() {
        return nif;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getPagoHorasExtra() {
        return pagoHorasExtra;
    }

    public double getHorasExtraMes() {
        return horasExtraMes;
    }

    public boolean isCasado() {
        return casado;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    //Métodos setters
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setPagoHorasExtra(double pagoHorasExtra) {
        this.pagoHorasExtra = pagoHorasExtra;
    }

    public void setHorasExtraMes(double horasExtraMes) {
        this.horasExtraMes = horasExtraMes;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    //Método toString
    @Override
    public String toString() {
        return "Empleado{" + "nif=" + nif + ", sueldoBase=" + sueldoBase + ", pagoHorasExtra=" + pagoHorasExtra + ", horasExtraMes=" + horasExtraMes + ", casado=" + casado + ", numeroHijos=" + numeroHijos + '}';
    }

}
