package ru.pushkar.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ArcadeGame implements Game {

    public String getPlay() {
        return "Mario";
    }
}
