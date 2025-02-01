package Heores_Composicion;

public class Main {
    public static void main(String[] args) {

        SuperHeroe Super1 = new SuperHeroe("SuperHeroe", new Volar());
        Super1.addHabilidad(new Invisibilidad());
        Super1.addHabilidad(new Velocidad());
        Super1.imprimirHeroe();
    }
}
