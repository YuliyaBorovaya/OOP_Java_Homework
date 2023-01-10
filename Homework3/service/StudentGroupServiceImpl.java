package Homework3.service;

import java.util.Collections;
import java.util.Iterator;

import Homework3.data.Student;
import Homework3.data.StudentGroup;
import Homework2.util.ReaderFromTxt;
import Homework2.util.WriterToTxt;

public class StudentGroupServiceImpl implements DataServiceGroup {
    private StudentGroup studentGroup;

    public StudentGroupServiceImpl(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    @Override
    public StudentGroup readGroup(int groupNumber) {
        return ReaderFromTxt.readGroup(groupNumber);       
    }
    @Override
    public void createGroup(int groupNumber) {
        WriterToTxt.writeGroup(new StudentGroup(groupNumber));
    }

    public void removeStudent(String fio) {
        Iterator<Student> iterator = getStudentGroup().iterator();
        while(iterator.hasNext()){
            if(iterator.next().getFio().equals(fio)){
                iterator.remove();
            }
        }
    }

    public void sortStudent(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList()); 
    }
}

