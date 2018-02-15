/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Cancion {
    //Atributos , tantos como sean necesarios
    public String nombre;
    
    //Inicializa los valores de las variables deinstancia -- Darle estado al objeto
    public Cancion(String titulo){
        this.nombre = titulo;
    }
    
    //Métodos
    public void sonar(){
        System.out.println("Sonando: " + this.nombre);
    };
    
    
    
};
