/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author sergio
 */
public class Pez extends Animal{
    
    private double longitud;

    public Pez(String nombre, double longitud) {
        super(nombre);
        this.nombre = nombre;
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    @Override
    public String toString(){
        return "[Pez]" + "\nNombre: " + nombre + "\nLongitud: " + longitud;
    }
    
}
