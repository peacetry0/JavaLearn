package schoolManagementSystem.service.abstracts;

import schoolManagementSystem.model.Course;
import schoolManagementSystem.model.Student;
import schoolManagementSystem.model.Teacher;

import java.util.List;
import java.util.UUID;

public interface ICourseManager {
    void addCourse(Course course)  ;
    void deleteCourse(UUID courseId) ;
    void updateCourse(UUID courseId, String newCourseName, Integer credit, List<Student> students, Teacher teacher) ;
    void displayInfoCourse(UUID courseId) ;
    void getAllCourse() ;
}
