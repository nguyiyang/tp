package seedu.address.logic.commands;

import seedu.address.model.Model;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_STUDENTS;

/**
 * Lists all classes in ClassMate to the user.
 */
public class ListClassCommand extends Command {
    public static final String COMMAND_WORD = "listc";

    public static final String MESSAGE_SUCCESS = "Listed all tutorial classes";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredStudentList(PREDICATE_SHOW_ALL_STUDENTS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
