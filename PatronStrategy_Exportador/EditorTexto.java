package PatronStrategy_Exportador;

public class EditorTexto {

    private Exportador estrategia;
    private String contenido;


    public EditorTexto(Exportador estrategia){
        this.estrategia = estrategia;
    }

    public EditorTexto(String contenido) {
        this.contenido = contenido;
    }

    public EditorTexto(Exportador estrategia, String contenido) {
        this.estrategia = estrategia;
        this.contenido = contenido;
    }

    public EditorTexto() {
    }
    
    public void setEstrategia (Exportador estrategia){
        this.estrategia = estrategia;
    }


    //Método para realizar la exportación usando la estrategia actual 
    public void exportar (){
        if (estrategia == null) {
            System.out.println("Por favor, seleccionar una estrategia de exportación."); 
        }else{
            estrategia.exportar(contenido);
        }
        
    }

    

}
