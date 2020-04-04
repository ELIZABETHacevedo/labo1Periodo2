/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo1periodo2;

import instancias.Aves;
import instancias.Insectos;
import instancias.Reptiles;
import instancias.mamiferos;
import instancias.peces;

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
        
        System.out.println(" ");
        mamiferos m =new mamiferos(true,"pepe","gato",2,8,"ratones","miau");
        m.verInfo();
        m.comer();
        m.dormir();
        m.comunicarse();
        m.cazar();
        System.out.println(" ");
        
        peces p=new peces("gris","salada","cazar","chambita","tiburon",2,1,"peces");
        p.verInfo();
        p.comer();
        p.dormir();
        p.nadar();
        
        System.out.println(" ");
        
        Aves a=new Aves(true,0.5,"claudio","loro",2,8,"semillas");
        a.verInfo();
        a.comer();
        a.dormir();
        a.hablar();
        a.volar();
        System.out.println(" ");
        Aves a2=new Aves(false,1.0,"ramira","aguila",2,8,"aves");
        a2.verInfo();
        a2.comer();
        a2.dormir();
        a2.hablar();
        a2.volar();
        a2.ponerHuevos();
    }
    
}
