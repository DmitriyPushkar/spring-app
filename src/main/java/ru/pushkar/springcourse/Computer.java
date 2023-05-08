package ru.pushkar.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
public class Computer {
    @Value("${computer.name}")
    private String name;
    @Value("${computer.power}")
    private int power;

 private Game game1;
 private Game game2;
 private Game game3;



    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public Computer(@Qualifier("arcadeGame") Game game1, @Qualifier("ectionGame") Game game2, @Qualifier("strategyGame") Game game3) {
        this.game1 = game1;
        this.game2 = game2;
        this.game3= game3;

    }

    public String playGame(){
    return "Playing: " +game1.getPlay()+" , "+ game2.getPlay();


    }
}
