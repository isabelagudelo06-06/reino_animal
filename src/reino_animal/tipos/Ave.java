/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reino_animal.tipos;

import reino_animal.Vertebrado;
import reino_animal.interfaces.RespiraAire;
import reino_animal.interfaces.Vuela;

/**
 *
 * @author macintosh
 */
public class Ave extends Vertebrado implements Vuela, RespiraAire {

    public Ave(String nombre) {
        super(nombre);
    }

    @Override
    public void respirarAire() {
        System.out.println("El ave respira aire ...");
    }

    @Override
    public void volar() {
        System.out.println("El ave vuela ...");
    }
   
}
