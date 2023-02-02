package Homework5.src.terminal;

import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private CommandExecutableFactory commandExecutableFactory;

    public static TerminalReader getInstance(CommandParser commandParser,
            CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }

    public void listenerCommand() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String command = sc.nextLine();
            Command comList = commandParser.parseCommand(command);
            CommandExecutable commandExecutable = commandExecutableFactory.create(comList);
            commandExecutable.execute();
        }

    }
}
