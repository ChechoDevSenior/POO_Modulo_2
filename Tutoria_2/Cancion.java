package Tutoria_2;

public class Cancion {
    
    int id;
    String album;
    String nombre;
    String artista;
    int duracion;
    String genero;
    int likes;

    //Crear una canción
    //Constructores
    public Cancion (){

    }
    public Cancion(String album, String nombre, String artista, int duracion, String genero){
        this.album = album;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
    }

    //Consultar el valor de los atributos
    //Getters -----> get (dame)
    public String getArtista(){
        return artista;
    }
    public String getAlabum(){
        return album;
    }
    //Por cada atributo debe de ir un Getter ...

    //setters -----> set (establecer)
    public void setArtista(String artista){
        this.artista = artista;
    }
    public boolean isValidArtista (String artista){
        //Validación
        //Si es valido
        setArtista(artista);
        return true;

        //return false;
    }
}
