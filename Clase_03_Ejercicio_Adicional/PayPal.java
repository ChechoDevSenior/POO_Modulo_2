package Clase_03_Ejercicio_Adicional;

public class PayPal implements MetodoPago {
    @Override
    public void procesarPago (double monto){
        System.out.println("Procesando pago mediante la plataforma PayPal por un monto de: $"+monto);
    }
    
    @Override
    public String obtenerDetalles(){
        return "Método de pago: PayPal";

    }

    @Override
    public boolean validarMonto (double monto){
        return monto >= 1 && monto <= 10000;
    }
}
