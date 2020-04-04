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
public class Insectos extends Animal{

    public int numeroPatas,tamannio,nivelPeligro;
    public Boolean vuelo;
   
    /**
     *
     * @param numeroPatas
     * @param tamannio
     * @param nivelPeligro
     * @param nombreEspecie
     * @param Nombre
     * @param edad
     * @param horasSuennio
     */
    
    
    
    
    public Insectos(int numeroPatas, int tamannio, int nivelPeligro, Boolean vuelo, String Nombre, String nombreEspecie, int edad, int horasSuennio,String alimento){
        super(Nombre, nombreEspecie, edad, horasSuennio,alimento);
        this.numeroPatas = numeroPatas;
        this.tamannio = tamannio;
        this.nivelPeligro = nivelPeligro;
        this.vuelo = vuelo;
    }

    public void caminar() {
        System.out.println(this.Nombre+" esta "+"caminando");
    }
    public void volar(){
        if (vuelo) {
            System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" esta volando");
        }else{
            System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" no puede volar");
        }
    }
    
    public void atacar(){
        if (this.nivelPeligro<5) {
            System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" no es peligroso");
        }else{
            System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" es agresivo y venenoso ten cuidado");
        }
    }
    
    public void camuflarse(){
     System.out.println("escondiendose");
    }
    
    
    @Override
    public void comer() {
    System.out.println("el "+this.nombreEspecie+" "+"esta comiendo "+this.alimento);
    }

    @Override
    public void dormir() {
        System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" esta durmiendo");
    }

    @Override
    public void verInfo() {
    System.out.println("el "+this.nombreEspecie+" "+this.Nombre+" tiene "+this.numeroPatas+" patas");    
    }
    
}
