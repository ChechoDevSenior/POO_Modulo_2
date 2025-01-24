package Clase_03_Ejercicio_Adicional;

public class TarjetaRegalo implements MetodoPago {
    @Override
    public void procesarPago (double monto){
        System.out.println("Procesando pago mediante Tarjeta de Regalo por un monto de: $"+monto);
    } 
    @Override
    public String obtenerDetalles (){
        return "Método de pago: Tarjeta Regalo.";
    } 
    @Override
    public boolean validarMonto (double monto){
        return monto > 0 && monto <= 500;
    }
}
