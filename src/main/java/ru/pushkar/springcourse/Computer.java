package ru.pushkar.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private Game game1;
    private Game game2;
    private Game game3;

    @Autowired
    public Computer(@Qualifier("ectionGame") Game game1, @Qualifier("strategyGame") Game game2, @Qualifier("arcadeGame") Game game3) {
        this.game1 = game1;
        this.game2 = game2;
        this.game3 = game3;
    }

    public String playGame(GameGenre gameGenre) {
        if (gameGenre == GameGenre.Ection) {
            return "Playing: " + game1.getPlay();
        } else if (gameGenre == GameGenre.Strategy) {
            return "Playing: " + game2.getPlay();
        } else {
            return "Playing: " + game3.getPlay();
        }

    }
}
