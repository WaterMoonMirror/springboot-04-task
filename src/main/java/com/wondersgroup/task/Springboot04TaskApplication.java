package com.wondersgroup.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync // 开启异步方法
public class Springboot04TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04TaskApplication.class, args);
    }

}
