package com.fdzc.firstproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(FirstProjectApplication.class, args);
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        System.out.println("---------------------");
        for(String name : beanDefinitionNames){
            System.out.println("name = " + name);
        }
        System.out.println("---------------------");
    }

}
