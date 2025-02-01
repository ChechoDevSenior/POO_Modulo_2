package Heores_Composicion;

import java.util.ArrayList;
import java.util.List;

public class SuperHeroe {

    private String nombre;
    private List <Habilidad> habilidades;

    public SuperHeroe(String nombre, Habilidad habilidad) {
        this.nombre = nombre;
        habilidades = new ArrayList<>();
        habilidades.add(habilidad);
    }

    public void addHabilidad (Habilidad habilidad){
        this.habilidades.add(habilidad);
    }



    
    

    

}
