package Homework7.terminal.executable.commands;

import Homework4.data.Student;
import Homework4.service.user.DataService;
public class PrintStudentExecutable implements CommandExecutable{
    private DataService<Student> studentService;
    
    public PrintStudentExecutable(DataService<Student> studentService) {
        this.studentService = studentService;
    }
    @Override
    public boolean execute() {
        studentService.printList();
        return true;
    }
    
}
