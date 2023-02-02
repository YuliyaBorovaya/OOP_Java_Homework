package Homework5.src.terminal.executable;

import Homework4.data.Student;
import Homework4.service.user.StudentService;
import terminal.Command;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    private StudentService studentService;

    @Override
    public CommandExecutable create(Command input) {
            if(input.isCreateCommand()){
                return new CreateStudentExecutable(studentService, new Student(input.getFirstArgument()));
            } else if (input.isDeleteCommand()){
                return new DeleteStudentExecutable(studentService, new Student(input.getFirstArgument()));
            }
            return null;

         
    }
}

