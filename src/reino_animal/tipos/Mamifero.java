/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reino_animal.tipos;

import reino_animal.Vertebrado;
import reino_animal.interfaces.Camina;
import reino_animal.interfaces.RespiraAire;

/**
 *
 * @author macintosh
 */
public class Mamifero extends Vertebrado implements RespiraAire, Camina {

    public Mamifero(String nombre) {
        super(nombre);
    }

    @Override
    public void caminar() {
        System.out.println("El mamifero camina ...");
    }
    
    @Override
    public void respirarAire() {
        System.out.println("El mamifero respira aire ...");
    }
   
}
