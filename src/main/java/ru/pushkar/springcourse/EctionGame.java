package ru.pushkar.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EctionGame implements Game{
    private List<String> gameList=new ArrayList<String>();

    public String getPlay() {
        gameList.add("Call of Duty");
        gameList.add("Battlefield");
        gameList.add("Overwatch");

        return gameList.get((int) (Math.random()*3));
    }}
