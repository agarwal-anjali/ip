package alpha.command;

import alpha.FileOperations;
import alpha.TaskList;
import alpha.Ui;

public class Help extends Command{

    @Override
    public void execute(TaskList tasks, Ui uI, FileOperations fileOperations) {
        uI.colouredPrint(uI.getANSI_CODE("ANSI_WHITE"), "   COMMAND \t\t" + "FORMAT");
        uI.colouredPrint(uI.getANSI_CODE("ANSI_WHITE"), "1. todo    \t\t" + "todo taskDescription");
        uI.colouredPrint(uI.getANSI_CODE("ANSI_WHITE"), "2. event   \t\t" +
                "event taskDescription /on YYYY-MM-DD");
        uI.colouredPrint(uI.getANSI_CODE("ANSI_WHITE"), "3. deadline\t\t" +
                "deadline taskDescription /by YYYY-MM-DD");
        uI.colouredPrint(uI.getANSI_CODE("ANSI_WHITE"), "4. mark    \t\t" + "mark taskNumber");
        uI.colouredPrint(uI.getANSI_CODE("ANSI_WHITE"), "5. unmark  \t\t" + "unmark taskNumber");
        uI.colouredPrint(uI.getANSI_CODE("ANSI_WHITE"), "6. delete  \t\t" + "delete taskNumber");
        uI.colouredPrint(uI.getANSI_CODE("ANSI_WHITE"), "7. list    \t\t" + "list");
    }
}
