package Clase_01;

public class main {
    public static void main(String[] args) {
        book libro1 = new book();
        book libro2 = new book("Cien años de soledad", "Gabo", 1967,"Narrativo", null);
        book libro3 = new book("Don quijote de la mancha", "Miguel de Cervantes", 1605, null, false);
        libro1.title = "El aro"; 
        libro3.getBook();
        libro3.returnBook();
        libro3.getBook();

        System.out.println("********************");
        libro1.showInfo();
        System.out.println("********************");
        libro2.showInfo();
        System.out.println("********************");
        libro3.showInfo();
        System.out.println("********************");
        }
}
