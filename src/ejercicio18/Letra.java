/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Random;
import dawUtilidades.Aleatorios;

/**
 *
 * @author gabriel
 */
public class Letra {
    
  private char letra;

  
  //Constructor por defecto
    public Letra() {
        
        letra= 'a';
    }
    
    //Constructor paramatrizado

    public Letra(char letra) {
        this.letra = letra;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
 
    public char letraAleatoriaPara( int letraAleatoria){
        Random rnd= new Random();
        letraAleatoria=rnd.nextInt('Z' - 'a' +1 ) + 'a';
        return (char)letraAleatoria;
        
        
    }

    @Override
    public String toString() {
        return "Letra{" + "letra=" + letra + '}';
    }
    
    //Usamos la clase aletorios del paquete daw utilidades del proyecto Utilidades
    // 1) indicamos en este proyecto que vamos a usar el proyecto utilidades.
    // Utilidades---> Project properties >> Libraries >> Buscamos el proyecto que queremos usar y le damos a añadir
    // 2) para poder usar la clase aleatorios en la clase Letra. como la clase pertenece a un paquete debemos 
    
    public static char letraAleatoria() {

        Random aleatorio = new Random();

        //Si sale true devuelvo en minuscula
        //si sale false devuelvo en mayúscula
        if (aleatorio.nextBoolean()) {
            // No tengo que instanciar objetos de la clase aleatorios porque el método es STATIC
            return Aleatorios.letraMinuscula();
        } else {
            return Aleatorios.letraMayuscula();
        }

    }
    
       //Método que inicialice el atributo de letra con una letra aleatoria.
        public void ponerAleatoria(){
            
            letra = Letra.letraAleatoria();  
        }
         public static void imprimirLetras( int cantidadLetras){
       for (int i = 0; i < cantidadLetras; i++) {
           
           System.out.println(Letra.letraAleatoria());
           
       }
        
         }
         
}
