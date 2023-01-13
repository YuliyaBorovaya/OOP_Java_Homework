package Homework4.Controller;

import Homework4.data.Teacher;
import Homework4.service.user.TeacherService;

public class TeacherController implements UserController<Teacher, Integer> {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher create(Teacher item) {
        teacherService.create(item);
        return teacherService.read(item);
        
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherService.findTeacherById(id);
    }

    @Override
    public Teacher findByFio(String fio) {
        return teacherService.findTeacherByFio(fio);
    }

    @Override
    public void save(Teacher entity) {
        teacherService.saveTeacher(entity);
    }
    
}
