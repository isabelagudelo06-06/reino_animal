/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reino_animal.interfaces;

/**
 *
 * @author macintosh
 */
public interface Camina {
    void caminar();
    
}

class Anfibio implements Camina {
    @Override
    public void caminar(){
        System.out.println("El anfibio puede caminar");
    }
}

class Mamifero implements Camina{
    @Override
    public void caminar(){
        System.out.println("El mamifero esta caminando ... ");
    }
    
}
