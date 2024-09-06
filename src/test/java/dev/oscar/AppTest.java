package dev.oscar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


class AppTest {
 

       private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
      @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void testMainOutput() {
       
        Peaje peaje = new Peaje("Peaje Huerna", "Huerna");

        peaje.añadirVehiculo(new Coche("12345A"));
        peaje.añadirVehiculo(new Moto("12345B"));
        peaje.añadirVehiculo(new Camion("12345C", 8)); 

   
        peaje.mostrarResultados();

     
        String output = outContent.toString();

     
        assertTrue(output.contains("Estación: Peaje Huerna | Ciudad: Huerna"));
        assertTrue(output.contains("Placa: 12345A, Peaje: $100"));
        assertTrue(output.contains("Placa: 12345B, Peaje: $50"));
        assertTrue(output.contains("Placa: 12345C, Peaje: $400")); 
        assertTrue(output.contains("Dinero total: $550")); 
    }
}
