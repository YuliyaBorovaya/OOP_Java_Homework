package Homework2.Controller;

import Homework2.data.Student;
import Homework2.data.StudentGroup;
import Homework2.service.StudentGroupServiceImpl;
import Homework2.service.StudentServiceImpl;

public class Controller {
    private StudentServiceImpl studentServiceImpl;
    private StudentGroupServiceImpl studentGroupImpl;

    public Controller(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }
    public Student createStudent(Student student){
        studentServiceImpl.create(student);
        return (Student) studentServiceImpl.read(student);
    }
    public StudentGroup createGroup(int groupNumber){
        studentGroupImpl.createGroup(groupNumber);
        return studentGroupImpl.readGroup(groupNumber);
    }
}
