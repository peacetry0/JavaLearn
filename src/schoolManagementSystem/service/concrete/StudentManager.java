package schoolManagementSystem.service.concrete;

import schoolManagementSystem.model.Student;
import schoolManagementSystem.service.abstracts.IStudentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentManager implements IStudentManager {

    private List<Student> studentList = new ArrayList<>() ;

    @Override
    public void addStudent(Student student) {

         studentList.add(student) ;
        System.out.println("Student Added " + student.getName().concat(" " + student.getSurName()));

    }

    @Override
    public void deleteStudent(UUID studentId) {

         studentList.removeIf(student -> student.getId().equals(studentId)) ;
        System.out.println("Student deleted success ");
    }

    @Override
    public void updateStudent(UUID studentId, String newName, String newSurname, Integer newGradeLevel) {

        for (Student student : studentList) {
            if (student.getId().equals(studentId)) {
                student.setName(newName);
                student.setSurName(newSurname);
                student.setGradeLevel(newGradeLevel);
                System.out.println("Öğrenci başarıyla güncellendi.");
                displayInfo(studentId);
                return;
            }
        }
        System.out.println("Öğrenci bulunamadı.");


    }

    public void displayInfo(UUID studentId) {
        for (Student student : studentList) {
            if (student.getId().equals(studentId)) {
                System.out.println(student);
                break;
            }
        }
    }

    public void getAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }


}
