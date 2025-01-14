package Clase_02_Ejercicio_Adicional;

public class Vehiculo {
    
    private String marca;
    private int modelo;
    private int velocidadMaxima;

    public Vehiculo(String marca, int modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String mostrarDetalles() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", velocidadMaxima=" + velocidadMaxima + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehiculo other = (Vehiculo) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modelo != other.modelo)
            return false;
        if (velocidadMaxima != other.velocidadMaxima)
            return false;
        return true;
    }

}
