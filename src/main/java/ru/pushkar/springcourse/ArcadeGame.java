package ru.pushkar.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ArcadeGame implements Game {
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroy");
    }
    public String getPlay() {
        return "Mario";
    }
}
