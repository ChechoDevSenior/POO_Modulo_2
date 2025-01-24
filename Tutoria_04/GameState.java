package Tutoria_04;

public class GameState {
    //Patron de diseño Singleton
    private static GameState instance;

    private int score;
    private int level;

    private GameState(int score, int level) {
        this.score = 0;
        this.level = 1;
    }
    public static GameState getInstance(){
        if(instance == null){
            instance = new GameState(0, 0);
        } 
        return instance;
    }

    //Getters and setters
    public int getScore(){
        return this.score;
    }
    public void setScore (int score){
        this.score = score;
    }

    
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    

}
