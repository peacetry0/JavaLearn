package schoolManagementSystem;

import schoolManagementSystem.model.Course;
import schoolManagementSystem.model.Department;
import schoolManagementSystem.model.Student;
import schoolManagementSystem.model.Teacher;
import schoolManagementSystem.service.concrete.CourseManager;
import schoolManagementSystem.service.concrete.DepartmentManager;
import schoolManagementSystem.service.concrete.StudentManager;
import schoolManagementSystem.service.concrete.TeacherManager;



public class Main {
    public static void main(String[] args) {

        CourseManager courseManager = new CourseManager();
        DepartmentManager departmentManager = new DepartmentManager();
        StudentManager studentManager = new StudentManager();
        TeacherManager teacherManager = new TeacherManager();

        Teacher teacher1 = new Teacher("John", "Doe");
        Teacher teacher2 = new Teacher("Jane", "Smith");
        Teacher teacher3 = new Teacher("Jim", "Brown");
        Teacher teacher4 = new Teacher("Jessica", "Jones");
        Teacher teacher5 = new Teacher("Jake", "White");
        Course course1 = new Course("Mathematics", 3);
        Course course2 = new Course("Physics", 4);
        Course course3 = new Course("Chemistry", 3);
        Course course4 = new Course("Biology", 2);
        Course course5 = new Course("English Literature", 3);
        Department department1 = new Department("Mathematics Department");
        Department department2 = new Department("Science Department");
        Department department3 = new Department("Literature Department");
        Department department4 = new Department("Arts Department");
        Department department5 = new Department("Physical Education Department");
        Student student1 = new Student("Alice", "Wonderland", 1);
        Student student2 = new Student("Bob", "Marley", 2);
        Student student3 = new Student("Charlie", "Brown", 3);
        Student student4 = new Student("David", "Bowie", 4);
        Student student5 = new Student("Eve", "Adams", 1);

        teacherManager.addTeacher(teacher1);
        teacherManager.addTeacher(teacher2);
        teacherManager.addTeacher(teacher3);
        teacherManager.addTeacher(teacher4);
        teacherManager.addTeacher(teacher5);
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        courseManager.addCourse(course3);
        courseManager.addCourse(course4);
        courseManager.addCourse(course5);
        departmentManager.addDepartment(department1);
        departmentManager.addDepartment(department2);
        departmentManager.addDepartment(department3);
        departmentManager.addDepartment(department4);
        departmentManager.addDepartment(department5);
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);
        studentManager.addStudent(student5);


       course1.setTeacher(teacher1);
        course2.setTeacher(teacher2);
        course3.setTeacher(teacher3);
        course4.setTeacher(teacher4);
        course5.setTeacher(teacher5);
        department1.addCourse(course1);
        department2.addCourse(course2);
        department2.addCourse(course3);
        department3.addCourse(course5);
        department4.addCourse(course4);
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);
        student3.enrollCourse(course3);
        student4.enrollCourse(course4);
        student5.enrollCourse(course5);


        studentManager.getAllStudent();
        courseManager.getAllCourse();
        teacherManager.getAllTeacher();
        departmentManager.getAllDepartments();
        studentManager.displayInfo(student1.getId());
        courseManager.displayInfoCourse(course1.getCourseId());
        departmentManager.displayInfoDepartment(department1.getDepartmentId());



    }
}
