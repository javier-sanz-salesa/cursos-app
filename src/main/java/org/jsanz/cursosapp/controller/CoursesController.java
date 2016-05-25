package org.jsanz.cursosapp.controller;

import org.jsanz.cursosapp.controller.error.GenericApplicationException;
import org.jsanz.cursosapp.domain.Course;
import org.jsanz.cursosapp.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import java.util.List;

/**
 * Courses controller. Temp.
 */
@Component
@Path("/courses")
public class CoursesController {
    // The courses service
    @Autowired
    private CoursesService coursesService;

    /**
     * Get all active courses.
     *
     * @return
     */
    @GET
    @Produces("application/json")
    public List<Course> getActiveCourses() {
        return coursesService.getAllActiveCourses();
    }

    /**
     * Save a new course.
     *
     * @param course The new course
     * @return The number of rows affected
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public void saveCourse(Course course) throws Exception {
        try {
            boolean ok = coursesService.saveCourse(course);

            if (!ok) {
                throw new GenericApplicationException("Could not add the course");
            }
        } catch (Throwable t) {
            System.out.println("t = " + t);
            throw new GenericApplicationException("internal server error", t);
        }
    }
}
