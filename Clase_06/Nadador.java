package Clase_06;

public interface Nadador {

    public static String estilo = "libre";
    void nada();
    String nadarDistancia (double distancia);

    default void clavado(){
        System.out.println("Al agua...!!!");
    }


    

    static void patear(){
        System.out.println("patada...!!!!");
    }


}
