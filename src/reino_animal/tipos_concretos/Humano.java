/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reino_animal.tipos_concretos;

import reino_animal.interfaces.Habla;
import reino_animal.tipos.Mamifero;

/**
 *
 * @author macintosh
 */
public class Humano extends Mamifero implements Habla {

    public Humano(String nombre) {
        super(nombre);
    }

    @Override
    public void hablar() {
        System.out.println("El humano habla ...");
    }
    
}
