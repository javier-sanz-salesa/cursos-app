package org.jsanz.cursosapp.service;

import org.jsanz.cursosapp.domain.Course;
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
    public List<Course> getAllActiveCourses() {
        return courseMapper.selectAllCourses();
    }

    /**
     * Add a new course.
     *
     * @param course The new course
     * @return <code>true</code> if the insertion is correct; <code>false</code> otherwise.
     */
    @Override
    public boolean saveCourse(Course course) {
        return courseMapper.insertCourse(course) == 1;
    }
}
