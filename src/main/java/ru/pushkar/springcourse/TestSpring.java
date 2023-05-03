package ru.pushkar.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        Game game = context.getBean("gameBean", Game.class);
//        Computer computer=new Computer(game);
        StrategyGame game=context.getBean("gameBean", StrategyGame.class);
        System.out.println(        game.getPlay()
);
        context.close();
    }
}
