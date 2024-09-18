/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author sergio
 */
public class AveFactory implements IAnimalFactory{

    @Override
    public Animal createAnimal(String nombre, double peso, double tamanoAlas, String extra) {
        return new Ave(nombre, peso, tamanoAlas);
    }
    
}
