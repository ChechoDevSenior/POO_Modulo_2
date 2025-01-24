package Clase_03_Ejercicio_Adicional;

public interface MetodoPago {
    void procesarPago (double monto); //Procesa el pago.
    String obtenerDetalles(); // Devuelve detalles del método de pago.
    boolean validarMonto (double monto); // Valida el monto de acuerdo con el método de pago
}
