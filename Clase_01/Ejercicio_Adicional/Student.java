package Clase_01.Ejercicio_Adicional;

public class Student {
    
    String name;
    int age;
    float average;
    boolean approve;

    public Student(String name, int age, float average) {
        this.name = name;
        this.age = age;
        this.average = average;    
    }

    public void mostrarDetalles() {
        System.out.println("Name=" + name + ", Age=" + age + ", Average=" + average+".");   
    }

    public void esAprobado(){
        if (average >= 3) {
            approve = true;
            System.out.println("El estudiante "+name+" aprobó.");
        if (average >5){
            System.out.println("Dato invalido, vuelva a ingresar el valor del promedio.");
        }
        } else {
            System.out.println("El estudiante "+name+" NO aprobó.");
        }
    }

}
