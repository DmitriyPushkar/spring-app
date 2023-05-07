package ru.pushkar.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private int id;
    private Computer computer;
    @Autowired

    public Car(Computer computer){
        this.id=1;
        this.computer=computer;
    }

    @Override
    public String toString() {
        return "Car " + id+ " " + computer.playGame(GameGenre.Arcade);
    }
}
