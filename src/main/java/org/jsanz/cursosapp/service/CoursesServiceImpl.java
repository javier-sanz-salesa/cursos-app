package org.jsanz.cursosapp.service;

import org.jsanz.cursosapp.controller.error.GenericApplicationException;
import org.jsanz.cursosapp.domain.Course;
import org.jsanz.cursosapp.domain.CourseSpeaker;
import org.jsanz.cursosapp.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation.
 */
@Service("coursesService")
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    private CourseMapper courseMapper;

    /**
     * Get all active courses.
     *
     * @return A list of the active courses.
     */
    @Override
    public List<Course> getAllActiveCourses() throws GenericApplicationException {
        try {
            return courseMapper.selectAllCourses();
        } catch (Throwable t) {
            throw new GenericApplicationException(500, "internal_server_error");
        }
    }

    /**
     * Get all active course speakers.
     *
     * @return A list of course speakers.
     */
    @Override
    public List<CourseSpeaker> getAllCourseSpeakers() throws GenericApplicationException {
        try {
            return courseMapper.selectAllCourseSpeakers();
        } catch (Throwable t) {
            throw new GenericApplicationException(500, "internal_server_error");
        }
    }

    /**
     * Add a new course.
     *
     * @param course The new course
     * @return <code>true</code> if the insertion is correct; <code>false</code> otherwise.
     */
    @Override
    public boolean saveCourse(Course course) throws GenericApplicationException {
        try {
            return courseMapper.insertCourse(course) == 1;
        } catch (Throwable t) {
            throw new GenericApplicationException(500, "internal_server_error");
        }
    }
}
