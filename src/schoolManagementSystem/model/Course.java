package schoolManagementSystem.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Course {

     private UUID courseId ;
     private String courseName ;
     private Integer credit ;
     private Teacher teacher ;
     private List<Student> studentEnrolled = new ArrayList<>() ;

    public Course( String courseName, Integer credit) {
        this.courseId = UUID.randomUUID();
        this.courseName = courseName;
        this.credit = credit;


    }
    public void addStudent(Student student){
        this.studentEnrolled.add(student) ;
        System.out.println(student.getName() + "added to course");
    }

    public UUID getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return studentEnrolled;
    }

    public void setStudents(List<Student> studentEnrolled) {
        this.studentEnrolled = studentEnrolled;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", name='" + courseName + '\'' +
                ", credits=" + credit +
                ", students=" + (studentEnrolled != null ? studentEnrolled.size() : 0) +
                ", teacher=" + (teacher != null ? teacher.getName() + " " + teacher.getSurName() : "None") +
                '}';
    }
}
