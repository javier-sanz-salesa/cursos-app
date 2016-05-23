package org.jsanz.cursosapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Spring boot application entry point
 */
@SpringBootApplication
public class CursosApplication {
    public static void main(String[] args) {
        //SpringApplication.run(CursosApplication.class, args);

        SpringApplicationBuilder builder = new SpringApplicationBuilder(CursosApplication.class);
        builder.headless(false);
        builder.run(args);
    }
}
