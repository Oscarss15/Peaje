package dev.oscar;

public class Camion extends Vehiculo {
    
    private int numeroDeEjes;

    public Camion(String placa,int numeroDeEjes) {
        super(placa);
        this.numeroDeEjes = numeroDeEjes;
    }

    @Override
    public int calcularPeaje() {
        return 50 * numeroDeEjes; 
    }

}
