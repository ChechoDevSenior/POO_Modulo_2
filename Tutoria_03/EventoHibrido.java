package Tutoria_03;

public class EventoHibrido extends Evento implements StreamingCapable {
    String plataformaStreaming;

    public EventoHibrido(String nombre, String ubicacion, String fecha, String plataformaStreaming) {
        super(nombre, ubicacion, fecha);
        this.plataformaStreaming = plataformaStreaming;
    }

    @Override
    public void iniciarTransmision (String url){
        System.out.println("Yo aqui inicio transmisión con lógica propia");
        System.out.println("Dirigir la transmisión hacia la url: "+url);
    }

    @Override
    public void finalizarTransmision(){
        System.out.println("Finalizando transmisión.");
    }

}
