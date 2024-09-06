package dev.oscar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CamionTest {
      @Test
    public void testCalcularPeajeConUnEje() {
      
        Camion camion = new Camion("12345A", 1);
              
        int peaje = camion.calcularPeaje();
               
        assertEquals(50, peaje, "El peaje debe ser 50 por un eje.");
    }

    @Test
    public void testCalcularPeajeConDosEjes() {
       
        Camion camion = new Camion("12345A", 2);
           
        int peaje = camion.calcularPeaje();
                
        assertEquals(100, peaje, "El peaje debe ser 100 por dos ejes.");
    }

    @Test
    public void testCalcularPeajeConCuatroEjes() {
       
        Camion camion = new Camion("12345A", 4);
           
        int peaje = camion.calcularPeaje();
             
        assertEquals(200, peaje, "El peaje debe ser 200 por cuatro ejes.");
    }

    @Test
    public void testPlacaCamion() {
       
        Camion camion = new Camion("12345A", 3);
        
        assertEquals("12345A", camion.getPlaca(), "La placa del camión debe ser 12345A.");
    }
}
