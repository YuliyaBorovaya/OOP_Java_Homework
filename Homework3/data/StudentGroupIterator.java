package Homework3.data;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup studentGroup;
    private Iterator<Student> students;
   
    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.students = studentGroup.getStudentList().iterator();
    }

    @Override
    public boolean hasNext() {
        return this.students.hasNext();
    }

    @Override
    public Student next() {
        return this.students.next();
    }
    public void remove(){
        this.students.remove();
    }
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }   
}

