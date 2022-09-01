package alpha.command;

import alpha.AlphaException;
import alpha.FileOperations;
import alpha.TaskList;
import alpha.Ui;

public class Find extends Command {

    /** Keyword to filter the list of tasks */
    private String keyword;

    /**
     * Constructor to initialise the global variables.
     *
     * @param keyword To initialise the keyword to filter the list of tasks.
     */
    public Find(String keyword) {
        this.keyword = keyword;
    }

    /**
     * {@inheritDoc}
     *
     * Finds all tasks that contains the keyword.
     */
    @Override
    public void execute(TaskList taskList, Ui uI, FileOperations fileOperations) throws AlphaException {
        (new TaskList(taskList.filterTaskDescription(keyword))).printTasks(uI);
    }
}
