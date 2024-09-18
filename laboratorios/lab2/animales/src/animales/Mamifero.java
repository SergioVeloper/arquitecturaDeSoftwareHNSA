/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author sergio
 */
public class Mamifero extends Animal{
    
    private String nombre;
    private double temperatura;
    private int nroPatas;
    private String color;
    
    public Mamifero(String nombre, double temperatura, int nroPatas, String color){
        
        super(nombre);
        this.temperatura = temperatura;
        this.nroPatas = nroPatas;
        this.color = color;
        
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getNroPatas() {
        return nroPatas;
    }

    public void setNroPatas(int nroPatas) {
        this.nroPatas = nroPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "[Mamifero]" + "\nNombre: " + nombre + "\nTemperatura: " + temperatura + 
                "\nNro. patas: " + nroPatas + "\nColor: " + color;
    }
        
}
