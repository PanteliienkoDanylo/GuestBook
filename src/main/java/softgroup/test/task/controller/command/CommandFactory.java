package softgroup.test.task.controller.command;


import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    public static final String COMMAND_RECORDS = "records";
    public static final String COMMAND_ADD_RECORD = "add_record";

    private static CommandFactory instance;

    private Map<String, Command> commands;

    private CommandFactory(){
        commands = new HashMap<String, Command>();
        commands.put(COMMAND_RECORDS, new CommandGetRecords());
        commands.put(COMMAND_ADD_RECORD, new CommandAddRecord());
    }

    public static CommandFactory getInstance(){
        if(instance == null){
            return new CommandFactory();
        }
        return instance;
    }

    public Command getCommands(String command){
        return commands.get(command);
    }
}
