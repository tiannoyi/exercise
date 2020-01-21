package com.qf.exercise.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.exercise.user.mapper")
public class ExerciseUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseUserApplication.class, args);
    }

}
