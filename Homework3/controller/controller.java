package Homework3.controller;

import java.util.List;

import Homework3.data.GroupStream;
import Homework3.data.Student;
import Homework3.data.StudentGroup;
import Homework2.data.Teacher;
import Homework2.service.DataService;
import Homework2.service.DataServiceGroup;
import Homework3.service.DataServiceStream;
import Homework3.service.GroupStreamServiceImpl;
import Homework3.service.StudentGroupServiceImpl;

public class controller {
    private DataService dataService;
    private DataServiceGroup dataServiceGroup;
    private StudentGroupServiceImpl studentGroupServiceImpl;
    private DataServiceStream dataServiceStream;

    public Controller(StudentGroupServiceImpl studentGroupServiceImpl) {
        this.studentGroupServiceImpl = studentGroupServiceImpl;
    }

    public Controller(DataService dataService) {
        this.dataService = dataService;
    }

    public Controller() {
    }
    public Student createStudent(Student student){
        dataService.create(student);
        return (Student) dataService.read(student);
    }
    public Teacher createTeacher(Teacher teacher){
        dataService.create(teacher);
        return (Teacher) dataService.read(teacher);
    }
    public StudentGroup createGroup(int groupNumber){
        dataServiceGroup.createGroup(groupNumber);
        return dataServiceGroup.readGroup(groupNumber);
    }
    public void removeStudent(String fio) {
        studentGroupServiceImpl.removeStudent(fio);
    }
    public void sortStudent(StudentGroup studentGroup) {
        studentGroupServiceImpl.sortStudent(studentGroup);
    }
    public void sortStream(List<GroupStream> streams){
        dataServiceStream.sortStream(streams);;
    }
}

