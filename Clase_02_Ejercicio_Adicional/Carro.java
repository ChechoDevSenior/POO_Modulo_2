package Clase_02_Ejercicio_Adicional;

public class Carro extends Vehiculo {
    private int numPuertas;

    public Carro(String marca, int modelo, int velocidadMaxima, int numPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + ", Numero de puertas: " + numPuertas;
    }

    // Sobrescribir toString
    @Override
    public String toString() {
        return mostrarDetalles();
    }

    // Sobrescribir equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Carro carro = (Carro) obj;
        return numPuertas == carro.numPuertas;
    }
}

