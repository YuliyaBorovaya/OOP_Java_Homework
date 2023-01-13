package Homework4.service.user;

import Homework4.data.Teacher;
import Homework4.repository.TeacherRepository;
import Homework4.util.ReaderFromTxt;
import Homework4.util.WriterToTxt;

public class TeacherService implements DataService<Teacher>{
    private TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    public void saveTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }
    public Teacher findTeacherById(int id) { 
        return teacherRepository.findById(id);        
    }
    public Teacher findTeacherByFio(String fio) {
        return teacherRepository.findByFio(fio);
    }
    @Override
    public void create(Teacher user) {
        WriterToTxt.write(user);
    }
    @Override
    public Teacher read(Teacher user) {
        return ReaderFromTxt.read(user);
    }
    
}
