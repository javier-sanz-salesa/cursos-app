package org.jsanz.cursosapp.controller;

import org.jsanz.cursosapp.controller.error.GenericApplicationException;
import org.jsanz.cursosapp.domain.Course;
import org.jsanz.cursosapp.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> getActiveCourses() throws GenericApplicationException {
        return coursesService.getAllActiveCourses();
    }

    /**
     * Save a new course.
     *
     * @param course The new course
     * @return The number of rows affected
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveCourse(Course course) throws GenericApplicationException {
        boolean ok = coursesService.saveCourse(course);

        if (ok) {
            return Response.status(Response.Status.CREATED).entity("New course created").build();
        } else {
            throw new GenericApplicationException(500, "Course could not be added");
        }
    }
}
