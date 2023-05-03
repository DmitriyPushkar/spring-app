package ru.pushkar.springcourse;

import org.springframework.stereotype.Component;

@Component

public class EctionGame implements Game{
    public String getPlay() {
        return "Call of Duty";
    }
}
