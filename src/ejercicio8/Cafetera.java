/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author gabriel
 */
public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;

    //Primer constructor
    public Cafetera() {

        capacidadMaxima = 1000;
        cantidadActual = 0;
    }
    //Segundo constructor

    public void capacidadMaxima( double capacidadMaxima) {
        
        this.capacidadMaxima=capacidadMaxima;
        cantidadActual = capacidadMaxima;
        
    }

    //Tercer constructor
    public void capacidadCafetera(double capacidadMaxima, double capacidadActual) {
        
        this.capacidadMaxima=capacidadMaxima;
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }else{
            this.cantidadActual-=cantidadActual;
        }
        

    }

    //Llenar taza
    public void llenarCafetera() {

        cantidadActual = capacidadMaxima;
 
    }

    //servir taza
    public int servirTaza(int capacidadIndicada ) {
        
        if (capacidadMaxima<capacidadIndicada){
            this.cantidadActual=0;
        
        }
        return (int) cantidadActual;

    }



    //Vaciar cafetera
     public void vaciarCafetera() {

        cantidadActual = 0;
     
    }
    
   //agregar cafe 
    
    public void agregarCafe(int cantidadDeCafeIndicada){
        
        cantidadActual+=cantidadDeCafeIndicada;
   
    
         
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

   
    

}
