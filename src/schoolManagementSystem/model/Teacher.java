package schoolManagementSystem.model;

import schoolManagementSystem.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Teacher {

     private UUID id ;
     private String name ;
     private String surName ;
     private Department department ;
     private List<Course> assignedCourses = new ArrayList<>() ;



    public Teacher( String name, String surName) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.surName = surName;

    }

    public void assignCourse(Course course){
        this.assignedCourses .add(course) ;
        System.out.println(course.getCourseName() + "added the teacher");
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    public void setAssignedCourses(List<Course> assignedCourses) {
        this.assignedCourses = assignedCourses;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + getName() + '\'' +
                ", lastName='" + getSurName() + '\'' +
                '}';
}}
