package ru.pushkar.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Computer {
 private Game game1;
 public Game game2;
@Autowired
    public Computer(@Qualifier("ectionGame") Game game1, @Qualifier("strategyGame") Game game2) {
        this.game1 = game1;
        this.game2 = game2;
    }

    public String playGame(){
    return "Playing: " +game1.getPlay()+" , "+ game2.getPlay();


    }
}
