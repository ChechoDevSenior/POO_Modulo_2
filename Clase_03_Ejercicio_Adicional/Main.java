package Clase_03_Ejercicio_Adicional;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MetodoPago> metodosPago = new ArrayList<>();
        metodosPago.add(new Bitcoin());
        metodosPago.add(new PayPal());
        metodosPago.add(new TarjetaCredito());
        metodosPago.add(new TarjetaRegalo());
        metodosPago.add(new TransferenciaBancaria());
    }


        
    // Simular el procesamiento de pagos
    double[] montos = {100, 5000, 25, 0.002, 200}; 
    for (int i = 0; i < metodosPago.size(); i++) {
        MetodoPago metodo = metodosPago.get(i);
        double monto = montos[i];

        System.out.println(metodo.obtenerDetalles());
        if (metodo.validarMonto(monto)) {
            metodo.procesarPago(monto);
        } else {
            System.out.println("El monto " + monto + " no es válido para " + metodo.obtenerDetalles());
        }
    }
}

