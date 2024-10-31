package schoolManagementSystem.service.abstracts;

import schoolManagementSystem.model.Course;
import schoolManagementSystem.model.Department;
import schoolManagementSystem.model.Teacher;

import java.util.List;
import java.util.UUID;

public interface ITeacherManager {
    void addTeacher(Teacher teacher)  ;
    void deleteTeacher(UUID teacherId) ;
    void updateTeacher(UUID teacherId, String newName, String newSurname, Department department, List<Course> assignedCourses) ;
    void displayInfoTeacher(UUID teacherId) ;
    void getAllTeacher() ;

}
