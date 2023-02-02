package Homework7.terminal.executable.factories;

import Homework5.src.terminal.Command;
import Homework7.terminal.executable.commands.CommandExecutable;

public interface CommandExecutableFactory {
    CommandExecutable create(Command input);
}
