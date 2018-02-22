import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    //static Siempre en memoria
    //void no retorna nada
    //publico 
    public static void main(String[] args){
        
        //Persona per1= new Persona(10225679, "Magdalena","Sanchez", 1997/05/25);
        
       //INICIO CUENTAS BANCARIAS
        Persona per1= new Persona(10225679, "Magdalena","Sanchez");
        Persona per2= new Persona(14557867, "Joselito","Perez");
        CuentaBancaria acc1 = new CuentaBancaria(1012, per1.idUser  , "1234", per1.nombre, per1.apellido, 0);
        CuentaBancaria acc2 = new CuentaBancaria(1013, per2.idUser, "9876", per2.nombre , per2.apellido ,500000);    
                
        acc1.consignarMonto(100000);
        acc1.consolutarSaldo();
        
        System.out.println("Clave antigua " + acc2.password);
        acc2.cambiarPassword("EstaEsUnaClaveNueva ");
        
        System.out.println("Señor: "+ acc2.nombre + " su clave es: " + acc2.password );
        System.out.println("Señor: "+ acc2.nombre + " su cedula es: " + acc2.idUser );
        System.out.println("Señor: "+ acc2.nombre + " su saldo es:" + acc2.saldoCuenta );
        acc2.consolutarSaldo();
        //FINAL CUENTAS BANCARIAS*/
        
        
        
        
        
        
        
        //Tipo identificador = new Tipo();
        //                         Clase(Constructor)
        //Constructor se usa cuando se tiene informacion del objeto al ser creado.
        //Constructor metodo sin retorno y debe llamarse igual que la clase Ir a Cancion.java
        // 1 Tipo identificador=null
        // 2 Identificador = new Tipo();   --> null Pointer Exception .... objeto declarado sin liberar memoria
        
        /*Cancion track = new Cancion("Reflect");*/
        //track.nombre="ImATrack";        
        //Invocar comportamientos y atributos públicos
        // Mensaje -->> identificador.Attributo() .Método()
        
        /*track.sonar();*/
        
        //JELLIOT !!**{{}}
        //CHECK COdeacademy
    };
    
};
