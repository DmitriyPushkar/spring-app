package ru.pushkar.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArcadeGame implements Game {

    private List<String> gameList=new ArrayList<String>();

    public String getPlay() {
        gameList.add("Mario");
        gameList.add("Sonic");
        gameList.add("Pacman");

        return gameList.get((int) (Math.random()*3));
    }
}
