/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author sergio
 */
public class Ave extends Animal{
    
    private double peso;
    private double tamanoAlas;

    public Ave(String nombre, double peso, double tamanoAlas) {
        super(nombre);
        this.peso = peso;
        this.tamanoAlas = tamanoAlas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanoAlas() {
        return tamanoAlas;
    }

    public void setTamanoAlas(double tamanoAlas) {
        this.tamanoAlas = tamanoAlas;
    }

    @Override
    public String toString() {
        return "[Ave]" + "\nNombre" + nombre + "\nPeso: " + peso + 
                "\nTamaño alas: " + tamanoAlas;
    }
        
}
