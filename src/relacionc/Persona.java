/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionc;

/**
 *
 * @author gabriel
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String apellido2;
    private int edad;
    private String nif;

    //por defecto
    public Persona() {
    }

    //Parametrizado
    public Persona(String nombre, String apellido, String apellido2, int edad, String nif) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.nif = nif;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        
        if(edad<0 || edad > 125){
            System.out.println("a edad no es válida");
            this.edad=0;
        }else{
             this.edad = edad;
        }
       
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        
        nif.length();
        
        if(nif.length()>9 || nif.length()<9){
            System.out.println("el NIF no está bien establecido");
            this.nif= "";
        }else{
        
        this.nif = nif;
        
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", apellido2=" + apellido2 + ", edad=" + edad + ", nif=" + nif + '}';
    }
    
}
