/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author sergio
 */
public class PezFactory implements IAnimalFactory{

    @Override
    public Animal createAnimal(String nombre, double longitud, double extra1, String extra2) {
        return new Pez(nombre, longitud);
    }
    
}
