/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reino_animal.tipos;

import reino_animal.Vertebrado;
import reino_animal.interfaces.Nada;
import reino_animal.interfaces.RespiraBajoAgua;

/**
 *
 * @author macintosh
 */
public class Pez extends Vertebrado implements Nada, RespiraBajoAgua {

    public Pez(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {
        System.out.println("El pez nada ...");
    }

    @Override
    public void respirarBajoAgua() {
        System.out.println("El pez respira bajo el agua ...");
    }
  
    
}
