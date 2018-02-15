/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class CuentaBancaria {
        int idNumber;
        String password;
        String nombre;
        String apellido;
        double saldoCuenta;
        
        //Constructor
        
       public CuentaBancaria(int idNumber, String password, String nombre, String apellido, double saldoCuenta ){
           this.idNumber=idNumber;
           this.password=password;
           this.nombre=nombre;
           this.apellido=apellido;           
           this.saldoCuenta=saldoCuenta;
       };
        
        //Métodos
        
        public double consignarMonto(double cash){
            return this.saldoCuenta = this.saldoCuenta + cash;
        };
        public double retirarMonto(double cash){
            return this.saldoCuenta = this.saldoCuenta - cash;
            
        };
        public void cambiarPassword(String newPassword){
            this.password = newPassword;
            
        };
        
        public void consolutarSaldo(){
            System.out.println("Su saldo es:" + this.saldoCuenta);           
            
        };
    
}
