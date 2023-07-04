package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

	// TODO 1: Test getCourseTitle()
    @Test
    void stringtestGetCourseTitle() {
    Course expected = new Course("EIST");
    String observed = expected.getTitle();
    assertEquals("EIST", observed);
    }


	// TODO 2: Test getNumberOfAttendees()

}
