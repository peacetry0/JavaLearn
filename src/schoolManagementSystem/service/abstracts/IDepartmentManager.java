package schoolManagementSystem.service.abstracts;

import schoolManagementSystem.model.Course;
import schoolManagementSystem.model.Department;
import schoolManagementSystem.model.Student;
import schoolManagementSystem.model.Teacher;

import java.util.List;
import java.util.UUID;

public interface IDepartmentManager {
    void addDepartment(Department department)  ;
    void deleteDepartment(UUID departmentId) ;
    void updateDepartment(UUID departmentId, String newDepartmentName, List<Course> courses) ;
    void displayInfoDepartment(UUID departmentId) ;
    void getAllDepartments() ;
}
