package org.jsanz.cursosapp.mapper;

import org.apache.ibatis.annotations.Select;
import org.jsanz.cursosapp.domain.Course;

import java.util.List;

/**
 * Mapper for SQL queries.
 */
public interface CourseMapper {
    /**
     * Insert a new course. This query is defined in the xml file.
     *
     * @param course A new course object.
     * @return The number of rows affected.
     */
    int insertCourse(Course course);

    /**
     * This method retrieves all available active courses including the speaker name.
     *
     * @return A list of {@link Course} objects.
     */
    List<Course> selectAllCourses();
}
