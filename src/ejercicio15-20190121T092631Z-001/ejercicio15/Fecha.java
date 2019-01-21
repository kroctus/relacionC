/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author kroctus
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    //Constructor por defecto
    public Fecha() {

        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;

    }

    //Constuctor parametrizado
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.anio = año;
    }

    //Método que lee un entero por teclado hasta que se encuentre en el rango 1-31 y lo devolverá
    public static int leerDia() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el día de nacimiento: ");
        int dia = teclado.nextInt();

        while (dia < 1 || dia > 31) {
            System.out.println("El día introducido se sale del rango, profavor introduce un número correcto: ");
            dia = teclado.nextInt();
        }
        return dia;
    }

    //Método que leerá un entero por teclado hasta que se encuentre en el rango 1 – 12 y lo devolverá.
    public static int leerMes() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el mes de nacimiento: ");
        int mes = teclado.nextInt();

        while (mes < 1 || mes > 12) {
            System.out.println("El mes introducido se sale del rango, profavor introduce un número correcto: ");
            mes = teclado.nextInt();
        }
        return mes;
    }

    //Método que leerá un enetero por teclado hasta que se encuentre en el rango 1900-2100 y lo devolverá
    public static int leerAnio() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el año de nacimiento: ");
        int anio = teclado.nextInt();

        while (anio < 1900 || anio > 2100) {
            System.out.println("El año introducido se sale del rango, profavor introduce un número correcto: ");
            anio = teclado.nextInt();
        }
        return anio;
    }

    public static void leerFecha() {
        Fecha.leerDia();
        Fecha.leerMes();
        Fecha.leerAnio();
    }

    //Método que indica si el año es bisiesto o no
    public void esBisiesto() {
        boolean esBisiesto;
        if ((this.anio % 4 == 0) && ((this.anio % 100 != 0) || (this.anio % 400 == 0))) {
            System.out.println("El año es bisiesto");
            esBisiesto=true;
        } else {
            System.out.println("El año no es bisiesto");
            esBisiesto=false;
        }
    }

    public int diasMes(int mes) {
        int diasMes = 0;
        if ((this.anio % 4 == 0) && ((this.anio % 100 != 0) || (this.anio % 400 == 0))) {

            switch (mes) {

                case 1:
                    diasMes = 31;
                    break;

                case 2:
                    diasMes = 29;
                    break;
                case 3:
                    diasMes = 31;
                    break;
                case 4:
                    diasMes = 30;
                    break;
                case 5:
                    diasMes = 31;
                    break;
                case 6:
                    diasMes = 30;
                    break;
                case 7:
                    diasMes = 31;
                    break;
                case 8:
                    diasMes = 31;
                    break;
                case 9:
                    diasMes = 30;
                    break;
                case 10:
                    diasMes = 31;
                    break;
                case 11:
                    diasMes = 31;
                    break;
                case 12:
                    diasMes = 31;
                    break;

            }
        }else{
             switch (mes) {

                case 1:
                    diasMes = 31;
                    break;
                case 2:
                    diasMes = 28;
                    break;
                case 3:
                    diasMes = 31;
                    break;
                case 4:
                    diasMes = 30;
                    break;
                case 5:
                    diasMes = 31;
                    break;
                case 6:
                    diasMes = 30;
                    break;
                case 7:
                    diasMes = 31;
                    break;
                case 8:
                    diasMes = 31;
                    break;
                case 9:
                    diasMes = 30;
                    break;
                case 10:
                    diasMes = 31;
                    break;
                case 11:
                    diasMes = 31;
                    break;
                case 12:
                    diasMes = 31;
                    break;
        }
        }
        return diasMes;   
    }
    
    //Método validarFecha
    
    public void validarFecha(){
        
    }
    
    //Método mostrar fecha corta
    
    public void mostrarFechaCorta(){
        System.out.println(this.dia + "-" + this.mes + "-"+this.anio);
    }
    //diasTranscurridos

    
    
    
    
    
    

    //Métodos Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return anio;
    }

    //Métodos Setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.anio = año;
    }

}
