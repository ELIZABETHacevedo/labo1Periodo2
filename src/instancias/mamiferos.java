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
public class mamiferos extends Animal{
    public Boolean cola,caza;
    public String hablar;

    public mamiferos(Boolean caza, String Nombre, String nombreEspecie, int edad, int horasSuennio,String alimento,String hablar) {
        super(Nombre, nombreEspecie, edad, horasSuennio,alimento);
        this.caza = caza;
        this.hablar=hablar;
    }
    
    
    
    public void jugar(){
    System.out.println("el "+this.nombreEspecie+" "+this.Nombre+"esta jugando  ");    
    }
    
    public void cazar(){
        if (caza) {
            System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" esta cazando");
        }else{
            System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" no es un animal de caza");
        }
    }
    
    public void comunicarse(){
        System.out.println(hablar);
    }

    @Override
    public void comer() {
        System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" come "+this.alimento);
    }

    @Override
    public void dormir() {
    System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" duerme "+this.horasSuennio+" horas");
    }

    @Override
    public void verInfo() {
    System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" tiene "+this.edad+" años");
    }
    
}
