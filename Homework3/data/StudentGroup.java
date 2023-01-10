package Homework3.data;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private Teacher teacher;
    private List<Student> studentList;
    private int groupNumber;

    public StudentGroup(List<Student> studentList, int groupNumber) {
        this.studentList = studentList;
        this.groupNumber = groupNumber;
    }

    public StudentGroup(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public Iterator<Student> iterator() { 
        return new StudentGroupIterator(this);                                                                                   
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

}

