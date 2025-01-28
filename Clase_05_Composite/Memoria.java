package Clase_05_Composite;

public class Memoria {
    private int capacidad;

    public Memoria(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void mostraDetalles(){
        System.out.println("La memoria es de: "+this.capacidad+" GB.");

    }
    
}
