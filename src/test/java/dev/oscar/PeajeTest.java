package dev.oscar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PeajeTest {
    

      @Test
    public void testAgregarVehiculoYCalcularTotal() {

        Peaje peaje = new Peaje("Peaje Huerna", "Huerna");

        Coche coche = new Coche("12345A");
        Moto moto = new Moto("12345B");
        Camion camion = new Camion("12345C", 8); 
    
        peaje.añadirVehiculo(coche);
        peaje.añadirVehiculo(moto);
        peaje.añadirVehiculo(camion);
 
        int totalEsperado = coche.calcularPeaje() + moto.calcularPeaje() + camion.calcularPeaje();

        assertEquals(totalEsperado, peaje.ValorTotal, "El valor total recaudado no es correcto.");
    }

    @Test
    public void testListaDeVehiculos() {
        
        Peaje peaje = new Peaje("Peaje NHuernaorte", "Huerna");

  
        Coche coche = new Coche("12345A");
        peaje.añadirVehiculo(coche);

        assertEquals(1, peaje.vehiculos.size(), "La lista de vehículos debería tener 1 vehículo.");
        assertEquals("12345A", peaje.vehiculos.get(0).getPlaca(), "La placa del vehículo en la lista no coincide.");
    }

    @Test
    public void testPeajeSinVehiculos() {
    
        Peaje peaje = new Peaje("Peaje Huerna", "Huerna");

        assertEquals(0, peaje.ValorTotal, "El valor total debería ser 0 ya que no hay vehículos.");
        assertTrue(peaje.vehiculos.isEmpty(), "La lista de vehículos debería estar vacía.");
    }
}
