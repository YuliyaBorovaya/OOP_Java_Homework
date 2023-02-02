package Homework7.repository;

import Homework7.data.Student;
import Homework7.db.StudentTable;
import view.MessageResult;
import Homework7.view.MessageResultImpl;
public class StudentRepository implements UserRepository<Student, Integer> {
    private StudentTable studentTable;
    private MessageResult messageResultImpl;
    public StudentRepository() {
        this.studentTable = new StudentTable();
        this.messageResultImpl = new MessageResultImpl();
    }
    
    @Override
    public Student save(Student entity) {
        studentTable.save(entity);
        return entity;
    }
    @Override
    public Student findById(Integer id) {
        return null;
    }
    @Override
    public Student findByFio(String fio) {
        return studentTable.findByFio(fio);
    }
    @Override
    public Student delete(Student entity) {
        return null;
    }

    @Override
    public Student findByBirth(Integer birthday) {
        return studentTable.findByBirth(birthday);
    }

    @Override
