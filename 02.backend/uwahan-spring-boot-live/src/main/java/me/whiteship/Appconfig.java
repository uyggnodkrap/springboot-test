package me.whiteship;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

    @Bean
    public String myName(){
        return "aaa";
    }
}
