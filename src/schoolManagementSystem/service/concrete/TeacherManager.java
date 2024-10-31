package schoolManagementSystem.service.concrete;

import schoolManagementSystem.model.Course;
import schoolManagementSystem.model.Department;
import schoolManagementSystem.model.Teacher;
import schoolManagementSystem.service.abstracts.ITeacherManager;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TeacherManager implements ITeacherManager {

    private List<Teacher> teacherList = new ArrayList<>() ;
    @Override
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher) ;
        System.out.println("Teacher added " + teacher.getName().concat(" " +  teacher.getSurName()) );
    }

    @Override
    public void deleteTeacher(UUID teacherId) {
          teacherList.removeIf(teacher -> teacher.getId().equals(teacherId)) ;
        System.out.println("Teacher deleted Success");
    }

    @Override
    public void updateTeacher(UUID teacherId, String newName, String newSurname, Department department, List<Course> assignedCourses) {

         for (Teacher teacher : teacherList){
             if (teacher.getId().equals(teacherId)){
                 teacher.setName(newName);
                 teacher.setSurName(newSurname);
                 teacher.setDepartment(department);
                 teacher.setAssignedCourses(assignedCourses);
                 displayInfoTeacher(teacherId);
                 return;
             }
         }
        System.out.println("Teacher is not found");
    }

    @Override
    public void displayInfoTeacher(UUID teacherId) {
        for (Teacher teacher : teacherList){
            if (teacher.getId().equals(teacherId)){
                System.out.println("ID : " +  teacher.getId() +
                        " Course Name : " + teacher.getName() +
                        " Teacher Department : "  + teacher.getDepartment() +
                        "Assigned Course : " + teacher.getAssignedCourses()) ;

            }
        }
    }

    public void getAllTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }
}
