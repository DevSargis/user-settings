package com.example.userservice;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @PostConstruct
    public void printDbUrl() {
        System.out.println("DB URL: " + System.getenv("SPRING_DATASOURCE_URL"));
    }
}
