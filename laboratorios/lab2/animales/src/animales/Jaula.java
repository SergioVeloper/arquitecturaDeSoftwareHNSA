/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author sergio
 */
public class Jaula {
    
    private Animal animal;
    private double alto;
    private double ancho;
    private double largo;

    public Jaula(Animal animal, double alto, double ancho, double largo) {
        this.animal = animal;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public  void mostrarJaula(){
        System.out.println("[Jaula]" + animal.getNombre() + 
                "\nDimension: " + "\nAlto:"+ alto + "\nAncho: " + ancho + 
                "\nLargo: " + largo);
        System.out.println(animal);
    }
        
}
