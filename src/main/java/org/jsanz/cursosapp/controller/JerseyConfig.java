package org.jsanz.cursosapp.controller;

import org.glassfish.jersey.server.ResourceConfig;
import org.jsanz.cursosapp.controller.error.CustomExceptionMapper;
import org.springframework.context.annotation.Configuration;

/**
 * Jersey configuration
 */
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerClasses(CoursesController.class, CustomExceptionMapper.class);
    }
}
