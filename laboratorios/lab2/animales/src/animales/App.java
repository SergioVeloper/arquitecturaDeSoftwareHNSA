package animales;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Zoologico zoo = Zoologico.getInstance("Zoologico La Paz", "Mallaza", "123456789");
        Scanner scanner = new Scanner(System.in);
        IAnimalFactory factory;

        while (true) {
            System.out.println("1. Añadir Mamífero");
            System.out.println("2. Añadir Ave");
            System.out.println("3. Añadir Pez");
            System.out.println("4. Mostrar Zoológico");
            System.out.println("5. Salir");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 5) break;

            switch (opcion) {
                case 1 -> {
                    
                    System.out.println("Introduce el nombre del mamífero:");
                    String nombre = scanner.nextLine();
                    
                    System.out.println("Introduce la temperatura del mamífero:");
                    double temperatura = scanner.nextDouble();
                    
                    System.out.println("Introduce el número de patas del mamífero:");
                    int nroDePatas = scanner.nextInt();
                    scanner.nextLine();  
                    
                    System.out.println("Introduce el color del mamífero:");
                    String color = scanner.nextLine();
                    
                    factory = new MamiferoFactory();
                    Animal mamifero = factory.createAnimal(nombre, temperatura, nroDePatas, color);
                    
                    System.out.println("Introduce las dimensiones de la jaula (alto, ancho, largo):");
                    double alto = scanner.nextDouble();
                    double ancho = scanner.nextDouble();
                    double largo = scanner.nextDouble();
                    
                    Jaula jaulaMamifero = new Jaula(mamifero, alto, ancho, largo);
                    zoo.addJaula(jaulaMamifero);
                }
                case 2 -> {
                    
                    System.out.println("Introduce el nombre del ave:");
                    String nombre = scanner.nextLine();
                    
                    System.out.println("Introduce el peso del ave:");
                    double peso = scanner.nextDouble();
                    
                    System.out.println("Introduce el tamaño de las alas del ave:");
                    double tamañoAlas = scanner.nextDouble();
                    scanner.nextLine();  

                    factory = new AveFactory();
                    Animal ave = factory.createAnimal(nombre, peso, tamañoAlas, "");
                    
                    System.out.println("Introduce las dimensiones de la jaula (alto, ancho, largo):");
                    double alto = scanner.nextDouble();
                    double ancho = scanner.nextDouble();
                    double largo = scanner.nextDouble();
                    
                    Jaula jaulaAve = new Jaula(ave, alto, ancho, largo);
                    zoo.addJaula(jaulaAve);
                }
                case 3 -> {
                    
                    System.out.println("Introduce el nombre del pez:");
                    String nombre = scanner.nextLine();
                    
                    System.out.println("Introduce la longitud del pez:");
                    double longitud = scanner.nextDouble();
                    scanner.nextLine();  
                    
                    factory = new PezFactory();
                    Animal pez = factory.createAnimal(nombre, longitud, 0, "");
                    
                    System.out.println("Introduce las dimensiones de la jaula (alto, ancho, largo):");
                    double alto = scanner.nextDouble();
                    double ancho = scanner.nextDouble();
                    double largo = scanner.nextDouble();
                    
                    Jaula jaulaPez = new Jaula(pez, alto, ancho, largo);
                    zoo.addJaula(jaulaPez);
                }
                case 4 -> zoo.mostrarZoologico();
                default -> System.out.println("Opción no válida");
            }
        }
        
        scanner.close();
    }
}
