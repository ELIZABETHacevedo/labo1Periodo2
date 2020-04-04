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
public class Aves extends Animal{
   
    public boolean comunicacion;
    public Double peso;

    public Aves(boolean comunicacion, Double peso, String Nombre, String nombreEspecie, int edad, int horasSuennio,String alimento) {
        super(Nombre, nombreEspecie, edad, horasSuennio,alimento);
        this.comunicacion = comunicacion;
        this.peso = peso;
    }

   

   

    
    
    
    
public void volar(){
    System.out.println("volando");
}
public void ponerHuevos(){
    System.out.println("poniendo un huevo");
}

    public void hablar(){
    System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" "+this.comunicacion);    
    }
    
    @Override
    public void comer() {
        System.out.println("se alimenta de "+this.alimento);
        }

    @Override
    public void dormir() {
        System.out.println("duerme: "+this.horasSuennio+" horas");
    }

    @Override
    public void verInfo() {
        System.out.println("el "+this.nombreEspecie+" "+this.Nombre+"pesa "+this.peso);
       }
    
}
