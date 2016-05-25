package org.jsanz.cursosapp.controller;

import org.jsanz.cursosapp.domain.Course;
import org.jsanz.cursosapp.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Courses controller. Temp.
 */
@Component
@Path("/courses")
public class CoursesController {
    @Autowired
    private CoursesService coursesService;

    @GET
    @Produces("application/json")
    public List<Course> getActiveCourses() {
        return coursesService.getAllActiveCourses();
    }
}
