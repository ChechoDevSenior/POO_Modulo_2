package Clase_05_Composite;

public class Grafica {
    private int capacidad;

    public Grafica(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void mostraDetalles(){
        System.out.println("La memora gráfica es de "+this.capacidad+" GB.");

    }
}
