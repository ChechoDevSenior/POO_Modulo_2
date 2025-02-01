package Tutoria_clase_05;

public class ContextoCalculadora {
    private Operacion operacion;

    //constructor
    public ContextoCalculadora(Operacion operacion) {
        this.operacion = operacion;
    }

    public double calcular (double a, double b){
        return operacion.ejecutar(a, b);

    }

    public void setOperacion (Operacion op){
        this.operacion = op;
    }

    
    

}
