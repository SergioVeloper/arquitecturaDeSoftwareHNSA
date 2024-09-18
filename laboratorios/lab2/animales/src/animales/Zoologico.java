/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sergio
 */
public class Zoologico {
    
    private static Zoologico instance;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Jaula> jaulas;
    
    private Zoologico(String nombrem, String direccion, String telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.jaulas = new ArrayList<>();
    }
    
    public static Zoologico getInstance(String nombre, String direccion, String telefono){        
        if(instance == null){
            instance = new Zoologico(nombre, direccion, telefono);
        }
        return instance;        
    }
    
    public void addJaula(Jaula jaula){
        jaulas.add(jaula);
    }
    
    public void mostrarZoologico(){
        System.out.println("[Zoologico]" + "\nNombre: " + nombre + "\nDireccion: " + direccion + 
                "\nTelefono: " + telefono);
        for(Jaula jaula : jaulas){
            jaula.mostrarJaula();
        }
    }
}

