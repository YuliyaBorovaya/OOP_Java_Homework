package Homework7.src;

import Homework4.repository.StudentRepository;
import Homework4.service.user.StudentService;
import Homework5.src.terminal.TerminalReader;
import Homework7.terminal.executable.factories.CommandExecutableFactory;
import Homework7.terminal.executable.factories.CommandExecutableFactoryImpl;
import Homework7.terminal.parser.CommandParser;
import Homework7.terminal.parser.CommandParserImpl;
import view.MessageResult;
import Homework7.view.MessageResultImpl;

public class App {
    public static void main(String[] args){
        MessageResult messageResultImpl = new MessageResultImpl();
        StudentRepository studentRepository = new StudentRepository();
        StudentService service = new StudentService(studentRepository);
        CommandExecutableFactory factory = new CommandExecutableFactoryImpl(service);
        CommandParser parser = new CommandParserImpl();

        messageResultImpl.startMenu();
        TerminalReader.getInstance(parser, factory, messageResultImpl).listenerCommand();
    }
}
