package Tutoria_clase_05;

public class Main {
    public static void main(String[] args) {
        
        Operacion suma = new Suma(); 
        Operacion resta = new Resta();
        Operacion multiplicar = new Multiplicar();

        ContextoCalculadora calculadora = new ContextoCalculadora(multiplicar);
        ContextoCalculadora calculadora1 = new ContextoCalculadora(suma);
        ContextoCalculadora calculadora2 = new ContextoCalculadora(resta);
        double resultado = calculadora.calcular(6, 9);
        System.out.println("El resultado de la multiplicación es: "+resultado);

        calculadora.setOperacion(multiplicar);





    }
}
