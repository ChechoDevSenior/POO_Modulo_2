package Clase_05_Composite;

public class TarjetaMadre {
    private Procesador procesador;
    private Memoria memoria;
    private Almacenamiento almacenamiento;
    private Grafica grafica;

    public TarjetaMadre (int Almacenamiento, int Grafica, int Memoria, int capacidadProcesador, int nucleosProcesador){
        this.almacenamiento = new Almacenamiento(0);
        this.grafica = new Grafica(0);
        this.memoria = new Memoria(0);
        this.procesador = new Procesador(0,0);
    }

    public void getMotherBoardComponents(){
        System.out.println("Componentes de la tarjeta madre.");
        almacenamiento.mostraDetalles();
        memoria.mostraDetalles();
        procesador.mostraDetalles();
        grafica.mostraDetalles();
    }
    
}
