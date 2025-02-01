package PatronStrategy_Exportador;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto("Este es el contenido del texto.");

        editor.setEstrategia(new exportarPDF());
        editor.exportar();
    }

}
