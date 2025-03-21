package Clase_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Alarma alarma1 = new Alarma("QWERTY123");
        alarma1.getCodigo();
        Alarma.SensorHumo sensorCocina = alarma1.new SensorHumo("12klj", "Primer Piso");
        Alarma.SensorHumo sensorSala = alarma1.new SensorHumo("12hkj", "Primer Piso");

        sensorCocina.detectarHumo();
        sensorSala.lanzarAlerta();

        Notificacion notificacionEmail = new Notificacion() {
            @Override
            public void enviar(String mensaje) {
                System.out.println("Envio de email: " + mensaje);
            }
        };
        notificacionEmail.enviar("Reunión de mañana.");

        Timer temporizador = new Timer();
        TimerTask myTimer = new TimerTask() {
            private int contador = 0;
            private final String mensaje = "Tu puedes, sigue estudiando programación";

            @Override
            public void run() {
                System.out.println(mensaje);
                if (contador == 5) {
                    temporizador.cancel();
                }
            }
        };
        temporizador.schedule(myTimer, 0, 2000);

        //Lambda
        Operacion  suma = (x, y) -> x + y;
        suma.ejecutar(10, 8);

        Sumar sumaClase = new Sumar();
        sumaClase.ejecutar(10, 8);

        List<String> palabras = new ArrayList<>();

        palabras.add("Hola");
        palabras.add("¿Cómo estas?");
        palabras.add("Chao");

        List<String> filtradas = palabras.stream().filter(palabra -> palabra.endsWith("?")).collect(Collectors.toList());
    }

    
}
