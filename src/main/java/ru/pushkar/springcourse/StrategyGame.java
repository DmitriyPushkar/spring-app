package ru.pushkar.springcourse;

import org.springframework.stereotype.Component;


public class StrategyGame implements Game{
    public String getPlay() {
        return "Dota";
    }
}
