package schoolManagementSystem.service.abstracts;

import schoolManagementSystem.model.Student;

import java.util.UUID;

public interface IStudentManager {

    void addStudent(Student student)  ;
    void deleteStudent(UUID studentId) ;
    void updateStudent(UUID studentId, String newName, String newSurname, Integer newGradeLevel) ;
    void displayInfo(UUID studentId) ;
    void getAllStudent() ;
}
