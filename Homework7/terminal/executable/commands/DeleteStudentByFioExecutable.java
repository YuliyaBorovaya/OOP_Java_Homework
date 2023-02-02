package Homework7.terminal.executable.commands;

import Homework4.data.Student;
import Homework4.service.user.DataService;
public class DeleteStudentByFioExecutable implements CommandExecutable {
    private DataService<Student> studentService;
    private String studentFio;
    private Student student;
    
    public DeleteStudentByFioExecutable(DataService<Student> studentService, String fio) {
        this.studentService = studentService;
        this.studentFio = fio;
    }
    @Override
    public boolean execute() {
        student = studentService.findByFio(studentFio);
        if (student == null) {
            return false;
        } else {
            studentService.DeleteUser(student);
            return true;
        }
    }
}
