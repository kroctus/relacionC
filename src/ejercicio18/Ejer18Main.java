/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

/**
 *
 * @author gabriel
 */
public class Ejer18Main {
    
    public static void main(String[] args) {
   
        
        //Creamos un objeto Letra
        //con el constructor por defecto
        
        Letra a= new Letra();
        System.out.println(a);
        
        
        Letra g = new Letra ('G');
        System.out.println(g);
        
        // uso del get
        
        System.out.println(g.getLetra());
        
        //uso del set
        
        a.setLetra( 'y');
        System.out.println(a);
        
        
        //Invocación de métodos static
        //No dependen de objetos
        //uso el nombre de la clase.
        
        char letra= Letra.letraAleatoria();
        
        System.out.println("La letra aleatoria es: " + letra);
        
        
        Letra.imprimirLetras(10);
        
        //Invocación de métodos no static
        //Necesito un objeto
        System.out.println("Objeto g antes de cambiar letra " + g.getLetra() );
        g.ponerAleatoria();
        System.out.println("Objeto g después de cambiar letra " + g.getLetra() );
    }
  
   } 

