package Tutoria_03;

public class Evento {
    private String nombre;
    private String ubicacion;
    private String fecha;

    public Evento() {
        // Constructor vacío
    }

    public Evento(String nombre, String ubicacion, String fecha) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
    }

    // Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return this.fecha;
    }

    // Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Detalles del evento:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Ubicación: " + this.ubicacion);
        System.out.println("Fecha: " + this.fecha);
    }
}

