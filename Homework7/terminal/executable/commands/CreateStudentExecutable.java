package Homework7.terminal.executable.commands;

import Homework4.data.Student;
import Homework4.service.user.DataService;
public class CreateStudentExecutable implements CommandExecutable {
    private final DataService<Student> studentService;
    private final Student student;
    
    public CreateStudentExecutable(DataService<Student> studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }
    @Override
    public boolean execute() {
        studentService.create(student);
        return true;
    }
}
