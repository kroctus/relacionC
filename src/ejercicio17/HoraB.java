package ejercicio17;

public class HoraB {

    private int hora;
    private int minutos;
    private int segundos;
    public static final int SEGUNDOS_HORA = 3600;
    public static final int SEGUNDOS_DIA = 86400;
    public static final int SEGUNDOS_MINUTOS = 60;

    //segundos siguientes
    public void siguiente() {
        //sumar un segundo a la hora guardada en this
        this.segundos++;
    }

    //Constructor copia
    //Igual que
    public boolean igualQue(Hora aux) {
        //comparamos las horas this y aux
        //CONSEJO PASAR TODO A SEGUNDOS Y COMPARA LOS SEGUNDOS.
    }

    //Mayor que y menor que devulven true o false
    //segundos entre horas
    public int segundosEntreHoras(Hora aux) {
        //Tengo que mirar los segundos transcurridos entre this y aux
        int segundosObjetos = this.segundosDesde();
        int segundosAux = aux.segundosDesde();
        int segundosDevolver;
        if (segundosAux > segundosObjetos) {
            return segundosDevolver = segundosAux - segundosObjetos;
        } else {
            return segundosDevolver = SEGUNDOS_DIA - (segundosObjetos - segundosAux);
        }

    }

    //Mostar segundos
    public int segundosDesde() {
        //Tengo que mirar cuantos segundos han transcurrido desde las 0:0:0 hsta la hora qye tenga el objeto.
        int segundosTranscurridos = (hora * SEGUNDOS_HORA) + (minutos * SEGUNDOS_MINUTOS) + segundos;
        return segundosTranscurridos;
    }

    public int segundosHasta() {
        return SEGUNDOS_DIA - segundosDesde();
    }

    //Mostrar hora
    public void mostarHora() {
        System.out.println(this.hora + ": " + this.minutos + ": " + this.segundos);

    }

    //Constructor parametrizado
    public HoraB(int hora, int minutos, int segundos) {
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
        //Return toda la condición con &&s 
    }

    //Constructor por defecto
    public HoraB() {
    }
    
    //Método copia 
    
    public HoraB copiar  (){
        HoraB auxiliar= new HoraB( this.hora, this.minutos, this.segundos);
        return auxiliar;    
        }
    

    //getters y setter
    // Limitar en los setters la entrada de horas incorrectas.
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
