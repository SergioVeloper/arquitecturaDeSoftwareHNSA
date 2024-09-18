/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author sergio
 */
public class MamiferoFactory implements IAnimalFactory{

    @Override
    public Animal createAnimal(String nombre, double temperatura, double nroPatas, String color) {
        return new Mamifero(nombre, temperatura, (int) nroPatas, color);
    }
    
}
