package schoolManagementSystem.model;

import schoolManagementSystem.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Department {

    private UUID departmentId;
    private String departmentName;
    private List<Course> courses = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentId = UUID.randomUUID();
        this.departmentName = departmentName;

    }

    public void addCourse(Course course) {
        this.courses.add(course);
        System.out.println(course.getCourseName() + "added the department");
    }

    public UUID getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(UUID departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", name='" + departmentName + '\'' +
                ", courses=" + (courses != null ? courses.size() : 0) +
                '}';
    }
}