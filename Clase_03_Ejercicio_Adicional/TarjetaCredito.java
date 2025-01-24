package Clase_03_Ejercicio_Adicional;

public class TarjetaCredito implements MetodoPago {
    @Override
    public void procesarPago (double monto){
        System.out.println("Procesando pago con Tarjeta de Crédito por un monto de: $"+monto);
    }
    
    @Override
    public String obtenerDetalles(){
        return "Método de pago: Tarjeta de Crédito";

    }

    @Override
    public boolean validarMonto (double monto){
        return monto > 0;
    }
}
