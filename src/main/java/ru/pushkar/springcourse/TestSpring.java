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
//        Car car=context.getBean("car", Car.class);
//        System.out.println(car);
        Computer computer=context.getBean("computer", Computer.class);
        System.out.println(computer.getName());
        System.out.println(computer.getPower());
        ArcadeGame arcadeGame1=context.getBean("arcadeGame", ArcadeGame.class);

        context.close();
    }
}
