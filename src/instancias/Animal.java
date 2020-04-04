/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

/**
 *
 * @author Mery Acevedo
 */
public abstract class Animal {
    public String Nombre,nombreEspecie,alimento;
    public int edad,horasSuennio;

    public Animal(String Nombre, String nombreEspecie, int edad, int horasSuennio,String alimento) {
        this.Nombre = Nombre;
        this.nombreEspecie = nombreEspecie;
        this.edad = edad;
        this.horasSuennio = horasSuennio;
        this.alimento=alimento;
    }
    
    
    
    abstract void comer();
    abstract void dormir();
    abstract void verInfo();
    
    
    
    
}
