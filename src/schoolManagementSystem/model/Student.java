package schoolManagementSystem.model;

import schoolManagementSystem.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {

       private UUID id ;
       private String name ;
       private String surName ;
       private Integer gradeLevel ;

       private List<Course> enrolledCourses=new ArrayList<>() ;


    public Student(String name, String surName, Integer gradeLevel) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.surName = surName;
        this.gradeLevel = gradeLevel;

    }
    public void enrollCourse(Course course){
         this.enrolledCourses.add(course) ;
         course.addStudent(this);
        System.out.println(course.getCourseName() + " Lesson" + name + " added student");
    }



    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public List<Course> getCourseList() {
        return enrolledCourses;
    }

    public void setCourseList(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + getName() + '\'' +
                ", lastName='" + getSurName() + '\'' +
                ", grade=" + getGradeLevel() +
                '}';
    }
}
