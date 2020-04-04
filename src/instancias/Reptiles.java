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
public class Reptiles extends Animal{
    public int tamannio,nivelAgresividad;
    public boolean regeneracionMienbros;
    

    public Reptiles(int tamannio, int nivelAgresividad, boolean regeneracionMienbros, String Nombre, String nombreEspecie, int edad, int horasSuennio
    ,String alimento) {
        super(Nombre, nombreEspecie, edad, horasSuennio,alimento);
        this.tamannio = tamannio;
        this.nivelAgresividad = nivelAgresividad;
        this.regeneracionMienbros = regeneracionMienbros;
    }
    
    
    
    public void ponerHuevo(){
    System.out.println("poniendo muchos huevos");
}
    
    public void escalar(){
        System.out.println("subiendo un arbol");
    }
    
    
    @Override
    public void comer() {
    System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" come "+alimento);
    }

    @Override
    public void dormir() {
    System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" duerme "+this.horasSuennio+" horas");
    }

    @Override
    public void verInfo() {
    System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" mide "+this.tamannio+" cm el nivel de agresividad "+this.nivelAgresividad);
    
    }
    
}
