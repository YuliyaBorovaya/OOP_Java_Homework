package Homework7.terminal.executable.commands;

import Homework4.data.Student;
import Homework4.service.user.DataService;
public class DeleteStudentExecutable implements CommandExecutable {
    private DataService<Student> studentService;
    private final Student student;
    public DeleteStudentExecutable(DataService<Student> studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }
    @Override
    public boolean execute() {
        studentService.DeleteUser(student);
        return true;
        
    }
}
