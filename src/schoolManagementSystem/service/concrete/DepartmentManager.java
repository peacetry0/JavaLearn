package schoolManagementSystem.service.concrete;

import schoolManagementSystem.model.Course;
import schoolManagementSystem.model.Department;
import schoolManagementSystem.service.abstracts.IDepartmentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DepartmentManager implements IDepartmentManager {

     private List<Department> departmentList = new ArrayList<>() ;
    @Override
    public void addDepartment(Department department) {

        departmentList.add(department );

        System.out.println("Department added " + department.getDepartmentName());
    }

    @Override
    public void deleteDepartment(UUID departmentId) {
     departmentList.removeIf(department -> department.getDepartmentId().equals(departmentId)) ;
        System.out.println("Department deleted success");
    }

    @Override
    public void updateDepartment(UUID departmentId, String newDepartmentName, List<Course> courses) {

         for (Department department : departmentList){
             if (department.getDepartmentId().equals(departmentId)){
                 department.setDepartmentName(newDepartmentName);
                 department.setCourses(courses);
                 displayInfoDepartment(departmentId);
                 return;

             }
         }
        System.out.println("Department is not found");
    }

    public void displayInfoDepartment(UUID departmentId) {
        for (Department department : departmentList) {
            if (department.getDepartmentId().equals(departmentId)) {
                System.out.println(department);
                break;
            }
        }
    }

    public void getAllDepartments() {
        for (Department department : departmentList) {
            System.out.println(department);
        }
    }
}
