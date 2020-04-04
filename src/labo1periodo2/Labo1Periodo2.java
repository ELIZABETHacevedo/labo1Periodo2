/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo1periodo2;

import instancias.Insectos;
import instancias.Reptiles;

/**
 *
 * @author Mery Acevedo
 */
public class Labo1Periodo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Reptiles r=new Reptiles(23,5,true,"martita","geco",1,5,"insectos");
        
        r.verInfo();
        r.escalar();
        r.ponerHuevo();
        r.comer();
        r.dormir();
        
        System.out.println(" ");
        Insectos i=new Insectos(8,15,8,false,"raquel","araña",1,2,"moscas");
        i.verInfo();
        i.volar();
        i.comer();
        i.dormir();
        i.atacar();
        i.caminar();
        i.camuflarse();
    }
    
}
