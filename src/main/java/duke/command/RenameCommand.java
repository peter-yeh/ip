package duke.command;

import java.util.List;

import duke.utils.DukeException;
import duke.utils.DukeFileHandler;
import duke.utils.TaskList;
import duke.utils.Ui;


public class RenameCommand extends Command {
    protected static List<String> aliases;
    private final Command command;
    private final String newKeyword;

    public RenameCommand(Command command, String newKeyword) {
        this.command = command;
        this.newKeyword = newKeyword;
    }


    @Override
    public void execute(TaskList tasks, Ui ui, DukeFileHandler fileHandler) throws DukeException {
        // todo get the alias list from the command class
        // todo add the new keyword inside
    }


}
