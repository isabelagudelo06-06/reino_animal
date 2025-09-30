/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reino_animal.tipos;

import reino_animal.Vertebrado;
import reino_animal.interfaces.Camina;
import reino_animal.interfaces.Nada;
import reino_animal.interfaces.RespiraAire;
import reino_animal.interfaces.RespiraBajoAgua;

/**
 *
 * @author macintosh
 */
public class Anfibio extends Vertebrado implements RespiraAire, RespiraBajoAgua, Nada, Camina {

    public Anfibio(String nombre) {
        super(nombre);
    }

    @Override
    public void respirarAire() {
        System.out.println("El anfibio respira aire ...");
    }

    @Override
    public void respirarBajoAgua() {
        System.out.println("El anfibio respira bajo el agua ...");
    }

    @Override
    public void nadar() {
        System.out.println("El anfibio nada ...");
    }

    @Override
    public void caminar() {
        System.out.println("El anfibio camina ...");
    }
    

    
}