package Homework7.terminal.executable.factories;

import Homework4.data.Student;
import Homework4.service.user.DataService;
import Homework5.src.terminal.Command;
import Homework7.terminal.executable.commands.CommandExecutable;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {

    public LogingCommandExecutableFactory(DataService<Student> studentService) {
        super(studentService);
    }
    @Override
    public CommandExecutable create(Command input) {
        System.out.println(input);
        CommandExecutable result = super.create(input);
        return result;
    }
}
