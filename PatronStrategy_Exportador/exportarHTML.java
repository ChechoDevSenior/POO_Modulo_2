package PatronStrategy_Exportador;

public class exportarHTML implements Exportador {

    @Override 
    public void exportar (String contenido){
        System.out.println("Exportando archivo en HTML. "+contenido);
    }

}
