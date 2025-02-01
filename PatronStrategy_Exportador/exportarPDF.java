package PatronStrategy_Exportador;

public class exportarPDF implements Exportador{

    @Override
    public void exportar (String contenido){
        System.out.println("Exportando archivo en PDF. "+contenido);
    }

}
