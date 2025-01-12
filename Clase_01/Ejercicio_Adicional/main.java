package Clase_01.Ejercicio_Adicional;

public class main {
    public static void main(String[] args) {
        Student estudiante1 = new Student("Joseph Nicolás", 9, 4.2f);
        Student estudiante2 = new Student("Adriana Paola", 11, 2.7f);
        Student estudiante3 = new Student("Johan Sebastián", 14, 3.0f);
        System.out.println("**************************");
        System.out.println("**LISTADO DE ESTUDIANTES**");
        estudiante1.mostrarDetalles();
        estudiante2.mostrarDetalles();
        estudiante3.mostrarDetalles();
        System.out.println("**********************");
        estudiante1.esAprobado();
        estudiante2.esAprobado();
        estudiante3.esAprobado();
        System.out.println("**********************");
    }
}
