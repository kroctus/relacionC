/*
 * Crea una clase NIF que se usará para asignar el número de DNI con su correspondiente letra. Los atributos
serán el número de DNI (String) y la letra que le corresponde. La clase dispondrá de los siguientes métodos:
•
2
Constructor predeterminado que inicialice el no de DNI a 0 y la letra a espacio en blanco (será un NIF
no válido).• Constructor que reciba el DNI y establezca la letra que le corresponde.
• Método get.
• leer(): método que pide por teclado el número de DNI y lo devuelve.
• mostrar (). Método que nos permita mostrar el NIF (ocho dígitos, un guión y la letra en mayúscula;
por ejemplo: 00395469-F)
 */
package ejercicio9;


//empleado1.getnif().getletra();

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Nif {

    private String dni;
    private String letraCorrespondiente;
    
    //Constructor por defecto

    public Nif() {

        this.dni = "0";
        this.letraCorrespondiente = "";
    }

    //Constructor que recibe el dni y establece la letra que le corresponde.
    public Nif(String dni) {
        this.dni = dni;
        calcularLetra(dni);
    }

    //Método privado
    private void calcularLetra(String dni) {
        //Pasar a numero el dni
        int numero = Integer.parseInt(dni);
        //Hacer el resto de dividir el dni /23
        int resto = numero % 23;

        //Establecer this.letra
        switch (numero) {
            case 0:
                letraCorrespondiente = "T";
                break;

            case 1:
                letraCorrespondiente = "R";
                break;

            case 2:
                letraCorrespondiente = "W";
                break;

            case 3:
                letraCorrespondiente = "A";
                break;

            case 4:
                letraCorrespondiente = "G";
                break;

            case 5:
                letraCorrespondiente = "M";
                break;

            case 6:
                letraCorrespondiente = "Y";
                break;

            case 7:
                letraCorrespondiente = "F";
                break;

            case 8:
                letraCorrespondiente = "P";
                break;

            case 9:
                letraCorrespondiente = "D";
                break;

            case 10:
                letraCorrespondiente = "X";
                break;

            case 11:
                letraCorrespondiente = "B";
                break;

            case 12:
                letraCorrespondiente = "N";
                break;

            case 13:
                letraCorrespondiente = "J";
                break;

            case 14:
                letraCorrespondiente = "Z";
                break;

            case 15:
                letraCorrespondiente = "S";
                break;

            case 16:
                letraCorrespondiente = "Q";
                break;

            case 17:
                letraCorrespondiente = "V";
                break;

            case 18:
                letraCorrespondiente = "H";
                break;

            case 19:
                letraCorrespondiente = "L";
                break;

            case 20:
                letraCorrespondiente = "C";
                break;

            case 21:
                letraCorrespondiente = "K";
                break;

            case 22:
                letraCorrespondiente = "E";
                break;

        }

        this.letraCorrespondiente = letraCorrespondiente;
    }

    //Método get
    public String getDni() {
        return dni;
    }

    public String getLetraCorrespondiente() {
        return letraCorrespondiente;
    }

    //Método leer
    public String leer(String dni) {
        Scanner teclado = new Scanner(System.in);
        dni = teclado.nextLine();
        return dni;
    }

    //Método mostrar.
    public void mostrar() {
        System.out.println(this.dni + "-" + this.letraCorrespondiente);
    }

    @Override
    public String toString() {
        return  dni + "-" + letraCorrespondiente ;
    }

    
    
}
