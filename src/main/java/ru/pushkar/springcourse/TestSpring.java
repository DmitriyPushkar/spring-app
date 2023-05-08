package ru.pushkar.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer=context.getBean("computer", Computer.class);
        System.out.println(computer.getName());
        System.out.println(computer.getPower());
        ArcadeGame arcadeGame1=context.getBean("arcadeGame", ArcadeGame.class);

        context.close();
    }
}
