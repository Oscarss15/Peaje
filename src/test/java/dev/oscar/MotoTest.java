package dev.oscar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MotoTest {
    
    @Test
    public void testCalcularPeajeMoto() {
       
        Moto moto = new Moto("12345A");
        
        int peaje = moto.calcularPeaje();

        assertEquals(50, peaje, "El peaje para una moto debe ser 50.");
    }

    @Test
    public void testPlacaMoto() {
   
        Moto moto = new Moto("12345A");

        assertEquals("12345A", moto.getPlaca(), "La placa de la moto debe ser 12345A.");
    }
}
