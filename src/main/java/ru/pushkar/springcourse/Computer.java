package ru.pushkar.springcourse;

public class Computer {
    private Game game;
    public Computer(Game game){
        this.game=game;
    }
    public void playGame(){
        System.out.println("Playing: " +game.getPlay());
    }
}
