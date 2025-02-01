package PatronStrategy_Exportador;

public class exportarDOCX implements Exportador{
    
    @Override
    public void exportar (String contenido){
        System.out.println("Exportando archivo en DOCX. "+contenido);
    }

}
