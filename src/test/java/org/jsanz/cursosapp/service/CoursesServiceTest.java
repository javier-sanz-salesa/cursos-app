package org.jsanz.cursosapp.service;

import org.jsanz.cursosapp.config.DataConfiguration;
import org.jsanz.cursosapp.domain.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Integration test for CoursesService
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CoursesServiceImpl.class, DataConfiguration.class})
public class CoursesServiceTest {
    @Autowired
    private CoursesService serviceUnderTest;

    @Test
    public void test() {
        List<Course> allActiveCourses = serviceUnderTest.getAllActiveCourses();
        System.out.println("allActiveCourses = " + allActiveCourses);
    }
}
