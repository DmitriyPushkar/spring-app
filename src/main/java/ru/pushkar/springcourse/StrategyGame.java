package ru.pushkar.springcourse;

public class StrategyGame implements Game{
    private StrategyGame(){
    };
    public static StrategyGame getStrategyGame(){
        return new StrategyGame();
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    public String getPlay() {
        return "Dota";
    }
}
