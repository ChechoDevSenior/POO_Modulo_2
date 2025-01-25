import Factory.Forma;
import Factory.FormaFactory;
import Factory.TipoForma;
import Singleton.Logger;

public class Main {
    public static void main(String[] args) {

        //Singleton
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();

        logger1.log("Se imprimió el pasaporte.");
        logger2.log("Se imprimió la historia clinica.");

        System.out.println(logger1);
        System.out.println(logger2);

        System.out.println(logger1 == logger2);

        //Factory

        Forma forma1 = FormaFactory.getForma(TipoForma.CIRCULO);
        forma1.dibujar();
        Forma forma2 = FormaFactory.getForma(TipoForma.RECTANGULO);
        forma2.dibujar();
        Forma forma3 = FormaFactory.getForma(TipoForma.TRIANGULO);
        forma3.dibujar();

        System.out.println(forma1 == forma2);




    }
}
