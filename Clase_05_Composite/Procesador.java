package Clase_05_Composite;

public class Procesador {
    private int capacidad;
    private int nucleos;

    
    public Procesador(int capacidad, int nucleos) {
        this.capacidad = capacidad;
        this.nucleos = nucleos;
    }

    public Procesador(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void mostraDetalles(){
        System.out.println("La memora es de: "+this.capacidad+" GhZ y tiene "+nucleos+" nucleos.");

    }
}
