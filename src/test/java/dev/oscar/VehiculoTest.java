package dev.oscar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VehiculoTest {

      @Test
    public void testGetPlaca() {

        Vehiculo vehiculo = new VehiculoTestImpl("12345A");
        
        String placa = vehiculo.getPlaca();
        
        assertEquals("12345A", placa, "La placa del vehículo debería ser 12345A.");
    }

    @Test
    public void testSetPlaca() {
      
        Vehiculo vehiculo = new VehiculoTestImpl("12345A");
        
        vehiculo.setPlaca("12345B");

        assertEquals("12345B", vehiculo.getPlaca(), "La placa del vehículo debería ser 12345B.");
    }
}
