package com.zs.work.learnjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zs.work.learnjpa"})
public class LearnjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnjpaApplication.class, args);
    }

}

