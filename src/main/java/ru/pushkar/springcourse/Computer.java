package ru.pushkar.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Computer {
    private ArcadeGame arcadeGame;
    private StrategyGame strategyGame;
    private EctionGame ectionGame;
@Autowired
    public Computer(ArcadeGame arcadeGame, StrategyGame strategyGame, EctionGame ectionGame) {
        this.arcadeGame = arcadeGame;
        this.strategyGame = strategyGame;
        this.ectionGame = ectionGame;
    }

    public String playGame(){
    return "Playing: " +arcadeGame.getPlay();


    }
}
