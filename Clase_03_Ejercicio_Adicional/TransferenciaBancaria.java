package Clase_03_Ejercicio_Adicional;

public class TransferenciaBancaria implements MetodoPago {
    @Override
    public void procesarPago (double monto){
        System.out.println("Procesando pago mediante transferencia bancaria por un monto de: $"+monto);
    }
    
    @Override
    public String obtenerDetalles(){
        return "Método de pago: Transferencia bancaria.";

    }

    @Override
    public boolean validarMonto (double monto){
        return monto >= 10;
    }

}
