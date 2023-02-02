package Homework7.terminal.parser;

import Homework7.terminal.Command;

public interface CommandParser {
    Command parseCommand(String inputCommand);
}