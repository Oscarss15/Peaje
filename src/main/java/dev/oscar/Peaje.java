package dev.oscar;

import java.util.ArrayList;
import java.util.List;

public class Peaje {

    String nombre;
    String ciudad;
    int ValorTotal;
    List<Vehiculo> vehiculos;

    public Peaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.ValorTotal=0;
           this.vehiculos = new ArrayList<>();
    }


    public void añadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        int peaje = vehiculo.calcularPeaje();
        ValorTotal =  ValorTotal+peaje;
    }

   
    public void mostrarResultados() {
        System.out.println("Estación: " + nombre + " | Ciudad: " + ciudad);
        System.out.println("Peaje a pagar por cada vehículo:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("- Placa: " + vehiculo.getPlaca() + ", Peaje: $" + vehiculo.calcularPeaje());
        }
        System.out.println("Dinero total: $" + ValorTotal);
    }
}
