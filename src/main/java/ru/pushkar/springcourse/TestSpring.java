package ru.pushkar.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Game game = context.getBean("arcadeGame", ArcadeGame.class);
        Computer computer=new Computer(game);
        computer.playGame();
        Game game2=context.getBean("ectionGame", EctionGame.class);
        Computer ectionGameComputer=new Computer(game2);
        ectionGameComputer.playGame();
        context.close();
    }
}
