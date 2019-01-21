/*
 *1.Crea una clase Complejo que permita trabajar con números complejos (parte real y parte imaginaria). Se
define cada número complejo z como un par ordenado de números reales: z = (a, b). A su vez el primer
elemento a se define como parte real de z, se denota a=Re(z); el segundo elemento b se define como parte
imaginaria de z, se denota b=Im(z). Incluye los siguientes métodos: constructores (por defecto y
parametrizado) y métodos get, set y toString.


Ponerle constructor copia y contador de constructores.

Incluye en la clase Complejo los métodos suma, resta, multiplicación, división e igualdad. Echa un vistazo en
Wikipedia.
 */
package ejercicio1;

/**
 *
 * @author gabriel
 */
public class Complejo {

    private double real;
    private double imaginario;
    private static int contador = 0;

    //Constructor por defecto
    public Complejo() {
        this.real = 0;
        this.imaginario = 0;
        contador++;
    }

    //Constructor parametrizado
    public Complejo(double zReal, double zImaginario) {
        this.real = zReal;
        this.imaginario = zImaginario;
        contador++;
    }

    //Constructor copia
    public Complejo(Complejo copia) {
//        this.imaginario = copia.imaginario;
//        this.real = copia.real;
//        contador++;
        this(copia.real, copia.imaginario);
    }

    //getters setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    //To string
    @Override
    public String toString() {
        return "Complejo{" + "real=" + real + ", imaginario=" + imaginario + '}';
    }

//    //Suma
//    public void sumarComplejos(double r, double i) {
//
//        this.real += real + r;
//        this.imaginario += imaginario + i;
//    }
//    //Multiplicar 
//
//    public void multiplicarComplejos(double r, double i) {
//        this.real = ((real * r) - (imaginario * i));
//        this.imaginario = ((real * i) + (imaginario * r));
//    }
//
//    //Resta
//    public void restaComplejos(double r, double i) {
//        this.real -= r;
//        this.imaginario -= i;
//    }
//
//    //Division
//    public void divisionComplejos(double r, double i) {
//        this.real = (real * r + imaginario * i) / (Math.pow(r, r) + Math.pow(i, i));
//        this.imaginario = (imaginario * r - real * i) / (Math.pow(r, r) + Math.pow(i, i));
//    }
//
//    //Igualdad
//    public void igualdadComplejos(double r, double i) {
//
//        boolean igualdad = false;
//        if (this.real == r) {
//            igualdad = true;
//        } else {
//            igualdad = false;
//        }
//
//        if (this.imaginario == i) {
//            igualdad = true;
//        } else {
//            igualdad = false;
//        }
    //suma
    public void sumar(Complejo c2) {
        this.real = real + c2.real;
        this.imaginario = imaginario + c2.imaginario;

    }

    //Resta
    public void resta(Complejo c2) {
        this.real = real - c2.real;
        this.imaginario = imaginario - c2.imaginario;

    }

    //Multiplicar
    public void multiplicar(Complejo c2) {
        this.real = (c2.real * real) - (c2.imaginario * imaginario);
        this.imaginario = (c2.real * imaginario) + (c2.imaginario * real);

    }
    
    //Dividir
    public void Dividir (Complejo c2){
        
                
    }
    

}
