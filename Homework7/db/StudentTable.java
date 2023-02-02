package Homework7.db;

import Homework4.data.Student;
public class StudentTable extends Table<Student> {
    public boolean removeByName(String name) {
        for (Student student : elements) {
            if(student.getFio().equals(name)){
                elements.remove(student);
                return true;
            }
        }
        return false;
    }
    public Student findByFio(String name) {
        for (Student student : elements) {
            if(student.getFio().equals(name)){
                return student;
            }
        }
        return null;
    }

    public Student findByBirth(Integer year) {
        for (Student student : elements) {
            if(student.getBirthday() == year){
                return student;
            }
        }
        return null;
    }


}
