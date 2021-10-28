package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    // Student Prefix definitions
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");

    // TutorialClass Prefix definitions
    public static final Prefix PREFIX_CLASSCODE = new Prefix("c/");
    public static final Prefix PREFIX_SCHEDULE = new Prefix("s/");

    // TutorialGroup Prefix definitions
    public static final Prefix PREFIX_GROUPNAME = new Prefix("gn/");
    public static final Prefix PREFIX_TYPE = new Prefix("type/");
}
