package Clase_05_Composite;

public class Almacenamiento {
    private int capacidad;

    public Almacenamiento(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void mostraDetalles(){
        System.out.println("El almacenamiento es de: "+this.capacidad+" GB.");

    }   
}
