package Clase_05_Composite;

public class Computador {
    private TarjetaMadre tarjetaMadre;

    public Computador (){
        tarjetaMadre = new TarjetaMadre(1000, 64, 16, 4, 6);
    }

    public void mostrarConfiguracion(){
        System.out.println("Configuración de la PC: ");
        tarjetaMadre.getMotherBoardComponents();
    }
    
}   
