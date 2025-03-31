package com.example.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) {
        System.out.println("🧪 Raw env: " + System.getenv("SPRING_DATASOURCE_URL"));
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
