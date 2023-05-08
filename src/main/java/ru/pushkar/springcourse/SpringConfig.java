package ru.pushkar.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:computer.properties")
public class SpringConfig {
    @Bean
    public ArcadeGame arcadeGame(){
        return new ArcadeGame();
    }
    @Bean
    public EctionGame ectionGame(){
        return new EctionGame();
    }
    @Bean
    public StrategyGame strategyGame(){
        return new StrategyGame();
    }
    @Bean
    public Computer computer(){
        return new Computer(arcadeGame(),ectionGame(),strategyGame());
    }
    @Bean
    public Car car(){
        return new Car(computer());
    }
}
