package Homework7.terminal.executable.factories;

import Homework4.data.Student;
import Homework4.service.user.DataService;
import Homework5.src.terminal.Command;
import Homework7.terminal.executable.commands.CommandExecutable;
import Homework7.terminal.executable.commands.CreateStudentByFioAgeGroupExecutable;
import Homework7.terminal.executable.commands.CreateStudentExecutable;
import Homework7.terminal.executable.commands.DeleteStudentByFioExecutable;
import Homework7.terminal.executable.commands.DeleteStudentByGroupAndAgeExcecutable;
import Homework7.terminal.executable.commands.PrintStudentExecutable;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    private DataService<Student> studentService;
    public CommandExecutableFactoryImpl(DataService<Student> studentService) {
        this.studentService = studentService;
    }
    @Override
    public CommandExecutable create(Command input) {
            if(input.isCreateCommand()){
                return new CreateStudentExecutable(studentService, new Student(input.getFirstArgument()));
            } else if (input.isDeleteCommand()){
                return new DeleteStudentByFioExecutable(studentService, input.getFirstArgument());
            } else if (input.isPrintCommand()){
                return new PrintStudentExecutable(studentService);
            } else if (input.isDelByGroupAndAgeCommand()){
                return new DeleteStudentByGroupAndAgeExcecutable(studentService, input.getArguments());
            } else if (input.isAddByFioGroupAgeCommand()){
                return new CreateStudentByFioAgeGroupExecutable(studentService, input.getArguments());
            }
            return null;
    }
}