package Homework4.repository;

import Homework4.data.Student;

public class StudentRepository implements UserRepository<Student, Integer> {

    @Override
    public Student save(Student entity) {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }

}
