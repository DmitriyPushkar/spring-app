package ru.pushkar.springcourse;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Game> gameList=new ArrayList<Game>();
    private Game game;
    private String name;
    private int price;

    public Game getGame() {
        return game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Computer() {
    }

    public Computer(Game game){
        this.game=game;
    }
    public void setGame(Game game){
        this.game=game;
    }
    public void playGame(){
        System.out.println("Playing: " +game.getPlay());
    }
}
