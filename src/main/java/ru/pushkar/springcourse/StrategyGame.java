package ru.pushkar.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component

public class StrategyGame implements Game{
    private List<String> gameList=new ArrayList<String>();

    public String getPlay() {
        gameList.add("Dota");
        gameList.add("Stronghold");
        gameList.add("Warcraft 3");

        return gameList.get((int) (Math.random()*3));
    }
}
