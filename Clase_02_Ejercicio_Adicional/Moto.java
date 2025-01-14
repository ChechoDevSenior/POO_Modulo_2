package Clase_02_Ejercicio_Adicional;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, int modelo, int velocidadMaxima, boolean tieneSidecar) {
        super(marca, modelo, velocidadMaxima);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + ", Tiene Sidecar: " + (tieneSidecar ? "Sí" : "No");
    }

    // Sobrescribir toString
    @Override
    public String toString() {
        return mostrarDetalles();
    }

    // Sobrescribir equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Moto moto = (Moto) obj;
        return tieneSidecar == moto.tieneSidecar;
    }
}
