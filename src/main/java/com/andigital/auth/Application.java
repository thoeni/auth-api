package com.andigital.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by antoniotroina
 * on 28/10/2015.
 */
@SpringBootApplication
//@EntityScan(basePackages = {"com.andigital.auth.model"})
//@EnableJpaRepositories(basePackages = {"com.andigital.auth.dao"})
//@ComponentScan("com.andigital.auth")
//@PropertySource("classpath:application.properties")
//@EnableAutoConfiguration
public class Application {

    // Main method that starts up the Spring application context using Spring Boot.
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
