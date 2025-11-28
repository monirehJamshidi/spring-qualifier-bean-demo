package org.j2os;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "X6")
    public Car bmw(){
        return new BMW();
    }

    @Bean(name = "cerato")
    public Car kia(){
        return new Kia();
    }

    @Bean
    @Scope("prototype") // هر بار getBean یک Manager جدید می‌سازد
    public Manager manager(@Qualifier("cerato") Car car){
        return new Manager(car);
    }
}
