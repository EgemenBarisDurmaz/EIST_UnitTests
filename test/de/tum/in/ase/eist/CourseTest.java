package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseTest {

    // TODO 1: Test getCourseTitle()
    @Test
    void testGetCourseTitle() {
        Course expected = new Course("EIST");
        String observed = expected.getTitle();
        assertEquals("EIST", observed);
    }

    // TODO 2: Test getNumberOfAttendees()
    @Test
    void testNoAttendees() {
        Course course = new Course("EIST");
        List<Student> attendee = new ArrayList<>();
        course.setAttendees(attendee);
        if (0 != course.getNumberOfAttendees()) {
            throw new IllegalArgumentException("Failed");
        }
        //assertEquals(0, course.getAttendees().size());
    }

    @Test
    void testThreeAttendees() {
        Course course = new Course("EIST");
        List<Student> attendee = new ArrayList<>();
        Student s1 = new Student("Ege", "Dur", "13/03/1990", "Informatik", "BWL");
        Student s2 = new Student("John", "Sparrow", "1/03/1990", "Informatik", "BWL");
        Student s3 = new Student("Emma", "Lena", "10/03/1990", "Informatik", "BWL");
        attendee.add(s1);
        attendee.add(s2);
        attendee.add(s3);
        course.setAttendees(attendee);
        if (3 != course.getNumberOfAttendees()) {
            throw new IllegalArgumentException("Failed");
        }
        //assertEquals(3, course.getAttendees().size());
    }
}
