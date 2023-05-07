package ru.pushkar.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        Game game = context.getBean("arcadeGame", ArcadeGame.class);
//        Computer computer=new Computer(game);
//        computer.playGame();
//        Game game2=context.getBean("ectionGame", EctionGame.class);
//        Computer ectionGameComputer=new Computer(game2);
//        ectionGameComputer.playGame();
//        Computer computer =context.getBean("computer",Computer.class);
//        computer.playGame();
        Computer computer=context.getBean("computer", Computer.class);
        System.out.println(computer.playGame(GameGenre.Arcade));
        System.out.println(computer.playGame(GameGenre.Strategy));
        System.out.println(computer.playGame(GameGenre.Ection));

        context.close();
    }
}
