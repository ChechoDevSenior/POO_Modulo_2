package Clase_03_Ejercicio_Adicional;

public class Bitcoin implements MetodoPago{

    @Override
    public void procesarPago (double monto){
        System.out.println("Procesando pago en criptomonedas por un monto de "+monto+" BTC.");
    } 
    @Override
    public String obtenerDetalles(){
        return "Método de pago: Bitcoin.";
    } 
    @Override
    public boolean validarMonto (double monto){
        return monto >= 0.0001;
    }
        
}
