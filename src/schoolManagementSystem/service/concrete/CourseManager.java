package schoolManagementSystem.service.concrete;

import schoolManagementSystem.model.Course;
import schoolManagementSystem.model.Student;
import schoolManagementSystem.model.Teacher;
import schoolManagementSystem.service.abstracts.ICourseManager;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CourseManager implements ICourseManager {

     private List<Course> courseList = new ArrayList<>() ;


    @Override
    public void addCourse(Course course) {
        courseList.add(course) ;
        System.out.println("Course added " + course.getCourseName() );
    }

    @Override
    public void deleteCourse(UUID courseId) {
           courseList.removeIf(course -> course.getCourseId().equals(courseId));
        System.out.println("Course deleted Success");
    }

    @Override
    public void updateCourse(UUID courseId, String newCourseName, Integer credit, List<Student> students, Teacher teacher) {

           for (Course course : courseList){
               if (course.getCourseId().equals(courseId)){

                   course.setCourseName(newCourseName);
                   course.setCredit(credit);
                   course.setStudents(students);
                   course.setTeacher(teacher);
                   displayInfoCourse(courseId);
                   return;
               }
           }
        System.out.println("Course is not found");
    }

    public void displayInfoCourse(UUID courseId) {
        for (Course course : courseList) {
            if (course.getCourseId().equals(courseId)) {
                System.out.println(course);
                break;
            }
        }
    }

    public void getAllCourse() {
        for (Course course : courseList) {
            System.out.println(course);
        }
    }
}
