/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

/**
 *
 * @author gabriel
 */
public class Hora {

    private int hora;
    private int minutos;
    private int segundos;

    //segundos siguientes
    public void siguiente() {
        //sumar un segundo a la hora guardada en this
        this.segundos++;
    }

    //Constructor copia
    //Igual que
    public boolean igualQue(Hora aux) {
        //comparamos las horas this y aux
    }

    //Mayor que y menor que devulven true o false
    //segundos entre horas
    public int segundosEntreHoras(Hora aux) {
        //Tengo que mirar los segundos transcurridos entre this y aux  
    }

    //Mostar segundos
    public int segundosDesde() {
        //Tengo que mirar cuantos segundos han transcurrido desde las 0:0:0 hsta la hora qye tenga el objeto.
    }

    //Mostrar hora
    public void mostarHora() {

    }

    //Constructor parametrizado
    public Hora(int hora, int minutos, int segundos) {
        if (Validar(hora, minutos, segundos)) {

            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;

        } else {
            this.hora = 12;
        }

    }

    //Método privado para valora horas minutos y segundos.
    private boolean Validar(int horas, int minutos, int segundos) {
        //Si la hora es correcta devolver true
        //false en otro caso
    }

    //Constructor por defecto
    public Hora() {
    }

    //getters y setters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

}
