package Homework5.src.terminal;

import java.util.List;

public class Command {
    private static final String ADD = "/add"; 
    private static final String DEL = "/delete";

    private List<String> arguments;
    private String mainCommand;

    public String getFirstArgument(){
        return arguments.get(0);
    }


    public boolean isCreateCommand(){
        return (mainCommand.equals(ADD));
    }

    public boolean isDeleteCommand(){
        return (mainCommand.equals(DEL));
    }

}