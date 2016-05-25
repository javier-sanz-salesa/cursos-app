package org.jsanz.cursosapp.service;

import org.jsanz.cursosapp.controller.error.GenericApplicationException;
import org.jsanz.cursosapp.domain.Course;

import java.util.List;

/**
 * Service interface
 */
public interface CoursesService {
    /**
     * Get all active courses.
     *
     * @return A list of the active courses.
     */
    List<Course> getAllActiveCourses() throws GenericApplicationException;

    /**
     * Add a new course.
     *
     * @param course The new course
     * @return <code>true</code> if the insertion is correct; <code>false</code> otherwise.
     */
    boolean saveCourse(Course course) throws GenericApplicationException;
}