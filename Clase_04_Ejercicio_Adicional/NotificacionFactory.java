package Clase_04_Ejercicio_Adicional;


public class NotificacionFactory {
    public static Notificacion getNotificacion (TipoNotificacion Tipo){
        switch (Tipo) {
            case CORREO:
            return new CorreoNotificacion();
            case SMS:
                return new SMSNotificacion();
            case PUSH:  
                return new PushNotificacion();
            default:
                throw new IllegalArgumentException("Tipo de forma desconocido.");
        }
    }
}
