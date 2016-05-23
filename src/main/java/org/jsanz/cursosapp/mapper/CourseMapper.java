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
    public int insertCourse(Course course);

    /**
     * This method retrieves all available courses.
     *
     * @return A list of {@link Course} objects.
     */
    @Select("SELECT * FROM courses")
    public List<Course> selectAllCourses();
}
