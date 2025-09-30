/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reino_animal;

import reino_animal.tipos_concretos.Canario;
import reino_animal.tipos_concretos.Humano;
import reino_animal.tipos_concretos.Lagarto;
import reino_animal.tipos_concretos.Perro;
import reino_animal.tipos_concretos.Pez_Plata;
import reino_animal.tipos_concretos.Rana;

/**
 *
 * @author macintosh
 */
public class Reino_Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Canario canario = new Canario("Canario");
        System.out.println(canario.getNombre());
        canario.respirarAire();
        canario.volar();
        
        Humano humano = new Humano("Humano");
        System.out.println(humano.getNombre());
        humano.caminar();
        humano.respirarAire();
        humano.hablar();
        
        Lagarto lagarto = new Lagarto("Lagarto");
        System.out.println(lagarto.getNombre());
        lagarto.caminar();
        lagarto.respirarAire();
        lagarto.respirarBajoAgua();
        
        Perro perro = new Perro("Perro");
        System.out.println(perro.getNombre());
        perro.caminar();
        perro.respirarAire();
        
        Pez_Plata pez_plata = new Pez_Plata("Pez Plata");
        System.out.println(pez_plata.getNombre());
        pez_plata.nadar();
        pez_plata.respirarBajoAgua();
        
        Rana rana = new Rana("Rana");
        System.out.println(rana.getNombre());
        rana.caminar();
        rana.nadar();
        rana.respirarAire();
        rana.respirarBajoAgua();
        
    }
    
}
