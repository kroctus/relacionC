/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionc;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class RelacionC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Cancion cancion1 = new Cancion("Paquito ", " chanson");

        System.out.println("Ejercicio 14: ");
        System.out.println("");

        System.out.println("titulo canción : " + cancion1.getTitulo());
        System.out.println("Autor canción: " + cancion1.getAutor());

        System.out.println(cancion1.toString());

        Cancion cancion2 = new Cancion("", "");
        // Cancion cancion2 = new Cancion();

        System.out.println(cancion2.toString());
        // System.out.println(cancion2);

        System.out.println("Nombre");
        cancion2.setTitulo(teclado.nextLine());

        System.out.println("Autor");
        cancion2.setAutor(teclado.nextLine());

        System.out.println(cancion2.toString());

    }

}
