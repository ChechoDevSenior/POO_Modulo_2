package Clase_02_Ejercicio_Adicional;

public class Main {
    public static void main(String[] args) {
        // Cambiar la velocidad máxima a tipo int
        Carro carro1 = new Carro("Chevrolet", 2022, 145, 4);
        Carro carro2 = new Carro ("Renault",2014,148,4);
        Moto moto1 = new Moto("Yamaha", 2014, 130, true);
        Moto moto2 = new Moto ("Honda",2018,125,false);

        // Mostrar detalles de los vehículos
        System.out.println(carro1.mostrarDetalles());
        System.out.println(moto1.mostrarDetalles());
        System.out.println(moto1.equals(moto2));
        System.out.println(carro1.equals(carro2));
    }
}

