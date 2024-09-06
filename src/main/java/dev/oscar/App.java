package dev.oscar;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    
    public static void main(String[] args) {
        Peaje peaje = new Peaje("Peaje Huerna", "Huerna");

        peaje.añadirVehiculo(new Coche("12345A"));
        peaje.añadirVehiculo(new Moto("12345B"));
        peaje.añadirVehiculo(new Camion("12345C", 8)); 

        peaje.mostrarResultados();
    }
}
