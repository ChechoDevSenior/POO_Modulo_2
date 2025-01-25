package Clase_04_Ejercicio_Adicional;

public class Main {
    public static void main(String[] args) {
        
        Notificacion notificacion1 = NotificacionFactory.getNotificacion(TipoNotificacion.CORREO);
        notificacion1.imprimir();
        Notificacion notificacion2 = NotificacionFactory.getNotificacion(TipoNotificacion.PUSH);
        notificacion2.imprimir();
        Notificacion notificacion3 = NotificacionFactory.getNotificacion(TipoNotificacion.SMS);
        notificacion3.imprimir();


        System.out.println(notificacion1 == notificacion2);
        System.out.println(notificacion1 == notificacion3);
        System.out.println(notificacion2 == notificacion3);
    }
}
