package Clase_01;

public class book {
    
    String title;
    String author;
    int year;
    String gender;
    boolean isBusy;

    public book (){
        title = "Sin titulo";
        author = "N/A";
        year = 0;
        gender =  "N/A";
        isBusy =  false;
    }
    public book(String title, String author, int year, String gender, Boolean isBusy){
        this.title = title;
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.isBusy = isBusy;

    }
    public book(String title, String author, int year, String gender){
        this.title = title;
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.isBusy =  false;
    }
    public void showInfo (){
        System.out.println("Titlle: "+title);
        System.out.println("Author: "+author);
        System.out.println("Year: "+year);
        System.out.println("Gender: "+gender);
        System.out.println("Is Busy: "+isBusy);
    }
     public void getBook (){
        if (!isBusy) {
            isBusy = true;
            System.out.println("El libro: "+ title +" ha sido prestado.");
        } else {
            System.out.println("El libro: "+ title +" ya esta prestado.");
        }
     }
     public void returnBook (){
        if (isBusy) {
            isBusy = false;
            System.out.println("El libro: "+ title +" ha sido devuelto.");
        } else {
            System.out.println("El libro: "+ title +" no esta prestado.");
        }
     }

}
