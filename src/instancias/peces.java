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
public class peces extends Animal{

    public peces(String color, String tipoAgua, String especialidad, String Nombre, String nombreEspecie, int edad, int horasSuennio,String alimento) {
        super(Nombre, nombreEspecie, edad, horasSuennio,alimento);
        this.color = color;
        this.tipoAgua = tipoAgua;
        this.especialidad = especialidad;
    }
    public String color,tipoAgua,especialidad;
    
            
            
    public void nadar(){
        System.out.println("nadando");
    }
    

    @Override
    public void comer() {
    System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" esta comiendo "+this.alimento);
    }

    @Override
    public void dormir() {//rated methods, choose Tools | Templates.
    System.out.println(this.nombreEspecie+" "+this.Nombre+" no duerme");
    }

    @Override
    public void verInfo() {
    System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" es de color "+this.color+" funciona "+this.especialidad);
    
    }
    
}
