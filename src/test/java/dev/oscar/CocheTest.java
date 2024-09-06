package dev.oscar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CocheTest {
      @Test
    public void testCalcularPeajeCoche() {
        
        Coche coche = new Coche("12345A");
        
        int peaje = coche.calcularPeaje();
        
        assertEquals(100, peaje, "El peaje para un coche debe ser 100.");
    }

    @Test
    public void testPlacaCoche() {
  
        Coche coche = new Coche("12345A");
        
        assertEquals("12345A", coche.getPlaca(), "La placa del coche debe ser 12345A.");
    }
}
