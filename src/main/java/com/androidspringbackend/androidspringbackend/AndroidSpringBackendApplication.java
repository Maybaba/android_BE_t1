package com.androidspringbackend.androidspringbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.androidspringbackend.androidspringbackend")
public class AndroidSpringBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndroidSpringBackendApplication.class, args);
    }

}
