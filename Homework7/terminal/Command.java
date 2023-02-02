package Homework7.terminal;

import java.util.List;

public class Command {
    private static final String ADD = "/add"; 
    private static final String DEL = "/delete";
    private static final String PRINT = "/print";
    private static final String DELGROUPAGE = "/deleteByGroupAndAge";
    private static final String ADDFIOGROUPAGE = "/addByFioAgeGroup"; 


    private List<String> arguments;

    private String mainCommand;

    public Command(List<String> arguments, String mainCommand) {
        this.arguments = arguments;
        this.mainCommand = mainCommand;
    }
    public String getFirstArgument(){
        return arguments.get(0);
    }
    
    public boolean isCreateCommand(){
        return (mainCommand.equals(ADD));
    }
    public boolean isDeleteCommand(){
        return (mainCommand.equals(DEL));
    }
    public boolean isPrintCommand(){
        return (mainCommand.equals(PRINT));
    }

    public boolean isDelByGroupAndAgeCommand(){
        return mainCommand.equals(DELGROUPAGE);
    }

    public boolean isAddByFioGroupAgeCommand(){
        return mainCommand.equals(ADDFIOGROUPAGE);
    }

    public List<String> getArguments() {
        return arguments;
    }
}
