package Tutoria_04;

public class Tickete {

    public static int contadorTicketes = 0;

    String nombre;
    String origen;
    //Construtor-->Objetivo: permite crear instancias de la clase 
    public Tickete(String nombre, String origen) {
        this.nombre = nombre;
        this.origen = origen;
        contadorTicketes ++ ;
    }
    
    public void imprimirTicket(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Origen: "+this.origen);
    }

    public int getContador(){
        return contadorTicketes;
    }
    

}
