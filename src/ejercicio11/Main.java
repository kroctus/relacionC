/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author gabriel
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Para crear un coche necesito: el motor, cuatro ruedas y dos puertas
        
       Coche delorian = new Coche();
       
       Motor motorD = new Motor(2000, false,"Diesel", "Delorean");
       Rueda ruedaDD = new Rueda("rdd", true, 225);
       Rueda ruedaDI = new Rueda("rdi", true, 225);
       Rueda ruedaTD = new Rueda("rTD", true, 225);
       Rueda ruedaTI = new Rueda("rTI", true, 225);
       
       Ventana vp= new Ventana("vp" , false);
       Ventana vc= new Ventana("vc" , false);
       
       Puerta piloto= new Puerta ("pp",vp);
       Puerta copiloto= new Puerta("pc",vc);
       
       //Instancia el coche con el constructor
       
       Coche nuevo = new Coche("OtroCoche" , motorD, ruedaDD, ruedaDI,ruedaTD, ruedaTI, piloto, copiloto);
       
       //Otra opción es utilizar los setters
       
       delorian.setId("Deleorean");
       delorian.setMotor(motorD);
       delorian.setPuertaCopiloto(copiloto);
       delorian.setPuertaPiloto(piloto);
       delorian.setRuedaDD(ruedaDD);
       delorian.setRuedaDI(ruedaDI);
       delorian.setRuedaTD(ruedaTD);
       delorian.setRuedaTI(ruedaTI);
       
        System.out.println(delorian);
       
        
    }
    
}
